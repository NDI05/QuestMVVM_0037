package com.nusadataindonesia.pertemuan_kedelapan.viewmodel

import androidx.lifecycle.ViewModel
import com.nusadataindonesia.pertemuan_kedelapan.model.Siswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class SiswaViewModel : ViewModel() {
    private val _statusUI = MutableStateFlow(Siswa())
    val statusUI: StateFlow<Siswa> = _statusUI.asStateFlow()

    fun setSiswa(dataSiswa: MutableList<String>) {
        _statusUI.update { statusSaatIni ->
            statusSaatIni.copy(
                nama = dataSiswa[0],
                gender = dataSiswa[1],
                alamat = dataSiswa[2]
            )
        }
    }
}
