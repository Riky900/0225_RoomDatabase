package com.example.meet9.view.route

import com.example.meet9.R

object DestinasiEditSiswa : DestinasiNavigasi {
    override val route = "edit"
    override val titleRes = R.string.edit_siswa
    const val itemId = "itemId"
    const val itemIdArg = "itemId"
    val routeWithArgs = "$route/{$itemIdArg}"
}
