package br.com.gameeduunitcc.viewlModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import br.com.gameeduunitcc.repositorio.RepoDatabase
import br.com.gameeduunitcc.repositorio.tabelas.Fases
import kotlinx.coroutines.launch

class FasesVM(application: Application) : AndroidViewModel(application) {
    private var app: Application = application
    var allFases = MutableLiveData<List<Fases>>()

    fun getAllFases() {
        viewModelScope.launch {
            try {
                val fases = RepoDatabase.getInstance(app)?.fasesDAO()?.getAll()
                allFases.postValue(fases)
            } catch (err: Exception) {
            }
        }
    }
}