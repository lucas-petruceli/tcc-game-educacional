package br.com.gameeduunitcc.viewlModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import br.com.gameeduunitcc.models.GameAlternativa
import br.com.gameeduunitcc.models.GameNivel
import br.com.gameeduunitcc.repositorio.RepoDatabase
import kotlinx.coroutines.launch

class GameVM(application: Application) : AndroidViewModel(application) {
    private var app: Application = application
    val game = MutableLiveData<List<GameNivel>>()

    fun getGame(idFase: Int) {
        viewModelScope.launch {
            try {
                val listGame: MutableList<GameNivel> = mutableListOf()
                val allniveis = RepoDatabase.getInstance(app)?.fasesNiveisDAO()?.getNivel(idFase)
                allniveis?.let { niveis ->
                    niveis.forEach {
                        val listAlternativa: MutableList<GameAlternativa> = mutableListOf()
                        val nivel = RepoDatabase.getInstance(app)?.niveisDAO()?.getNivel(it.idNivel)
                        val alternativaNivel =
                            RepoDatabase.getInstance(app)?.niveisAlternativasDAO()
                                ?.getAlternativas(it.idNivel)
                        alternativaNivel?.let { niveisAlternativas ->
                            niveisAlternativas.forEach { itemNivelAlternativa ->
                                val alternativa = RepoDatabase.getInstance(app)?.alternativasDAO()
                                    ?.getAlternativa(itemNivelAlternativa.idAlternativa)
                                alternativa?.let { itemAlternativa ->
                                    listAlternativa.add(
                                        GameAlternativa(
                                            itemAlternativa.imagemArquivo,
                                            itemNivelAlternativa.valida
                                        )
                                    )
                                }
                            }
                            var gameObject = GameNivel(
                                nivel!!.imagemArquivo,
                                nivel.audioArquivo,
                                listAlternativa
                            )
                            listGame.add(gameObject)
                        }
                    }
                    game.postValue(listGame)
                    return@launch
                }
            } catch (err: Exception) {
            }
        }
    }
}