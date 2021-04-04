package com.kashif.opengles

import android.content.Context
import android.graphics.Canvas
import android.graphics.ColorSpace
import android.graphics.Paint
import android.graphics.Path
import android.os.Build
import android.view.View
import androidx.annotation.RequiresApi

class MyView
    (context: Context?) : View(context) {

    private var redPaint: Paint? = null


    init {
            // stroke to fill
            //red color
            //Add your initialisation code here
            redPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
            style = Paint.Style.FILL // stroke to fill
            color = -0x100000 //red color
            strokeWidth = 1f

        }
    }


        @RequiresApi(Build.VERSION_CODES.M)
        override fun onDrawForeground(canvas: Canvas?) {
            super.onDrawForeground(canvas)
            val path = Path().apply {
                moveTo(40f , 40f)
                lineTo(50f,300f)
                lineTo(160f,280f)
                lineTo(300f,380f)
                lineTo(380f,370f)
                lineTo(280f,450f)
                lineTo(100f,390f)
                lineTo(160f,380f)
                lineTo(50f,300f)

            }
            val  bluePaint = Paint().also {
                it.setARGB(255 , 0, 0 , 255)
            }
            canvas!!.drawPath(path , redPaint!!)
        }



}