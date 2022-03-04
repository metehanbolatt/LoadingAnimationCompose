package com.metehanbolat.loadinganimationcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.metehanbolat.loadinganimationcompose.ui.theme.LoadingAnimationComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoadingAnimationComposeTheme {

            }
        }
    }
}
