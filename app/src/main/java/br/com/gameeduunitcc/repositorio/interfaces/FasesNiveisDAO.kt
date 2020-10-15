package br.com.gameeduunitcc.repositorio.interfaces

import androidx.room.*
import br.com.gameeduunitcc.repositorio.tabelas.FasesNiveis

@Dao
interface FasesNiveisDAO {
    @Query("SELECT * FROM fasesNiveis")
    suspend fun getAll(): List<FasesNiveis>

    @Insert
    fun insertAll(vararg fasesNiveis: FasesNiveis)

    @Delete
    suspend fun delete(fasesNiveis: FasesNiveis)

    @Update
    suspend fun update(vararg fasesNiveis: FasesNiveis)

    @Query("SELECT * FROM fasesNiveis WHERE idFase = :idFase")
    suspend fun getNivel(idFase: Int): List<FasesNiveis>
}