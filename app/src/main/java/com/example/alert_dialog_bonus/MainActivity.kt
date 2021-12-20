package com.example.alert_dialog_bonus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    lateinit var alertBtn: Button
    lateinit var edText: EditText
    lateinit var tvText: TextView
    lateinit var tvBtn: Button
    lateinit var goBtn: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        connectView()

        alertBtn.setOnClickListener {
            alert()
        }
    }

    fun connectView(){
        alertBtn = findViewById(R.id.alertBtn)
    }


    private fun alert(){
        val dialog = AlertDialog.Builder(this)
        val dialogView = layoutInflater.inflate(R.layout.alert_dialog, null)
        dialog.setView(dialogView)

        edText = dialogView.findViewById(R.id.edText)
        tvText = dialogView.findViewById(R.id.textView2)
        tvBtn = dialogView.findViewById(R.id.tvBtn)
        goBtn = dialogView.findViewById(R.id.goBtn)

        tvBtn.setOnClickListener {
            tvText.text = edText.text.toString()
        }

        goBtn.setOnClickListener {
            startActivity(
                Intent(this, MainActivity2::class.java)
                    .putExtra("data", edText.text.toString())
            )
        }

        dialog.show()
    }


}