// Android - FTP file deletion

// assure Internet Permissions

// usage (in a FTPConnector.kt file for example):

import org.apache.commons.net.ftp.FTPClient

fun removeFTP(
    filename: String
): Boolean {
    val client = FTPClient()
    client.connect(ftphost, 21)
    client.login(username, password)
    val success = client.deleteFile(filename)
    client.disconnect()
    return success
}