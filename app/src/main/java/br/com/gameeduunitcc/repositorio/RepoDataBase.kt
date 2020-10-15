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

        val nameDB = "gamedb"

        @Volatile
        private var instance: RepoDatabase? = null

        fun getInstance(context: Context): RepoDatabase? {
            synchronized(this) {
                var inst: RepoDatabase? = instance
                if (inst == null) {
                    inst = Room.databaseBuilder(
                        context,
                        RepoDatabase::class.java,
                        nameDB
                    ).build()
                }

                return inst
            }
        }
    }
}