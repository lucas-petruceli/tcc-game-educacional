package br.com.gameeduunitcc.repositorio.interfaces

import androidx.room.*
import br.com.gameeduunitcc.repositorio.tabelas.Alternativas

@Dao
interface AlternativasDAO {

    @Query("SELECT * FROM alternativas")
    fun getAll(): List<Alternativas>

    @Insert
    fun insertAll(vararg alternativas: Alternativas)

    @Delete
    fun delete(alternativas: Alternativas)

    @Update
    fun update(vararg alternativas: Alternativas)
}