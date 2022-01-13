// Images

// ImageBitmaps can be displayed with Image:
Image(
    bitmap             = yourImageBitmapVar,
    contentDescription = "yourDescr",
    contentScale       = ContentScale.FillHeight,
    modifier           = modifier.graphicsLayer(
                            shape = RoundedCornerShape(corner = CornerSize(8.dp)),
                            clip  = true,
                            alpha = 0.5f
                        )
)


// Image with painterResource loads synchronized, so the UI would be shortly blocked
Image(
    painter            = painterResource(id = R.drawable.myPic),
    contentDescription = "myImage",
    modifier           = Modifier.align(Alignment.Center)
)