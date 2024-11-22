package com.example.pertemuan8.ui.screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.pertemuan8.model.Mahasiswa
import com.example.pertemuan8.model.RencanaStudi

@Composable
fun RencanaStudyView(
    mahasiswa: Mahasiswa,
    onSubmitButtonClicked: (MutableList<String>) -> Unit,
    onBackButtonClicked: () -> Unit
) {
    var chosenDrodown by remember { mutableStateOf("") }
    var checked by remember { mutableStateOf(false) }
    var pilihanKelas by remember { mutableStateOf("") } }