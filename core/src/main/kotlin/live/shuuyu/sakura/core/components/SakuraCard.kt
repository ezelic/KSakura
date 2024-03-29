package live.shuuyu.sakura.core.components

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusOrder

/**
 * Makes a card, which can be interactable if specified under the onClick parameter.
 *
 * @param onClick Executes a given function if specified.
 * @param modifier Adjusts the placement of the card.
 * @param type Specifies what type of card you'd like to use.
 */
@Composable
fun Card(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    type: CardType = CardType.Normal
) {
    Box() {

    }
}

enum class CardType {
    Normal,
    Compact
}