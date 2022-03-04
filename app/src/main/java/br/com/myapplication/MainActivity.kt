package br.com.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val originText = findViewById<TextView>(R.id.textOi)
        val editText = findViewById<EditText>(R.id.editTextTextPersonName)
        val button = findViewById<Button>(R.id.buttonEnviar)
        val newButton = findViewById<Button>(R.id.buttonAvSecond)

        button.setOnClickListener {
            val newText = editText.text.toString()
            if (newText.isNotBlank()) {
               originText.text = "Olá "+ newText+" !"

            }else{
                editText.error = "Digite seu nome aqui"
            }

        newButton.setOnClickListener {
            val intentOpenNewActivity = Intent(this, SecondActivity::class.java)
            intentOpenNewActivity.putExtra("TEXTO_DIGITADO", editText.text.toString())
            startActivity(intentOpenNewActivity)
        }
        }
    }
}