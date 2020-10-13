package br.com.gameeduunitcc.repositorio.scripts

import android.content.Context
import br.com.gameeduunitcc.repositorio.RepoDatabase
import br.com.gameeduunitcc.repositorio.tabelas.Alternativas
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class AlternativasScripts {
    companion object {
        fun insertAlternativas(context: Context) {
            GlobalScope.launch {
                /* Alternativas - FASE 1/2 */
                RepoDatabase.getInstance(context)?.alternativasDAO()?.insertAll(
                    Alternativas(1, "ic_color_balde_amarelo")
                )

                RepoDatabase.getInstance(context)?.alternativasDAO()?.insertAll(
                    Alternativas(2, "ic_color_balde_azul")
                )

                RepoDatabase.getInstance(context)?.alternativasDAO()?.insertAll(
                    Alternativas(3, "ic_color_balde_cinza")
                )

                RepoDatabase.getInstance(context)?.alternativasDAO()?.insertAll(
                    Alternativas(4, "ic_color_balde_laranja")
                )

                RepoDatabase.getInstance(context)?.alternativasDAO()?.insertAll(
                    Alternativas(5, "ic_color_balde_marron")
                )

                RepoDatabase.getInstance(context)?.alternativasDAO()?.insertAll(
                    Alternativas(6, "ic_color_balde_preto")
                )

                RepoDatabase.getInstance(context)?.alternativasDAO()?.insertAll(
                    Alternativas(7, "ic_color_balde_rosa")
                )

                RepoDatabase.getInstance(context)?.alternativasDAO()?.insertAll(
                    Alternativas(8, "ic_color_balde_roxo")
                )

                RepoDatabase.getInstance(context)?.alternativasDAO()?.insertAll(
                    Alternativas(9, "ic_color_balde_verde")
                )

                RepoDatabase.getInstance(context)?.alternativasDAO()?.insertAll(
                    Alternativas(10, "ic_color_balde_vermelho")
                )
            }
        }
    }
}