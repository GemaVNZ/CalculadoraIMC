package com.example.calculadoraimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

     //lateinit var welcomeTextView: TextView
     //lateinit var clickButton: Button
     //lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Se va a la vista del componente para buscar el id que le hemos indicado. Buscamos una referencia al componente de la vista. Ya podríamos programarlo.
        //Solamente damos ID cuando queramos programarlo.

        //welcomeTextView = findViewById(R.id.welcomeTextView)

        //Para cuando tengas el identificador en el string de cara al idioma
        //welcome.TextView.text=getString(R.string.main_activity_welcome_text)

        //welcomeTextView.text="Bienvenidos a mi primera aplicación Android."


        //imageView = findViewById(R.id.imageView)
        //imageView.setImageResource(R.drawable.ic_launcher_foreground)


        //clickButton = findViewById(R.id.clickButton)
        //clickButton.setOnClickListener {
           //welcomeTextView.text="He hecho click en el botón"}
    }



}