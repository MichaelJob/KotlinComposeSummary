// Images



// Iamge with painterResource loads synchronized, so the UI would be blocked - bad
Image(
    painter            = painterResource(id = R.drawable.myPic),
    contentDescription = "myImage",
    modifier           = Modifier.align(Alignment.Center)
)