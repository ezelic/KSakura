package live.shuuyu.sakura.core.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role

// TODO: Provide the default colors for this class

/**
 * Creates a switch, which acts like a boolean argument for the client.
 *
 * @param onClick
 * @param modifier
 * @param color
 * @param enabled
 * @param interactionSource
 * @param content
 *
 * @since 0.0.1
 * @author yujin
 */
@Composable
fun Switch(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    color: Color,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable() (BoxScope.() -> (Unit))
) {
    BaseSwitch(onClick, modifier, color, enabled, interactionSource, content)
}

/**
 * Creates an outlined switch, which acts like a boolean argument for the client.
 *
 * @param onClick
 * @param modifier
 * @param color
 * @param enabled
 * @param interactionSource
 * @param content
 *
 * @since 0.0.1
 * @author yujin
 */
@Composable
fun OutlineSwitch(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    color: Color,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable() (BoxScope.() -> (Unit))
) {
    BaseSwitch(onClick, modifier, color, enabled, interactionSource, content)
}

@Composable
private fun BaseSwitch(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    color: Color,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable() (BoxScope.() -> (Unit))
) {
    Box(
        modifier = Modifier.clickable(
            onClick = onClick,
            enabled = enabled,
            role = Role.Switch
        ).then(modifier)
    ) {

    }
}