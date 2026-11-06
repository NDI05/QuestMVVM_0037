package com.nusadataindonesia.pertemuan_kedelapan.viewmodel

import androidx.lifecycle.ViewModel
import com.nusadataindonesia.pertemuan_kedelapan.model.Siswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class SiswaViewModel : ViewModel() {
    private val _statusUI = MutableStateFlow(Siswa())
    val statusUI: StateFlow<Siswa> = _statusUI.asStateFlow()
}
