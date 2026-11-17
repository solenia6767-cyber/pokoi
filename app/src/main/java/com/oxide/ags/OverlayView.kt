package com.oxide.ags

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View

/** Демонстрационная отрисовка фиксированной рамки; не читает память игры и не получает данные игроков. */
class OverlayView(context: Context) : View(context) {
    private val boxPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.GREEN
        style = Paint.Style.STROKE
        strokeWidth = 3f
    }
    private val textPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.WHITE
        textSize = 32f
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        val left = 100f
        val top = 150f
        canvas.drawRect(left, top, left + 200f, top + 360f, boxPaint)
        canvas.drawText("Oxide AGS — DEMO", left, top - 16f, textPaint)
    }
}
