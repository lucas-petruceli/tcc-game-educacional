package br.com.gameeduunitcc.viewlModel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import br.com.gameeduunitcc.Pref
import br.com.gameeduunitcc.repositorio.RepoDatabase
import br.com.gameeduunitcc.repositorio.tabelas.Fases
import kotlinx.coroutines.launch


class HomeVM(application: Application) : AndroidViewModel(application) {
    private var app: Application = application
    var fase = MutableLiveData<Fases>()

    fun getStartNivel() {
        val idFase = Pref.read(Pref.ID_ULTIMA_FASE_REALIZADA, 1)
        viewModelScope.launch {
            try {
                val faseStart = RepoDatabase.getInstance(app)?.fasesDAO()?.getFase(idFase)
                fase.postValue(faseStart)
            } catch (err: Exception) {
                Log.i("err", err.toString())
            }
        }
    }


}