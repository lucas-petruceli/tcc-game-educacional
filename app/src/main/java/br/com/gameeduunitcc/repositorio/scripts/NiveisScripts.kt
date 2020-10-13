package br.com.gameeduunitcc.repositorio.scripts

import android.content.Context
import br.com.gameeduunitcc.repositorio.RepoDatabase
import br.com.gameeduunitcc.repositorio.tabelas.Niveis
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class NiveisScripts {
    companion object {
        fun insertNiveis(context: Context) {
            GlobalScope.launch {
                /* NIVEIS - FASE 1/2 */
                RepoDatabase.getInstance(context)?.niveisDAO()?.insertAll(
                    Niveis(
                        1,
                        "ic_color_tinta_amarelo",
                        null,
                        1
                    )
                )

                RepoDatabase.getInstance(context)?.niveisDAO()?.insertAll(
                    Niveis(
                        2,
                        "ic_color_tinta_azul",
                        null,
                        2
                    )
                )

                RepoDatabase.getInstance(context)?.niveisDAO()?.insertAll(
                    Niveis(
                        3,
                        "ic_color_tinta_cinza",
                        null,
                        3
                    )
                )

                RepoDatabase.getInstance(context)?.niveisDAO()?.insertAll(
                    Niveis(
                        4,
                        "ic_color_tinta_laranja",
                        null,
                        4
                    )
                )

                RepoDatabase.getInstance(context)?.niveisDAO()?.insertAll(
                    Niveis(
                        5,
                        "ic_color_tinta_marron",
                        null,
                        5
                    )
                )

                RepoDatabase.getInstance(context)?.niveisDAO()?.insertAll(
                    Niveis(
                        6,
                        "ic_color_tinta_preta",
                        null,
                        6
                    )
                )

                RepoDatabase.getInstance(context)?.niveisDAO()?.insertAll(
                    Niveis(
                        7,
                        "ic_color_tinta_rosa",
                        null,
                        7
                    )
                )

                RepoDatabase.getInstance(context)?.niveisDAO()?.insertAll(
                    Niveis(
                        8,
                        "ic_color_tinta_roxa",
                        null,
                        8
                    )
                )

                RepoDatabase.getInstance(context)?.niveisDAO()?.insertAll(
                    Niveis(
                        9,
                        "ic_color_tinta_verde",
                        null,
                        9
                    )
                )

                RepoDatabase.getInstance(context)?.niveisDAO()?.insertAll(
                    Niveis(
                        10,
                        "ic_color_tinta_vermelho",
                        null,
                        10
                    )
                )
            }
        }
    }
}