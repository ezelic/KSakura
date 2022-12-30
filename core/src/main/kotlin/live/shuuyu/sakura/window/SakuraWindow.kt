package live.shuuyu.sakura.window

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.input.key.KeyEvent
import androidx.compose.ui.window.FrameWindowScope
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.rememberWindowState

/**
 * Creates a window specifically made for the Sakura architecture.
 *
 * @param onCloseRequest Tells the application what to do when the user exits the application.
 * @param icon The icon displayed on your tray.
 * @param title The title of the window.
 */
@Composable
fun SakuraWindow(
    onCloseRequest: () -> Unit,
    state: WindowState = rememberWindowState(),
    icon: Painter?,
    title: String = "",
    enabled: Boolean,
    undecorated: Boolean,
    visible: Boolean,
    resizable: Boolean,
    alwaysOnTop: Boolean,
    onPreviewKeyEvent: (KeyEvent) -> Unit,
    onKeyEvent: (KeyEvent) -> Unit,
    content: @Composable FrameWindowScope.() -> Unit,
) {

}