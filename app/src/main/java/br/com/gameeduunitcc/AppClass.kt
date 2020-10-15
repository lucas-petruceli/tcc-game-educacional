package br.com.gameeduunitcc

import android.app.Application
import android.util.Log
import br.com.gameeduunitcc.repositorio.RepoDatabase
import br.com.gameeduunitcc.repositorio.scripts.*
import br.com.gameeduunitcc.utils.PreferencesProvider
import java.io.File

val Pref: PreferencesProvider by lazy {
    AppClass.prefs!!
}

class AppClass : Application() {

    companion object {
        @JvmStatic
        var prefs: PreferencesProvider? = null
//        var location: MyLocationRepository? = null
    }

    override fun onCreate() {
        super.onCreate()

        prefs = PreferencesProvider(applicationContext)

        if (checkDatabase()) {
            Log.i("testeBd", "banco criado")
            return
        } else {
            Log.i("testeBd", "banco NAO criado")
            FasesScripts.insertFases(this)
            NiveisScripts.insertNiveis(this)
            FasesNiveisScripts.insertFasesNiveis(this)
            AlternativasScripts.insertAlternativas(this)
            NiveisAlternativasScripts.insertNiveisAlternativas(this)
            Log.i("testeBd", "dentro da AppClass")
        }
    }

    private fun checkDatabase(): Boolean {
        val dbfile = File(this.getDatabasePath(RepoDatabase.nameDB).path)
        return dbfile.exists()
    }
}