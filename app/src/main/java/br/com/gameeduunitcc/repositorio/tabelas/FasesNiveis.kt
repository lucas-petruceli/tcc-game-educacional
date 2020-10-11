package br.com.gameeduunitcc.repositorio.tabelas

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(primaryKeys = ["idFase", "idNivel"])
class FasesNiveis(
    @ColumnInfo(name = "idFase") val idFase: Int,
    @ColumnInfo(name = "idNivel") val idNivel: Int
)