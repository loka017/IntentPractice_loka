package com.ateam.intentpractice_loka

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        moveToOtherBtn.setOnClickListener {

//            다른화면으로 이동(to OtherAtivity)
            val myIntent = Intent(this, OtherActivity::class.java)
            startActivity(myIntent)
        }
    }
}