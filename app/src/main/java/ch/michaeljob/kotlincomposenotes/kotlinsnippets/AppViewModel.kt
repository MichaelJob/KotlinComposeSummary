package ch.michaeljob.kotlincomposesummary.kotlinsnippets

import android.graphics.Bitmap
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.asImageBitmap

object AppViewModel {

    var currentScreen by mutableStateOf(ScreensAsEnums.HOME)  // as example for a navigation/view state
    var currentScreenEnumFunc by mutableStateOf(ScreenEnumWithComposableFunc.HOME)  // as example for a navigation/view state
    var textinput by mutableStateOf("") // as example for a TextInputField
    var labeltext = "labeltext" // as example for a TextField/Label
    var booleanValue by mutableStateOf(false) // as example for a boolean
    var notificationMessage by mutableStateOf("notification message text")

    //small default ImageBitmap (can be replaced by async loaded Image later on and gets displayed in UI)
    var myImageBitmap by mutableStateOf(
        Bitmap.createBitmap(
            10,
            10,
            Bitmap.Config.ALPHA_8
        ).asImageBitmap()
    )

}