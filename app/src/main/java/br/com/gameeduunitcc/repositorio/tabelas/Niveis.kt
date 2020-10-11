package br.com.gameeduunitcc.repositorio.tabelas

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Niveis(
    @PrimaryKey val idNivel: Int,
    @ColumnInfo(name = "imagemArquivo") val imagemArquivo: String,
    @ColumnInfo(name = "audioArquivo") val audioArquivo: String?,
    @ColumnInfo(name = "ordem") val ordem: Int
)