package br.com.gameeduunitcc

import android.app.Application
import android.util.Log
import br.com.gameeduunitcc.repositorio.RepoDatabase
import br.com.gameeduunitcc.repositorio.scripts.*
import java.io.File

class AppClass : Application() {

    override fun onCreate() {
        super.onCreate()

//        RepoDatabase
//            .getInstance(this)
//            ?.getRepoDao()
//            ?.insertAll(Fases(1,"fases das cores", 1, "nomeArquivo"))


        if (checkDatabase()) {
            Log.i("testeBanco", "banco criado")
            return
        } else {
            Log.i("testeBanco", "banco NAO criado")
            FasesScript.insertFases(this)
            NiveisScripts.insertNiveis(this)
            FasesNiveisScripts.insertFasesNiveis(this)
            AlternativasScripts.insertAlternativas(this)
            NiveisAlternativasScripts.insertNiveisAlternativas(this)

//            GlobalScope.launch {
//            RepoDatabase.getInstance(this@AppClass)?.clearAllTables()


            //Popular Niveis
//            RepoDatabase.getInstance(this@AppClass)?.niveisDAO()?.insertAll(
//                Niveis(
//                    1,
//                    "nomeArquivo",
//                    "audioArquivo",
//                    1
//                )
//            )
//
////            //Popular Fases-Niveis
//            RepoDatabase.getInstance(this@AppClass)?.fasesNiveisDAO()?.insertAll(
//                FasesNiveis(
//                    1,
//                    1
//                )
//            )
//
////            // Popular Alternativas
//            RepoDatabase.getInstance(this@AppClass)?.alternativasDAO()?.insertAll(
//                Alternativas(
//                    1,
//                    "nomeArquivo"
//                )
//            )
//
//            RepoDatabase.getInstance(this@AppClass)?.alternativasDAO()?.insertAll(
//                Alternativas(
//                    2,
//                    "nomeArquivo"
//                )
//            )

//            RepoDatabase.getInstance(this@AppClass)?.alternativasDAO()?.insertAll(
//                Alternativas(
//                    3,
//                    "nomeArquivo"
//                )
//            )
//
////            //Popular Niveis-Alternativas
//            RepoDatabase.getInstance(this@AppClass)?.niveisAlternativasDAO()?.insertAll(
//                NiveisAlternativas(
//                    1,
//                    1,
//                    true
//                )
//            )
//
//            RepoDatabase.getInstance(this@AppClass)?.niveisAlternativasDAO()?.insertAll(
//                NiveisAlternativas(
//                    1,
//                    2,
//                    false
//                )
//            )

//            RepoDatabase.getInstance(this@AppClass)?.niveisAlternativasDAO()?.insertAll(
//                NiveisAlternativas(
//                    1,
//                    3,
//                    false
//                )
//            )
//            }
        }


    }

    private fun checkDatabase(): Boolean {
        val dbfile = File(this.getDatabasePath(RepoDatabase.nameDB).path)
        return dbfile.exists()
    }
}