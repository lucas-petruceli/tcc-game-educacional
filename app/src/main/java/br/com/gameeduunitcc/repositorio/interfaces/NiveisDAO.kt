package br.com.gameeduunitcc.repositorio.interfaces

import androidx.room.*
import br.com.gameeduunitcc.repositorio.tabelas.Niveis

@Dao
interface NiveisDAO {
    @Query("SELECT * FROM niveis")
    suspend fun getAll(): List<Niveis>

    @Insert
    fun insertAll(vararg niveis: Niveis)

    @Delete
    suspend fun delete(niveis: Niveis)

    @Update
    suspend fun update(vararg niveis: Niveis)

    @Query("SELECT * FROM niveis WHERE idNivel = :idNivel")
    suspend fun getNivel(idNivel: Int): Niveis
}