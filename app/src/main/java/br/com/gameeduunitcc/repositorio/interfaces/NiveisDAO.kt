package br.com.gameeduunitcc.repositorio.interfaces

import androidx.room.*
import br.com.gameeduunitcc.repositorio.tabelas.Niveis

@Dao
interface NiveisDAO {
    @Query("SELECT * FROM niveis")
    fun getAll(): List<Niveis>

    @Insert
    fun insertAll(vararg niveis: Niveis)

    @Delete
    fun delete(niveis: Niveis)

    @Update
    fun update(vararg niveis: Niveis)
}