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