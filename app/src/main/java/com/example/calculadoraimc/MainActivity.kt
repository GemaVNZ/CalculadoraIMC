package com.example.calculadoraimc

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text
import java.text.DecimalFormat
import kotlin.math.pow

class MainActivity : AppCompatActivity() {

    lateinit var heightEditText: EditText
    lateinit var weightTextView: TextView
    lateinit var descriptionTextView: TextView
    lateinit var resultTextView: TextView
    lateinit var minusButton: Button
    lateinit var manusButton: Button
    lateinit var calculateButton: Button

    var height: Float = 150.0F
    var weight: Float = 80.0F

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

            height = heightEditText.text.toString().toFloat()
            val result = weight / (height / 100f).pow(2)

            val decimalFormat = DecimalFormat("#.##")
            resultTextView.text = decimalFormat.format(result)

            val description : String?
            val descriptionColor: Int?

            when (result) {
                in 0.0f..18.5f -> {
                    description = getString(R.string.under_weight)
                    descriptionColor = getColor(R.color.under_weight_color)
                }
                in 18.5f .. 25f -> {
                    description = getString(R.string.normal_weight)
                    descriptionColor = getColor(R.color.normal_weight_color)
                }
                in 25f .. 30.0f -> {
                    description = getString(R.string.over_weight)
                    descriptionColor = getColor(R.color.over_weight_color)
                }

                else -> {
                    description = getString(R.string.obesity)
                    descriptionColor = getColor(R.color.obesity_weight_color)
                }

            }
                descriptionTextView.text = description
                descriptionTextView.setTextColor(descriptionColor)
                resultTextView.setTextColor(descriptionColor)
        }

    }

    fun setHeight() {
        heightEditText.setText(height.toString())
    }

    fun setWeight() {
        weightTextView.text = "$weight KG"
    }

}



