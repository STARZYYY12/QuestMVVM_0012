package com.example.pertemuan8.viewmodel

import androidx.lifecycle.ViewModel
import com.example.pertemuan8.model.Siswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class SiswaViewModel : ViewModel() {
    private val _statusUI = MutableStateFlow(Siswa())
    val statusUI: StateFlow<Siswa> = _statusUI.asStateFlow()

    fun setSiswa(ls: List<String>) {
        _statusUI.update { statusSaatIni ->
            statusSaatIni.copy(
                nama = ls.getOrElse(0) { "" },
                gender = ls.getOrElse(1) { "" },
                alamat = ls.getOrElse(2) { "" }
            )
        }
    }
}