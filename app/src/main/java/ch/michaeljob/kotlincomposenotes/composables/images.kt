import androidx.compose.foundation.Image
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import ch.michaeljob.kotlincomposenotes.R
import ch.michaeljob.kotlincomposenotes.kotlinsnippets.AppViewModel.myImageBitmap

// Images
@Composable
fun MyImages() {
    // ImageBitmaps can be displayed with Image:
    Image(
        bitmap = myImageBitmap,
        contentDescription = "yourDescr",
        contentScale = ContentScale.FillHeight,
        modifier = Modifier.graphicsLayer(
            shape = RoundedCornerShape(corner = CornerSize(8.dp)),
            clip = true,
            alpha = 0.5f
        )
    )


    // Image with painterResource loads synchronized, so the UI would be shortly blocked
    Image(
        painter = painterResource(id = R.drawable.bob),
        contentDescription = "myImage",
    )
}