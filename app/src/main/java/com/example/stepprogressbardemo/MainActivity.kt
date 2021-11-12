package com.example.stepprogressbardemo

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kr.co.prnd.StepLinearLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<StepLinearLayout>(R.id.stepProgressBar).apply {
            max = 5
            step = 1
            stepDoneColor = Color.GREEN
            stepUndoneColor = Color.GRAY
        }

    }
}
