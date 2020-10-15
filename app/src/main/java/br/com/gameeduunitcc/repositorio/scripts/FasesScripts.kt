package br.com.gameeduunitcc.repositorio.scripts

import android.content.Context
import br.com.gameeduunitcc.repositorio.RepoDatabase
import br.com.gameeduunitcc.repositorio.tabelas.Fases
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class FasesScripts {
    companion object {
        fun insertFases(context: Context) {
            GlobalScope.launch {
                /* FASE 1 */
                RepoDatabase.getInstance(context)?.fasesDAO()?.insertAll(
                    Fases(
                        1,
                        "Cores com audio",
                        1,
                        "nomeArquivo",
                        true
                    )
                )

                /* FASE 2 */
                RepoDatabase.getInstance(context)?.fasesDAO()?.insertAll(
                    Fases(
                        2,
                        "Cores",
                        2,
                        "nomeArquivo",
                        false
                    )
                )

                /* FASE 3 */
                RepoDatabase.getInstance(context)?.fasesDAO()?.insertAll(
                    Fases(
                        3,
                        "Animais com audio",
                        3,
                        "nomeArquivo",
                        true
                    )
                )

                /* FASE 4 */
                RepoDatabase.getInstance(context)?.fasesDAO()?.insertAll(
                    Fases(
                        4,
                        "Animais",
                        4,
                        "nomeArquivo",
                        false
                    )
                )

                /* FASE 5 */
                RepoDatabase.getInstance(context)?.fasesDAO()?.insertAll(
                    Fases(
                        5,
                        "Formas",
                        5,
                        "nomeArquivo",
                        false
                    )
                )

                /* FASE 6 */
                RepoDatabase.getInstance(context)?.fasesDAO()?.insertAll(
                    Fases(
                        6,
                        "Formas e Animais",
                        6,
                        "nomeArquivo",
                        false
                    )
                )
            }
        }
    }
}