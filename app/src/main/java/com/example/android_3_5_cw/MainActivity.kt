package com.example.android_3_5_cw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RelativeLayout
import androidx.appcompat.widget.ActivityChooserView
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.android_3_5_cw.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().add(R.id.fragment, FirstFragment()).commit()

    }
}