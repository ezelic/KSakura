package live.shuuyu.sakura.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

/**
 * @param modifier Changes the position of the given switch.
 * @param color Changes the color to your specified color.
 * @param enabled Disables any functionality regarding the Button.
 */
@Composable
fun Switch(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    color: Color,
    enabled: Boolean = true
) {

}

/**
 * @param modifier Changes the position of the given switch.
 * @param color Changes the color to your specified color.
 * @param enabled Disables any functionality regarding the Button.
 */
@Composable
fun OutlineSwitch(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    color: Color,
    enabled: Boolean = true
) {

}