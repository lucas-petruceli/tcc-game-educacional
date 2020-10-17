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

                /* NIVEIS - FASE 3 */
                RepoDatabase.getInstance(context)?.fasesNiveisDAO()?.insertAll(
                    FasesNiveis(3, 11)
                )

                RepoDatabase.getInstance(context)?.fasesNiveisDAO()?.insertAll(
                    FasesNiveis(3, 12)
                )

                RepoDatabase.getInstance(context)?.fasesNiveisDAO()?.insertAll(
                    FasesNiveis(3, 13)
                )

                RepoDatabase.getInstance(context)?.fasesNiveisDAO()?.insertAll(
                    FasesNiveis(3, 14)
                )

                RepoDatabase.getInstance(context)?.fasesNiveisDAO()?.insertAll(
                    FasesNiveis(3, 15)
                )

                RepoDatabase.getInstance(context)?.fasesNiveisDAO()?.insertAll(
                    FasesNiveis(3, 16)
                )

                RepoDatabase.getInstance(context)?.fasesNiveisDAO()?.insertAll(
                    FasesNiveis(3, 17)
                )

                RepoDatabase.getInstance(context)?.fasesNiveisDAO()?.insertAll(
                    FasesNiveis(3, 18)
                )

                RepoDatabase.getInstance(context)?.fasesNiveisDAO()?.insertAll(
                    FasesNiveis(3, 19)
                )

                RepoDatabase.getInstance(context)?.fasesNiveisDAO()?.insertAll(
                    FasesNiveis(3, 20)
                )

                /* NIVEIS - FASE 4 */
                RepoDatabase.getInstance(context)?.fasesNiveisDAO()?.insertAll(
                    FasesNiveis(4, 11)
                )

                RepoDatabase.getInstance(context)?.fasesNiveisDAO()?.insertAll(
                    FasesNiveis(4, 12)
                )

                RepoDatabase.getInstance(context)?.fasesNiveisDAO()?.insertAll(
                    FasesNiveis(4, 13)
                )

                RepoDatabase.getInstance(context)?.fasesNiveisDAO()?.insertAll(
                    FasesNiveis(4, 14)
                )

                RepoDatabase.getInstance(context)?.fasesNiveisDAO()?.insertAll(
                    FasesNiveis(4, 15)
                )

                RepoDatabase.getInstance(context)?.fasesNiveisDAO()?.insertAll(
                    FasesNiveis(4, 16)
                )

                RepoDatabase.getInstance(context)?.fasesNiveisDAO()?.insertAll(
                    FasesNiveis(4, 17)
                )

                RepoDatabase.getInstance(context)?.fasesNiveisDAO()?.insertAll(
                    FasesNiveis(4, 18)
                )

                RepoDatabase.getInstance(context)?.fasesNiveisDAO()?.insertAll(
                    FasesNiveis(4, 19)
                )

                RepoDatabase.getInstance(context)?.fasesNiveisDAO()?.insertAll(
                    FasesNiveis(4, 20)
                )

                /* NIVEIS - FASE 5 */
                RepoDatabase.getInstance(context)?.fasesNiveisDAO()?.insertAll(
                    FasesNiveis(5, 21)
                )

                RepoDatabase.getInstance(context)?.fasesNiveisDAO()?.insertAll(
                    FasesNiveis(5, 22)
                )

                RepoDatabase.getInstance(context)?.fasesNiveisDAO()?.insertAll(
                    FasesNiveis(5, 23)
                )

                RepoDatabase.getInstance(context)?.fasesNiveisDAO()?.insertAll(
                    FasesNiveis(5, 24)
                )

                RepoDatabase.getInstance(context)?.fasesNiveisDAO()?.insertAll(
                    FasesNiveis(5, 25)
                )

                RepoDatabase.getInstance(context)?.fasesNiveisDAO()?.insertAll(
                    FasesNiveis(5, 26)
                )

                RepoDatabase.getInstance(context)?.fasesNiveisDAO()?.insertAll(
                    FasesNiveis(5, 27)
                )

                RepoDatabase.getInstance(context)?.fasesNiveisDAO()?.insertAll(
                    FasesNiveis(5, 28)
                )

                RepoDatabase.getInstance(context)?.fasesNiveisDAO()?.insertAll(
                    FasesNiveis(5, 29)
                )

                RepoDatabase.getInstance(context)?.fasesNiveisDAO()?.insertAll(
                    FasesNiveis(5, 30)
                )

                /* NIVEIS - FASE 6 */
                RepoDatabase.getInstance(context)?.fasesNiveisDAO()?.insertAll(
                    FasesNiveis(6, 31)
                )

                RepoDatabase.getInstance(context)?.fasesNiveisDAO()?.insertAll(
                    FasesNiveis(6, 32)
                )

                RepoDatabase.getInstance(context)?.fasesNiveisDAO()?.insertAll(
                    FasesNiveis(6, 33)
                )

                RepoDatabase.getInstance(context)?.fasesNiveisDAO()?.insertAll(
                    FasesNiveis(6, 34)
                )

                RepoDatabase.getInstance(context)?.fasesNiveisDAO()?.insertAll(
                    FasesNiveis(6, 35)
                )

                RepoDatabase.getInstance(context)?.fasesNiveisDAO()?.insertAll(
                    FasesNiveis(6, 36)
                )

                RepoDatabase.getInstance(context)?.fasesNiveisDAO()?.insertAll(
                    FasesNiveis(6, 37)
                )

                RepoDatabase.getInstance(context)?.fasesNiveisDAO()?.insertAll(
                    FasesNiveis(6, 38)
                )

                RepoDatabase.getInstance(context)?.fasesNiveisDAO()?.insertAll(
                    FasesNiveis(6, 39)
                )

                RepoDatabase.getInstance(context)?.fasesNiveisDAO()?.insertAll(
                    FasesNiveis(6, 40)
                )
            }
        }
    }
}