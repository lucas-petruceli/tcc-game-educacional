package br.com.gameeduunitcc.repositorio.interfaces

import androidx.room.*
import br.com.gameeduunitcc.repositorio.tabelas.FasesNiveis

@Dao
interface FasesNiveisDAO {
    @Query("SELECT * FROM fasesNiveis")
    fun getAll(): List<FasesNiveis>

    @Insert
    fun insertAll(vararg fasesNiveis: FasesNiveis)

    @Delete
    fun delete(fasesNiveis: FasesNiveis)

    @Update
    fun update(vararg fasesNiveis: FasesNiveis)
}