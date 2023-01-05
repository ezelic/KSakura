package live.shuuyu.sakura.components

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

/**
 * Creates an interactable button, wh
 */
@Composable
fun Button(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    disabled: Boolean = false
) {
    Box(
        modifier
            .then(modifier)
    )
}