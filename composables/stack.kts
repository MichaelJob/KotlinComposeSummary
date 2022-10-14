// a Stack is a layout container, where content ist stacked over each other
// if the stack area is bigger than it's children, one can align the contents differently to display them all or partially



// in this example two images are placed in a box - if the box is big enought in height, both images are visible. If the box is smaller or too small, then one would only see Image02
Box(
    modifier = Modifier.fillMaxSize()
        .padding(20.dp)
)
{
    Image(
        painter = painterResource(id = R.drawable.image01),
        contentDescription = "Image01",
        contentScale = ContentScale.FillWidth, // the graphic itself will scale to the with of this Image Composable
        modifier = Modifier.align(Alignment.TopCenter) // the Image Composable will be aligned to top center of the box
            .fillMaxWidth() // the Image Composable will use the max width of the partent (box)
            .shadow(4.dp)
    )
    Image(
        painter = painterResource(id = R.drawable.image02),
        contentDescription = "Image02",
        contentScale = ContentScale.FillWidth,
        modifier = Modifier.align(Alignment.BottomCenter)
            .fillMaxWidth()
            .shadow(4.dp)
    )
}