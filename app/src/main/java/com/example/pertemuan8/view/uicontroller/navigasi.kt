package com.example.pertemuan8.view.uicontroller

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pertemuan8.model.DataJK
import com.example.pertemuan8.view.FormSiswa
import com.example.pertemuan8.view.TampilSiswa
import com.example.pertemuan8.viewmodel.SiswaViewModel

enum class Navigasi {
    Formulir,
    Detail
}
