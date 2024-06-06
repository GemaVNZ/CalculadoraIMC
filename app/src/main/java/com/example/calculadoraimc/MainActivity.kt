package com.example.calculadoraimc

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text
import kotlin.math.pow

class MainActivity : AppCompatActivity() {

    lateinit var heightEditText: EditText
    lateinit var weightTextView: TextView
    lateinit var descriptionTextView: TextView
    lateinit var resultTextView: TextView
    lateinit var minusButton: Button
    lateinit var manusButton: Button
    lateinit var calculateButton: Button

    var height:Int = 150
    var weight:Int = 80

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Se va a la vista del componente para buscar el id que le hemos indicado. Buscamos una referencia al componente de la vista. Ya podríamos programarlo.
        //Solamente damos ID cuando queramos programarlo.

        heightEditText = findViewById(R.id.heightEditText)
        weightTextView = findViewById(R.id.weightTextView)
        descriptionTextView = findViewById(R.id.descriptionTextView)
        resultTextView = findViewById(R.id.descriptionTextView)
        minusButton = findViewById(R.id.minusButton)
        manusButton = findViewById(R.id.manusButton)
        calculateButton = findViewById(R.id.calculateButton)

        setHeight()
        setWeight()


        minusButton.setOnClickListener {
            weight--
            setWeight()
        }


        manusButton.setOnClickListener {
            weight++
            setWeight()

        }

        calculateButton.setOnClickListener {
            height = heightEditText.text.toString().toInt()
            val result = weight / (height/100f).pow(2)
            resultTextView.text= result.toString()

        }

    }

        fun setHeight() {
            heightEditText.setText(height.toString())
        }

        fun setWeight() {
            weightTextView.text="$weight KG"
        }

    }
