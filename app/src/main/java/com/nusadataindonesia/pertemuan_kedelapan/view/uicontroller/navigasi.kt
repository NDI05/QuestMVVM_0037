package com.nusadataindonesia.pertemuan_kedelapan.view.uicontroller

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.nusadataindonesia.pertemuan_kedelapan.model.Datajk
import com.nusadataindonesia.pertemuan_kedelapan.model.Siswa
import com.nusadataindonesia.pertemuan_kedelapan.view.FormSiswa

enum class Navigasi {
    Formulir,
    Detail
}

@Composable
fun SiswaApp(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {
    var statusUiSiswa by remember { mutableStateOf(Siswa()) }

    Scaffold(modifier = modifier) { isiRuang ->
        NavHost(
            navController = navController,
            startDestination = Navigasi.Formulir.name,
            modifier = Modifier.padding(isiRuang)
        ) {
            composable(route = Navigasi.Formulir.name) {
                val konteks = LocalContext.current
                FormSiswa(
                    pilihanJK = Datajk.JenisK.map { id -> konteks.resources.getString(id) },
                    onSubmitButtonClicked = { dataSiswa ->
                        statusUiSiswa = Siswa(
                            nama = dataSiswa[0],
                            gender = dataSiswa[1],
                            alamat = dataSiswa[2]
                        )
                        navController.navigate(Navigasi.Detail.name)
                    }
                )
            }
        }
    }
}
