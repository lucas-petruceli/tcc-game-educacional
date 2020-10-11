package br.com.gameeduunitcc.repositorio

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import br.com.gameeduunitcc.repositorio.interfaces.*
import br.com.gameeduunitcc.repositorio.tabelas.*

@Database(
    entities = [
        Fases::class,
        Alternativas::class,
        FasesNiveis::class,
        Niveis::class,
        NiveisAlternativas::class
    ],
    version = 1
)
abstract class RepoDatabase : RoomDatabase() {

    abstract fun fasesDAO(): FasesDAO
    abstract fun alternativasDAO(): AlternativasDAO
    abstract fun fasesNiveisDAO(): FasesNiveisDAO
    abstract fun niveisDAO(): NiveisDAO
    abstract fun niveisAlternativasDAO(): NiveisAlternativasDAO

    companion object {
//        private val instance by lazy {
//            RepoDatabase
//        }

        val nameDB = "gamedb"

        private var instance: RepoDatabase? = null

        @Synchronized
        fun getInstance(context: Context): RepoDatabase? {
            if (instance == null) {
                return Room.databaseBuilder(
                    context,
                    RepoDatabase::class.java,
                    nameDB
                ).build()
            }

            return instance
        }
    }
}


//@Database(entities = [Fases::class], version = 1)
//abstract class RepoDatabase : RoomDatabase() {
////    abstract val fases: Fases?
//    abstract fun getRepoDao(): FasesDAO
//
//    companion object {
//        private const val DB_NAME = "repoDatabase.db"
//
//        @Volatile
//        private var instance: RepoDatabase? = null
//
//        @Synchronized
//        fun getInstance(context: Context): RepoDatabase? {
//            if (instance == null) {
//                instance = create(context)
//            }
//            return instance
//        }
//
//        private fun create(context: Context): RepoDatabase {
//            return Room.databaseBuilder(
//                context,
//                RepoDatabase::class.java,
//                DB_NAME
//            ).build()
//        }
//    }
//}