package br.com.gameeduunitcc.utils

import android.app.Activity
import android.util.DisplayMetrics

object Layout {
    private fun screenSize(activity: Activity): DisplayMetrics {
        val metrics = DisplayMetrics()
        val display = activity.windowManager.defaultDisplay
        display.getMetrics(metrics)
        return metrics
    }

    fun getScreenWidth(activity: Activity): Int {
        return screenSize(activity).widthPixels
    }
}