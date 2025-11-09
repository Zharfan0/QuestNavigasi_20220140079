package com.example.navigasi

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import com.example.navigasi.ui.theme.NavigasiTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NavigasiTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    //kode program bagian yang diedit
                    DataApp(modifier = Modifier)
                }
            }
        }
    }
}