package com.nusadataindonesia.pertemuan_kedelapan

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import com.nusadataindonesia.pertemuan_kedelapan.ui.theme.Pertemuan_kedelapanTheme
import com.nusadataindonesia.pertemuan_kedelapan.view.uicontroller.SiswaApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Pertemuan_kedelapanTheme {
                SiswaApp(modifier = Modifier.fillMaxSize())
            }
        }
    }
}
