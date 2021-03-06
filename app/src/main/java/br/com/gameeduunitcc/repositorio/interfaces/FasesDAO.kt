package br.com.gameeduunitcc.repositorio.interfaces

import androidx.room.*
import br.com.gameeduunitcc.repositorio.tabelas.Fases


@Dao
interface FasesDAO {

    @Query("SELECT * FROM fases")
    suspend fun getAll(): List<Fases>

    @Insert
    fun insertAll(vararg users: Fases)

    @Delete
    suspend fun delete(user: Fases)

    @Update
    suspend fun update(vararg fases: Fases)

    @Query("SELECT * FROM fases WHERE idFase = :idFase")
    suspend fun getFase(idFase: Int): Fases


//    @get:Query("SELECT * FROM fases")
//    val allRepos: List<Any?>?
//
//    @Insert
//    fun insert(vararg fases: Fases?)
//
//    @Update
//    fun update(vararg fases: Fases?)
//
//    @Delete
//    fun delete(vararg fases: Fases?)


//    @Query("SELECT * FROM fases WHERE idFase IN (:idFase)")
//    fun loadAllByIds(userIds: IntArray): List<User>

//    @Query("SELECT * FROM fases WHERE first_name LIKE :first AND " +
//            "last_name LIKE :last LIMIT 1")
//    fun findByName(first: String, last: String): Fases

}