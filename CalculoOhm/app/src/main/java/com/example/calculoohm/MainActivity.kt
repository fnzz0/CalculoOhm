package com.example.calculoohm

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.calculoohm.utils.OhmCalculatorUtils

class MainActivity : AppCompatActivity() {

    private lateinit var editTextResistance: EditText
    private lateinit var editTextCurrent: EditText
    private lateinit var buttonCalculate: Button
    private lateinit var textViewResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextResistance = findViewById(R.id.editTextResistance)
        editTextCurrent = findViewById(R.id.editTextCurrent)
        buttonCalculate = findViewById(R.id.buttonCalculate)
        textViewResult = findViewById(R.id.textViewResult)

        buttonCalculate.setOnClickListener {
            calcularEMostrarVoltagem()
        }
    }

    private fun calcularEMostrarVoltagem() {
        val resistance = editTextResistance.text.toString().toDoubleOrNull()
        val current = editTextCurrent.text.toString().toDoubleOrNull()

        if (resistance != null && current != null) {
            val voltage = OhmCalculatorUtils.CalcularVoltagem(resistance, current)
            textViewResult.text = "Voltagem (V) = $voltage Volts"
        } else {
            textViewResult.text = "Insira números válidos"
        }
    }
}