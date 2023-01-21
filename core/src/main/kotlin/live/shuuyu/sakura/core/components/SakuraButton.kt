package live.shuuyu.sakura.core.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.semantics.Role

// TODO: Provide the default colors for this class.

/**
 * Creates an interactable button, which executes the specified function.
 *
 * @param onClick
 * @param modifier
 * @param enabled
 * @param interactionSource
 * @param content
 *
 * @since 0.0.1
 * @author yujin
 */
@Composable
fun Button(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    color: Color,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable() (BoxScope.() -> (Unit))
) {
    BaseButton(onClick, modifier, enabled, color, interactionSource, content)
}

/**
 * An outlined interactable button. It serves the same purpose as the other button, but I guess this is different in some
 * way.
 *
 * @param onClick
 * @param modifier
 * @param enabled
 * @param interactionSource
 * @param content
 *
 * @since 0.0.1
 * @author yujin
 */
@Composable
fun OutlineButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    color: Color,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable() (BoxScope.() -> (Unit))
) {
    BaseButton(onClick, modifier, enabled, color, interactionSource, content)
}

@Composable
private fun BaseButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    color: Color,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable() (BoxScope.() -> (Unit))
) {
    Box(
        modifier.clickable(
            onClick = onClick,
            enabled = enabled,
            role = Role.Button,
        ).then(modifier)

    ) {

    }
}