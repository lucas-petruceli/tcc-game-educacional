package br.com.gameeduunitcc.models

data class GameNivel(
    val imagemNivel: String,
    val audioNivel: String?,
    val alternativas: List<GameAlternativa>
)