// use Androids System Back Button via BackHandler to go back to a specified screen (or do whatever it needs to do)

@Composable
fun XYZScreen(model: ABCAppModel) {
    
    //your screen content

    BackHandler(enabled = true){
        model.currentScreen = Screen.HOME
    }
}