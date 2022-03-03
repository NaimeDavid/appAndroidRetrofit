package br.com.myapplication

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
        val button = findViewById<Button>(R.id.button)
        val newButton = findViewById<Button>(R.id.button2)

        button.setOnClickListener {
            val newText = editText.text.toString()
            if (newText.isNotBlank()) {
                //Se não tá em branco, o 'text' recebe o conteudo no originText
                originText.text = "Olá "+ newText+" !"

            }else{
                editText.error = "Digite seu nome aqui"
            }

        }
    }
}