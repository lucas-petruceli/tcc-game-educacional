package br.com.gameeduunitcc.repositorio.tabelas

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Fases(
    @PrimaryKey val idFase: Int,
    @ColumnInfo(name = "descricao") val descricao: String?,
    @ColumnInfo(name = "ordem") val ordem: Int,
    @ColumnInfo(name = "titulo") val titulo: String?,
    @ColumnInfo(name = "audio") val audioHabilitado: Boolean
)