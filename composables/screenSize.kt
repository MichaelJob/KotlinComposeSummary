/*
 *  if your app should behave differently according to screensize, here for example if a keyboard shall be shown
 *  init a boolean value on setContent of your Activity
 *  https://developer.android.com/guide/topics/large-screens/support-different-screen-sizes#window_size_classes
 */

class MainActivity : ComponentActivity() {
    private lateinit var app: SbaoApp

    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        app = SbaoApp

        app.initialize(activity = this)

        setContent {
            // Calculate the window size class for the activity's current window. If the window
            // size changes, for example when the device is rotated, the value returned by
            // calculateSizeClass will also change.
            val windowSizeClass = calculateWindowSizeClass(this)
            // Perform logic on the window size class to decide whether to show the keyboard
            val shouldShowKeyboard = windowSizeClass.heightSizeClass == WindowHeightSizeClass.Expanded

            app.CreateUI(shouldShowKeyboard)
        }
    }

}