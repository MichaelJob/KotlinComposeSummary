// Android - FTP upload
// with https://mvnrepository.com/artifact/it.sauronsoftware/ftp4j

// 1) in build.gradle:app

//ftp - https://mvnrepository.com/artifact/it.sauronsoftware/ftp4j
def uploadServiceVersion = "4.7.0" //check for updates
implementation "net.gotev:uploadservice:$uploadServiceVersion"
implementation "net.gotev:uploadservice-ftp:$uploadServiceVersion"


// 2) in AndroidManifest.xml :: Permissions Internet and
<uses-permission android:name="android.permission.WAKE_LOCK" />
<uses-permission android:name="android.permission.FOREGROUND_SERVICE" />


// 3) usage (in a FTPConnector.kt file for example):

import android.content.Context
import net.gotev.uploadservice.ftp.FTPUploadRequest


fun uploadFTP(
    context: Context,           // your apps context/activity
    localfilepath: String,      // the local path of the file to upload
    filename: String            // the remote filename, like "pic.jpg"
): String {
    return FTPUploadRequest(context, "ipOrHostname", 21)   // like yourdomain.ch for example
        .setUsernameAndPassword("username", "password")    // ftp user with access only to a specific folder (not root)
        .useSSL(true)
        .addFileToUpload(localfilepath, "/$filename")
        .startUpload()
}

/*
Note:

Password should not contain certain special characters like @ or $.
These characters may cause browser conflicts when used for inline URL access.
Make sure to test via cURL https://everything.curl.dev/ftp

If certain special characters are used, you have to encode the password:

"For example, the password for FTP account USER on some_ftp_server.com is P@$$WORD - so the URL for browser access is:
ftp://USER:P@$$WORD@some_ftp_server.com
Special characters (@, $) in this URL have to be hex encoded to operate without any conflicts. And the hex conversion will look as following:
ftp://USER:P%40%24%24WORD@some_ftp_server.com
where %40 is the hex value (0x40) of '@' character and %24 is the hex value (0x24) of '$' character."
(c) https://www3.trustwave.com/support/kb/article.aspx?id=14938
*/