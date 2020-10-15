package br.com.gameeduunitcc.repositorio.interfaces

import androidx.room.*
import br.com.gameeduunitcc.repositorio.tabelas.Alternativas

@Dao
interface AlternativasDAO {

    @Query("SELECT * FROM alternativas")
    suspend fun getAll(): List<Alternativas>

    @Insert
    fun insertAll(vararg alternativas: Alternativas)

    @Delete
    suspend fun delete(alternativas: Alternativas)

    @Update
    suspend fun update(vararg alternativas: Alternativas)

    @Query("SELECT * FROM alternativas WHERE idAlternativa = :idAlternativa")
    suspend fun getAlternativa(idAlternativa: Int): Alternativas
}