package com.example.pertemuan8.ui.view.viewmodel

import androidx.lifecycle.ViewModel
import com.example.pertemuan8.ui.model.Mahasiswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MahasiswaViewModel : ViewModel()
{
    private val _mahasiswaStateUI =
        MutableStateFlow(Mahasiswa())

    val mahasiswaUiState :
            StateFlow<Mahasiswa> =
        _mahasiswaStateUI.asStateFlow()

    fun saveDataMahasiswa(mahasiswa: Mahasiswa) {
        _mahasiswaStateUI.update { currentState ->
            currentState.copy(
                nim = mahasiswa.nim,
                nama = mahasiswa.nama,
                email = mahasiswa.email
            )
        }
    }
}