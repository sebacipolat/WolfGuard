package com.cipolat.wolfguard.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.cipolat.wolfguard.app.ui.theme.Black
import com.cipolat.wolfguard.app.ui.theme.Green
import com.cipolat.wolfguard.app.ui.theme.Red
import com.cipolat.wolfguard.app.ui.theme.WolfGuardTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val viewModel: MainViewModel =
                viewModel(factory = MainViewModelFactory(this@MainActivity))

            WolfGuardTheme {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(start = 10.dp, end = 10.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Welcome()
                    IndicatorLbl(
                        message = stringResource(id = R.string.root_detection),
                        viewModel.state.isRoot.value
                    )
                    IndicatorLbl(
                        message = stringResource(id = R.string.emulator_detection),
                        viewModel.state.isEmulator.value
                    )
                    IndicatorLbl(
                        message = stringResource(id = R.string.usb_debug),
                        viewModel.state.isUsbDebug.value
                    )
                    IndicatorLbl(
                        message = stringResource(id = R.string.voip_call),
                        viewModel.state.isOnVoipCall.value
                    )

                    Button(onClick = { viewModel.checkDevice() }) {
                        Text(
                            text = stringResource(id = R.string.btn_check),
                            style = TextStyle(
                                fontSize = 18.sp,
                                color = Black,
                                fontWeight = FontWeight.SemiBold
                            ),
                            textAlign = TextAlign.Start,
                            modifier = Modifier.padding(top = 15.dp, bottom = 20.dp)
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun Welcome() {
    Text(
        text = stringResource(id = R.string.welcome_lbl),
        style = TextStyle(
            fontSize = 18.sp,
            color = Black,
            fontWeight = FontWeight.SemiBold
        ),
        textAlign = TextAlign.Start,
        modifier = Modifier.padding(top = 15.dp, bottom = 40.dp)
    )
}

@Composable
fun IndicatorLbl(
    message: String,
    enabled: Boolean,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(bottom = 15.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = message,
            style = TextStyle(
                fontSize = 18.sp,
                color = Black,
                fontWeight = FontWeight.SemiBold
            ),
            textAlign = TextAlign.Start,
            modifier = Modifier
                .weight(5f)
        )
        Led(modifier.weight(5f), enabled)
    }
}

@Composable
fun Led(
    modifier: Modifier = Modifier, enabled: Boolean
) {
    Canvas(modifier = Modifier.size(25.dp), onDraw = {
        val size = 25.dp.toPx()
        drawCircle(
            color = if (enabled) Green else Red,
            radius = size / 2f
        )
    })
}