package br.com.gameeduunitcc

import android.app.Application
import android.util.Log
import br.com.gameeduunitcc.repositorio.RepoDatabase
import br.com.gameeduunitcc.repositorio.scripts.*
import java.io.File

class AppClass : Application() {

    override fun onCreate() {
        super.onCreate()

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
        }
    }

    private fun checkDatabase(): Boolean {
        val dbfile = File(this.getDatabasePath(RepoDatabase.nameDB).path)
        return dbfile.exists()
    }
}