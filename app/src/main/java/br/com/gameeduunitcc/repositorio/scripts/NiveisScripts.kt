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
                        "audio_cores_amarelo",
                        1
                    )
                )

                RepoDatabase.getInstance(context)?.niveisDAO()?.insertAll(
                    Niveis(
                        2,
                        "ic_color_tinta_azul",
                        "audio_cores_azul",
                        2
                    )
                )

                RepoDatabase.getInstance(context)?.niveisDAO()?.insertAll(
                    Niveis(
                        3,
                        "ic_color_tinta_cinza",
                        "audio_cores_cinza",
                        3
                    )
                )

                RepoDatabase.getInstance(context)?.niveisDAO()?.insertAll(
                    Niveis(
                        4,
                        "ic_color_tinta_laranja",
                        "audio_cores_laranja",
                        4
                    )
                )

                RepoDatabase.getInstance(context)?.niveisDAO()?.insertAll(
                    Niveis(
                        5,
                        "ic_color_tinta_marrom",
                        "audio_cores_marrom",
                        5
                    )
                )

                RepoDatabase.getInstance(context)?.niveisDAO()?.insertAll(
                    Niveis(
                        6,
                        "ic_color_tinta_preta",
                        "audio_cores_preto",
                        6
                    )
                )

                RepoDatabase.getInstance(context)?.niveisDAO()?.insertAll(
                    Niveis(
                        7,
                        "ic_color_tinta_rosa",
                        "audio_cores_rosa",
                        7
                    )
                )

                RepoDatabase.getInstance(context)?.niveisDAO()?.insertAll(
                    Niveis(
                        8,
                        "ic_color_tinta_roxa",
                        "audio_cores_roxo",
                        8
                    )
                )

                RepoDatabase.getInstance(context)?.niveisDAO()?.insertAll(
                    Niveis(
                        9,
                        "ic_color_tinta_verde",
                        "audio_cores_verde",
                        9
                    )
                )

                RepoDatabase.getInstance(context)?.niveisDAO()?.insertAll(
                    Niveis(
                        10,
                        "ic_color_tinta_vermelho",
                        "audio_cores_vermelho",
                        10
                    )
                )

                /* NIVEIS - FASE 3/4 */
                RepoDatabase.getInstance(context)?.niveisDAO()?.insertAll(
                    Niveis(
                        11,
                        "ic_animal_cavalo_sombra",
                        "audio_animais_cavalo",
                        1
                    )
                )

                RepoDatabase.getInstance(context)?.niveisDAO()?.insertAll(
                    Niveis(
                        12,
                        "ic_animal_coelho_sombra",
                        "audio_animais_coelho",
                        2
                    )
                )

                RepoDatabase.getInstance(context)?.niveisDAO()?.insertAll(
                    Niveis(
                        13,
                        "ic_animal_galinha_sombra",
                        "audio_animais_galinha",
                        3
                    )
                )

                RepoDatabase.getInstance(context)?.niveisDAO()?.insertAll(
                    Niveis(
                        14,
                        "ic_animal_gato_sombra",
                        "audio_animais_gato",
                        4
                    )
                )

                RepoDatabase.getInstance(context)?.niveisDAO()?.insertAll(
                    Niveis(
                        15,
                        "ic_animal_jacare_sombra",
                        "audio_animais_jacare",
                        5
                    )
                )

                RepoDatabase.getInstance(context)?.niveisDAO()?.insertAll(
                    Niveis(
                        16,
                        "ic_animal_macaco_sombra",
                        "audio_animais_macaco",
                        6
                    )
                )

                RepoDatabase.getInstance(context)?.niveisDAO()?.insertAll(
                    Niveis(
                        17,
                        "ic_animal_rato_sombra",
                        "audio_animais_rato",
                        7
                    )
                )

                RepoDatabase.getInstance(context)?.niveisDAO()?.insertAll(
                    Niveis(
                        18,
                        "ic_animal_sapo_sombra",
                        "audio_animais_sapo",
                        8
                    )
                )

                RepoDatabase.getInstance(context)?.niveisDAO()?.insertAll(
                    Niveis(
                        19,
                        "ic_animal_tartaruga_sombra",
                        "audio_animais_tartaruga",
                        9
                    )
                )

                RepoDatabase.getInstance(context)?.niveisDAO()?.insertAll(
                    Niveis(
                        20,
                        "ic_animal_vaca_sombra",
                        "audio_animais_vaca",
                        10
                    )
                )

                /* NIVEIS - FASE 5 */
                RepoDatabase.getInstance(context)?.niveisDAO()?.insertAll(
                    Niveis(
                        21,
                        "ic_form_circulo_sombra",
                        null,
                        1
                    )
                )

                RepoDatabase.getInstance(context)?.niveisDAO()?.insertAll(
                    Niveis(
                        22,
                        "ic_form_coracao_sombra",
                        null,
                        2
                    )
                )

                RepoDatabase.getInstance(context)?.niveisDAO()?.insertAll(
                    Niveis(
                        23,
                        "ic_form_estrela_sombra",
                        null,
                        3
                    )
                )

                RepoDatabase.getInstance(context)?.niveisDAO()?.insertAll(
                    Niveis(
                        24,
                        "ic_form_gota_sombra",
                        null,
                        4
                    )
                )

                RepoDatabase.getInstance(context)?.niveisDAO()?.insertAll(
                    Niveis(
                        25,
                        "ic_form_hexagono_sombra",
                        null,
                        5
                    )
                )

                RepoDatabase.getInstance(context)?.niveisDAO()?.insertAll(
                    Niveis(
                        26,
                        "ic_form_losango_sombra",
                        null,
                        6
                    )
                )

                RepoDatabase.getInstance(context)?.niveisDAO()?.insertAll(
                    Niveis(
                        27,
                        "ic_form_nuvem_sombra",
                        null,
                        7
                    )
                )

                RepoDatabase.getInstance(context)?.niveisDAO()?.insertAll(
                    Niveis(
                        28,
                        "ic_form_quadrado_sombra",
                        null,
                        8
                    )
                )

                RepoDatabase.getInstance(context)?.niveisDAO()?.insertAll(
                    Niveis(
                        29,
                        "ic_form_seta_sombra",
                        null,
                        9
                    )
                )

                RepoDatabase.getInstance(context)?.niveisDAO()?.insertAll(
                    Niveis(
                        30,
                        "ic_form_triangulo_sombra",
                        null,
                        10
                    )
                )


            }
        }
    }
}