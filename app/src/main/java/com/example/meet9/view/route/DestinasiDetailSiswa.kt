package com.example.meet9.view.route

import com.example.meet9.R

object DestinasiDetailSiswa : DestinasiNavigasi {
    override val route = "detail"
    override val titleRes = R.string.detail_siswa
    const val itemIdArg = "itemId"
    val routeWithArgs = "$route/{$itemIdArg}"
}
