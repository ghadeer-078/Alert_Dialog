package com.example.alert_dialog_bonus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val resoutl = findViewById<TextView>(R.id.textView)
        resoutl.text = intent.extras?.getString("data","")
    }

}
