package live.shuuyu.sakura.core.components

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.*

/**
 * Creates a divider with the current component.
 *
 * @param modifier Modifies the divider as a whole.
 * @param color Changes the color of the divider.
 * @param thickness Modifies the thickness of the divider
 * @param orientation Changes the orientation of the divider, either to Horizontal or vertical.
 *
 * @since 0.0.1
 * @author yujin
 */
@Composable
fun Divider(
    modifier: Modifier = Modifier,
    color: Color,
    thickness: Dp = 1.dp,
    orientation: Orientation = Orientation.Horizontal
) {
    val orientationModifier = when(orientation) {
        Orientation.Horizontal -> Modifier.height(thickness).fillMaxHeight()
        Orientation.Vertical -> Modifier.width(thickness).fillMaxWidth()
    }

    Box(
        modifier
            .then(orientationModifier)
            .background(color = color)
    )
}