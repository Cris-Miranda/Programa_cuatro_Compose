package com.tesji.compose5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MostrarChiste("Va un señor...poner un texto largo ")
        }
    }
}
@Composable
fun MostrarChiste(chiste: String) {
    val scroll= rememberScrollState(0)
    Text(
        text = "chiste",
        fontFamily = FontFamily(Font(R.font.lastchristmas)),
        fontSize = 100.sp,
        modifier=Modifier.horizontalScroll(scroll),
    )
}