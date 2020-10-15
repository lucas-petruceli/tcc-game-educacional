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
                    Alternativas(5, "ic_color_balde_marrom")
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

                /* Alternativas - FASE 3/4 */
                RepoDatabase.getInstance(context)?.alternativasDAO()?.insertAll(
                    Alternativas(11, "ic_animal_cavalo")
                )

                RepoDatabase.getInstance(context)?.alternativasDAO()?.insertAll(
                    Alternativas(12, "ic_animal_coelho")
                )

                RepoDatabase.getInstance(context)?.alternativasDAO()?.insertAll(
                    Alternativas(13, "ic_animal_galinha")
                )

                RepoDatabase.getInstance(context)?.alternativasDAO()?.insertAll(
                    Alternativas(14, "ic_animal_gato")
                )

                RepoDatabase.getInstance(context)?.alternativasDAO()?.insertAll(
                    Alternativas(15, "ic_animal_jacare")
                )

                RepoDatabase.getInstance(context)?.alternativasDAO()?.insertAll(
                    Alternativas(16, "ic_animal_macaco")
                )

                RepoDatabase.getInstance(context)?.alternativasDAO()?.insertAll(
                    Alternativas(17, "ic_animal_rato")
                )

                RepoDatabase.getInstance(context)?.alternativasDAO()?.insertAll(
                    Alternativas(18, "ic_animal_sapo")
                )

                RepoDatabase.getInstance(context)?.alternativasDAO()?.insertAll(
                    Alternativas(19, "ic_animal_tartaruga")
                )

                RepoDatabase.getInstance(context)?.alternativasDAO()?.insertAll(
                    Alternativas(20, "ic_animal_vaca")
                )

                /* Alternativas - FASE 4 */
                RepoDatabase.getInstance(context)?.alternativasDAO()?.insertAll(
                    Alternativas(21, "ic_form_circulo_azul_claro")
                )

                RepoDatabase.getInstance(context)?.alternativasDAO()?.insertAll(
                    Alternativas(22, "ic_form_coracao_roxo")
                )

                RepoDatabase.getInstance(context)?.alternativasDAO()?.insertAll(
                    Alternativas(23, "ic_form_estrela_amarelo")
                )

                RepoDatabase.getInstance(context)?.alternativasDAO()?.insertAll(
                    Alternativas(24, "ic_form_gota_cinza")
                )

                RepoDatabase.getInstance(context)?.alternativasDAO()?.insertAll(
                    Alternativas(25, "ic_form_hexagono_marrom")
                )

                RepoDatabase.getInstance(context)?.alternativasDAO()?.insertAll(
                    Alternativas(26, "ic_form_losango_laranja")
                )

                RepoDatabase.getInstance(context)?.alternativasDAO()?.insertAll(
                    Alternativas(27, "ic_form_nuvem_azul")
                )

                RepoDatabase.getInstance(context)?.alternativasDAO()?.insertAll(
                    Alternativas(28, "ic_form_quadrado_vermelho")
                )

                RepoDatabase.getInstance(context)?.alternativasDAO()?.insertAll(
                    Alternativas(29, "ic_form_seta_verde")
                )

                RepoDatabase.getInstance(context)?.alternativasDAO()?.insertAll(
                    Alternativas(30, "ic_form_triangulo_rosa")
                )

            }
        }
    }
}