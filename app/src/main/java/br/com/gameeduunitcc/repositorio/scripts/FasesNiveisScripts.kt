package br.com.gameeduunitcc.repositorio.scripts

import android.content.Context
import br.com.gameeduunitcc.repositorio.RepoDatabase
import br.com.gameeduunitcc.repositorio.tabelas.FasesNiveis
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class FasesNiveisScripts {
    companion object {
        fun insertFasesNiveis(context: Context) {
            GlobalScope.launch {
                /* NIVEIS - FASE 1 */
                RepoDatabase.getInstance(context)?.fasesNiveisDAO()?.insertAll(
                    FasesNiveis(1, 1)
                )

                RepoDatabase.getInstance(context)?.fasesNiveisDAO()?.insertAll(
                    FasesNiveis(1, 2)
                )

                RepoDatabase.getInstance(context)?.fasesNiveisDAO()?.insertAll(
                    FasesNiveis(1, 3)
                )

                RepoDatabase.getInstance(context)?.fasesNiveisDAO()?.insertAll(
                    FasesNiveis(1, 4)
                )

                RepoDatabase.getInstance(context)?.fasesNiveisDAO()?.insertAll(
                    FasesNiveis(1, 5)
                )

                RepoDatabase.getInstance(context)?.fasesNiveisDAO()?.insertAll(
                    FasesNiveis(1, 6)
                )

                RepoDatabase.getInstance(context)?.fasesNiveisDAO()?.insertAll(
                    FasesNiveis(1, 7)
                )

                RepoDatabase.getInstance(context)?.fasesNiveisDAO()?.insertAll(
                    FasesNiveis(1, 8)
                )

                RepoDatabase.getInstance(context)?.fasesNiveisDAO()?.insertAll(
                    FasesNiveis(1, 9)
                )

                RepoDatabase.getInstance(context)?.fasesNiveisDAO()?.insertAll(
                    FasesNiveis(1, 10)
                )

                /* NIVEIS - FASE 2 */
                RepoDatabase.getInstance(context)?.fasesNiveisDAO()?.insertAll(
                    FasesNiveis(2, 4)
                )

                RepoDatabase.getInstance(context)?.fasesNiveisDAO()?.insertAll(
                    FasesNiveis(2, 10)
                )

                RepoDatabase.getInstance(context)?.fasesNiveisDAO()?.insertAll(
                    FasesNiveis(2, 5)
                )

                RepoDatabase.getInstance(context)?.fasesNiveisDAO()?.insertAll(
                    FasesNiveis(2, 1)
                )

                RepoDatabase.getInstance(context)?.fasesNiveisDAO()?.insertAll(
                    FasesNiveis(2, 3)
                )

                RepoDatabase.getInstance(context)?.fasesNiveisDAO()?.insertAll(
                    FasesNiveis(2, 6)
                )

                RepoDatabase.getInstance(context)?.fasesNiveisDAO()?.insertAll(
                    FasesNiveis(2, 8)
                )

                RepoDatabase.getInstance(context)?.fasesNiveisDAO()?.insertAll(
                    FasesNiveis(2, 7)
                )

                RepoDatabase.getInstance(context)?.fasesNiveisDAO()?.insertAll(
                    FasesNiveis(2, 9)
                )

                RepoDatabase.getInstance(context)?.fasesNiveisDAO()?.insertAll(
                    FasesNiveis(2, 2)
                )
            }
        }
    }
}