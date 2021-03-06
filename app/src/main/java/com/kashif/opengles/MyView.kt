package com.kashif.opengles

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
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
            style = Paint.Style.STROKE // stroke to fill
            color = -0x100000 //red color
            strokeWidth = 5f

        }
    }


        @RequiresApi(Build.VERSION_CODES.M)
        override fun onDrawForeground(canvas: Canvas?) {
            super.onDrawForeground(canvas)
            canvas!!.drawRect(40F, 40F, 400F, 400F, redPaint!!)
            canvas.drawOval(40f , 40f , 800f, 800f , redPaint!!)
        }



}