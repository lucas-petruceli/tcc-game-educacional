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

                //fase 3 e 4

                /* Alternativas - Nivel 1 */
                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        11,
                        11,
                        true
                    )
                )

                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        12,
                        11,
                        false
                    )
                )

                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        13,
                        11,
                        false
                    )
                )

                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        14,
                        11,
                        false
                    )
                )

                /* Alternativas - Nivel 2 */
                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        12,
                        12,
                        true
                    )
                )

                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        15,
                        12,
                        false
                    )
                )

                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        16,
                        12,
                        false
                    )
                )

                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        17,
                        12,
                        false
                    )
                )

                /* Alternativas - Nivel 3 */
                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        13,
                        13,
                        true
                    )
                )

                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        17,
                        13,
                        false
                    )
                )

                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        18,
                        13,
                        false
                    )
                )

                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        19,
                        13,
                        false
                    )
                )

                /* Alternativas - Nivel 4 */
                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        14,
                        14,
                        true
                    )
                )

                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        20,
                        14,
                        false
                    )
                )

                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        11,
                        14,
                        false
                    )
                )

                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        12,
                        14,
                        false
                    )
                )

                /* Alternativas - Nivel 5 */
                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        15,
                        15,
                        true
                    )
                )

                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        17,
                        15,
                        false
                    )
                )

                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        18,
                        15,
                        false
                    )
                )

                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        19,
                        15,
                        false
                    )
                )

                /* Alternativas - Nivel 6 */
                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        16,
                        16,
                        true
                    )
                )

                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        12,
                        16,
                        false
                    )
                )

                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        13,
                        16,
                        false
                    )
                )

                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        14,
                        16,
                        false
                    )
                )

                /* Alternativas - Nivel 7 */
                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        17,
                        17,
                        true
                    )
                )

                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        14,
                        17,
                        false
                    )
                )

                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        15,
                        17,
                        false
                    )
                )

                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        16,
                        17,
                        false
                    )
                )

                /* Alternativas - Nivel 8 */
                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        18,
                        18,
                        true
                    )
                )

                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        11,
                        18,
                        false
                    )
                )

                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        19,
                        18,
                        false
                    )
                )

                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        20,
                        18,
                        false
                    )
                )

                /* Alternativas - Nivel 9 */
                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        19,
                        19,
                        true
                    )
                )

                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        15,
                        19,
                        false
                    )
                )

                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        16,
                        19,
                        false
                    )
                )

                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        17,
                        19,
                        false
                    )
                )

                /* Alternativas - Nivel 20 */
                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        20,
                        20,
                        true
                    )
                )

                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        12,
                        20,
                        false
                    )
                )

                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        13,
                        20,
                        false
                    )
                )

                RepoDatabase.getInstance(context)?.niveisAlternativasDAO()?.insertAll(
                    NiveisAlternativas(
                        14,
                        20,
                        false
                    )
                )
            }
        }
    }
}