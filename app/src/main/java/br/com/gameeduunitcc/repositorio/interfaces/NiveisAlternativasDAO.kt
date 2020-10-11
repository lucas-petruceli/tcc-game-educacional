package br.com.gameeduunitcc.repositorio.interfaces

import androidx.room.*
import br.com.gameeduunitcc.repositorio.tabelas.NiveisAlternativas

@Dao
interface NiveisAlternativasDAO {
    @Query("SELECT * FROM niveisAlternativas")
    fun getAll(): List<NiveisAlternativas>

    @Insert
    fun insertAll(vararg niveisAlternativas: NiveisAlternativas)

    @Delete
    fun delete(niveisAlternativas: NiveisAlternativas)

    @Update
    fun update(vararg niveisAlternativas: NiveisAlternativas)
}