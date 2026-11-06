package com.example.pertemuan8.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pertemuan8.R
import com.example.pertemuan8.model.Siswa

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TampilSiswa(
    statusUiSiswa: Siswa,
    onBackButtonClicked: () -> Unit,
    modifier: Modifier = Modifier
) {
    Scaffold(
        modifier = modifier,
        topBar = {
            TopAppBar(
                title = { Text(stringResource(id = R.string.detail), color = Color.White) },
                colors = TopAppBarDefaults.mediumTopAppBarColors(containerColor = colorResource(id = R.color.purple_500)),
            )
        }
    ) { isiRuang ->
        Column(
            modifier = Modifier.padding(isiRuang),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                modifier = Modifier.padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Column {
                    Text(text = stringResource(R.string.nama).uppercase(), fontSize = 16.sp)
                    Text(text = statusUiSiswa.nama, fontWeight = FontWeight.Bold, fontSize = 16.sp)
                }
                HorizontalDivider(thickness = 1.dp)

                Column {
                    Text(text = stringResource(R.string.gender).uppercase(), fontSize = 16.sp)
                    Text(text = statusUiSiswa.gender, fontWeight = FontWeight.Bold, fontSize = 16.sp)
                }
                HorizontalDivider(thickness = 1.dp)

                Column {
                    Text(text = stringResource(R.string.alamat).uppercase(), fontSize = 16.sp)
                    Text(text = statusUiSiswa.alamat, fontWeight = FontWeight.Bold, fontSize = 16.sp)
                }
                HorizontalDivider(thickness = 1.dp)

                Spacer(modifier = Modifier.height(8.dp))
                Button(
                    modifier = Modifier.fillMaxWidth(),
                    onClick = onBackButtonClicked
                ) {
                    Text(stringResource(R.string.back))
                }
            }
        }
    }
}