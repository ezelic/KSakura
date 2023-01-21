package live.shuuyu.sakura.core.components

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun Slider(
    value: Float,
    modifier: Modifier = Modifier,
    color: Color,
    steps: Int = 0,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) {

}