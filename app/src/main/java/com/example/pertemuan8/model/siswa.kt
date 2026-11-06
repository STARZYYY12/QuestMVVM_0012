package com.example.pertemuan8.model

data class Siswa(
    val nama: String = "",
    val gender: String = "",
    val alamat: String = ""
)

// Data pendukung opsi jenis kelamin
object DataJK {
    val isiJK = listOf(
        com.example.pertemuan8.R.string.laki,
        com.example.pertemuan8.R.string.wanita
    )
}