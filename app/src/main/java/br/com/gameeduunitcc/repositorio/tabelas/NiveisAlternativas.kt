package br.com.gameeduunitcc.repositorio.tabelas

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(primaryKeys = ["idAlternativa", "idNivel"])
class NiveisAlternativas(
    @ColumnInfo(name = "idAlternativa") val idAlternativa: Int,
    @ColumnInfo(name = "idNivel") val idNivel: Int,
    @ColumnInfo(name = "valida") val valida: Boolean
)