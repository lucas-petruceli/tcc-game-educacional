package br.com.gameeduunitcc.repositorio.tabelas

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Alternativas(
    @PrimaryKey val idAlternativa: Int,
    @ColumnInfo(name = "imagemArquivo") val imagemArquivo: String
)