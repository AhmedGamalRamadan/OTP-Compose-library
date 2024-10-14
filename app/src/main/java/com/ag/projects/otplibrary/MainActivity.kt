package com.ag.projects.otplibrary

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.ag.projects.otplibrary.ui.theme.OTPLibraryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OTPLibraryTheme {
                OtpInputField(
                    itemCount = 4,
                    onOtpComplete = {}
                )
            }
        }
    }
}
