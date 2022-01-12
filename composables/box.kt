// use Box to create a UI-content container, its children are positiond on top of eachother if not elseswise specified

Box(
    contentAlignment = Alignment.Center,
    modifier         = Modifier.fillMaxSize()
) {
    Text("abc")
    Text("xyz")
}

// these two texts would overlap