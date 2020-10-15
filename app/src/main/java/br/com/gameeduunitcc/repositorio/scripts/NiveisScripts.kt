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

                /* NIVEIS - FASE 3/4 */
                RepoDatabase.getInstance(context)?.niveisDAO()?.insertAll(
                    Niveis(
                        11,
                        "ic_animal_cavalo_sombra",
                        null,
                        1
                    )
                )

                RepoDatabase.getInstance(context)?.niveisDAO()?.insertAll(
                    Niveis(
                        12,
                        "ic_animal_coelho_sombra",
                        null,
                        2
                    )
                )

                RepoDatabase.getInstance(context)?.niveisDAO()?.insertAll(
                    Niveis(
                        13,
                        "ic_animal_galinha_sombra",
                        null,
                        3
                    )
                )

                RepoDatabase.getInstance(context)?.niveisDAO()?.insertAll(
                    Niveis(
                        14,
                        "ic_animal_gato_sombra",
                        null,
                        4
                    )
                )

                RepoDatabase.getInstance(context)?.niveisDAO()?.insertAll(
                    Niveis(
                        15,
                        "ic_animal_jacare_sombra",
                        null,
                        5
                    )
                )

                RepoDatabase.getInstance(context)?.niveisDAO()?.insertAll(
                    Niveis(
                        16,
                        "ic_animal_macaco_sombra",
                        null,
                        6
                    )
                )

                RepoDatabase.getInstance(context)?.niveisDAO()?.insertAll(
                    Niveis(
                        17,
                        "ic_animal_rato_sombra",
                        null,
                        7
                    )
                )

                RepoDatabase.getInstance(context)?.niveisDAO()?.insertAll(
                    Niveis(
                        18,
                        "ic_animal_sapo_sombra",
                        null,
                        8
                    )
                )

                RepoDatabase.getInstance(context)?.niveisDAO()?.insertAll(
                    Niveis(
                        19,
                        "ic_animal_tartaruga_sombra",
                        null,
                        9
                    )
                )

                RepoDatabase.getInstance(context)?.niveisDAO()?.insertAll(
                    Niveis(
                        20,
                        "ic_animal_vaca_sombra",
                        null,
                        10
                    )
                )
            }
        }
    }
}