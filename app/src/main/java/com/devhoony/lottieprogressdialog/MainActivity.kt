package com.devhoony.lottieprogressdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.devhoony.lottieproegressdialog.LottieProgressDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn1).setOnClickListener {
            LottieProgressDialog(
                context = this,
                isCancel = true,
                dialogWidth = null,
                dialogHeight = null,
                animationViewWidth = null,
                animationViewHeight = null,
                fileName = LottieProgressDialog.SAMPLE_1,
                title = null,
                titleVisible = null
            ).show()
        }

        findViewById<Button>(R.id.btn2).setOnClickListener {
            LottieProgressDialog(
                context = this,
                isCancel = true,
                dialogWidth = null,
                dialogHeight = null,
                animationViewWidth = null,
                animationViewHeight = null,
                fileName = LottieProgressDialog.SAMPLE_5,
                title = null,
                titleVisible = null
            ).show()
        }

        findViewById<Button>(R.id.btn3).setOnClickListener {
            LottieProgressDialog(
                context = this,
                isCancel = true,
                dialogWidth = null,
                dialogHeight = null,
                animationViewWidth = null,
                animationViewHeight = null,
                fileName = LottieProgressDialog.SAMPLE_7,
                title = null,
                titleVisible = null
            ).show()
        }
    }
}