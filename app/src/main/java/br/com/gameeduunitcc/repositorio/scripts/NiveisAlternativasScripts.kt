package br.com.gameeduunitcc.repositorio.scripts

import android.content.Context
import br.com.gameeduunitcc.repositorio.RepoDatabase
import br.com.gameeduunitcc.repositorio.tabelas.NiveisAlternativas
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class NiveisAlternativasScripts {
    companion object {
        fun insertNiveisAlternativas(context: Context) {
            GlobalScope.launch {
                /* Alternativas - Nivel 1 */
                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        1,
                        1,
                        true
                    )
                )

                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        2,
                        1,
                        false
                    )
                )

                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        3,
                        1,
                        false
                    )
                )

                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        4,
                        1,
                        false
                    )
                )

                /* Alternativas - Nivel 2 */
                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        2,
                        2,
                        true
                    )
                )

                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        5,
                        2,
                        false
                    )
                )

                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        6,
                        2,
                        false
                    )
                )

                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        7,
                        2,
                        false
                    )
                )

                /* Alternativas - Nivel 3 */
                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        3,
                        3,
                        true
                    )
                )

                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        8,
                        3,
                        false
                    )
                )

                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        9,
                        3,
                        false
                    )
                )

                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        10,
                        3,
                        false
                    )
                )

                /* Alternativas - Nivel 4 */
                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        4,
                        4,
                        true
                    )
                )

                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        1,
                        4,
                        false
                    )
                )

                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        2,
                        4,
                        false
                    )
                )

                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        5,
                        4,
                        false
                    )
                )

                /* Alternativas - Nivel 5 */
                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        5,
                        5,
                        true
                    )
                )

                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        4,
                        5,
                        false
                    )
                )

                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        6,
                        5,
                        false
                    )
                )

                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        7,
                        5,
                        false
                    )
                )

                /* Alternativas - Nivel 6 */
                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        6,
                        6,
                        true
                    )
                )

                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        7,
                        6,
                        false
                    )
                )

                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        8,
                        6,
                        false
                    )
                )

                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        9,
                        6,
                        false
                    )
                )

                /* Alternativas - Nivel 7 */
                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        7,
                        7,
                        true
                    )
                )

                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        8,
                        7,
                        false
                    )
                )

                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        9,
                        7,
                        false
                    )
                )

                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        10,
                        7,
                        false
                    )
                )

                /* Alternativas - Nivel 8 */
                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        8,
                        8,
                        true
                    )
                )

                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        9,
                        8,
                        false
                    )
                )

                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        10,
                        8,
                        false
                    )
                )

                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        1,
                        8,
                        false
                    )
                )

                /* Alternativas - Nivel 9 */
                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        9,
                        9,
                        true
                    )
                )

                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        2,
                        9,
                        false
                    )
                )

                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        3,
                        9,
                        false
                    )
                )

                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        4,
                        9,
                        false
                    )
                )

                /* Alternativas - Nivel 10 */
                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        10,
                        10,
                        true
                    )
                )

                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        5,
                        10,
                        false
                    )
                )

                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        6,
                        10,
                        false
                    )
                )

                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        8,
                        10,
                        false
                    )
                )
            }
        }
    }
}