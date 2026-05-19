package whip.mobile.project

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import org.jetbrains.compose.resources.painterResource

import whip_mobile.shared.generated.resources.Res
import whip_mobile.shared.generated.resources.compose_multiplatform

import whip.mobile.project.state.Screen
import whip.mobile.project.ui.LoginScreen


@Composable
@Preview
fun App() {
    MaterialTheme {
        var screen by remember { mutableStateOf(Screen.Login) }

        when (screen) {
            Screen.Login -> LoginScreen(
                onLoginSuccess = {
                    screen = Screen.Makes
                },
                onGoToRegister = {
                    screen = Screen.Makes
                }
            )

            Screen.Register -> TODO()
            Screen.Makes -> TODO()
        }
    }
}