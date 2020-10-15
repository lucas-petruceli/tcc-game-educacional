package br.com.gameeduunitcc.utils

import android.content.Context
import android.content.SharedPreferences
import br.com.gameeduunitcc.BuildConfig

class PreferencesProvider(context: Context) {

    private val prefFile = context.packageName
    private val preferencesProvider: SharedPreferences = context.getSharedPreferences(prefFile, 0)

    val ID_ULTIMA_FASE_REALIZADA = gerarNome("start.nivel")

    private fun gerarNome(name: String): String {
        return "${BuildConfig.APPLICATION_ID}.$name"
    }

    fun clearPreference() {
        val editor = preferencesProvider.edit()
        editor.clear()
        editor.apply()
    }

    fun save(prefName: String, prefValue: String) {
        val editor = preferencesProvider.edit()
        editor.putString(prefName, prefValue)
        editor.apply()
    }

    fun save(prefName: String, prefValue: Int) {
        val editor = preferencesProvider.edit()
        editor.putInt(prefName, prefValue)
        editor.apply()
    }

    fun save(prefName: String, prefValue: Long) {
        val editor = preferencesProvider.edit()
        editor.putLong(prefName, prefValue)
        editor.apply()
    }

    fun save(prefName: String, prefValue: Boolean) {
        val editor = preferencesProvider.edit()
        editor.putBoolean(prefName, prefValue)
        editor.apply()
    }

    fun read(prefName: String, defaultValue: String): String? {
        return preferencesProvider.getString(prefName, defaultValue)
    }

    fun read(prefName: String, defaultValue: Int): Int {
        return preferencesProvider.getInt(prefName, defaultValue)
    }

    fun read(prefName: String, defaultValue: Long): Long {
        return preferencesProvider.getLong(prefName, defaultValue)
    }

    fun read(prefName: String, defaultValue: Boolean): Boolean {
        return preferencesProvider.getBoolean(prefName, defaultValue)
    }
}