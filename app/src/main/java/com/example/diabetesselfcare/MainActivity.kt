package com.example.diabetesselfcare
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.view.WindowCompat
import com.google.samples.apps.diabetessSelf.ui.DiaBetessSelf

class DiaBetessSelfActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent { DiaBetessSelf() }
    }
}