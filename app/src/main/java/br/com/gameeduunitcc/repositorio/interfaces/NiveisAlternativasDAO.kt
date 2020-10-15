package br.com.gameeduunitcc.repositorio.interfaces

import androidx.room.*
import br.com.gameeduunitcc.repositorio.tabelas.NiveisAlternativas

@Dao
interface NiveisAlternativasDAO {
    @Query("SELECT * FROM niveisAlternativas")
    suspend fun getAll(): List<NiveisAlternativas>

    @Insert
    fun insertAll(vararg niveisAlternativas: NiveisAlternativas)

    @Delete
    suspend fun delete(niveisAlternativas: NiveisAlternativas)

    @Update
    suspend fun update(vararg niveisAlternativas: NiveisAlternativas)

    @Query("SELECT * FROM niveisAlternativas WHERE idNivel = :idNivel")
    suspend fun getAlternativas(idNivel: Int): List<NiveisAlternativas>
}