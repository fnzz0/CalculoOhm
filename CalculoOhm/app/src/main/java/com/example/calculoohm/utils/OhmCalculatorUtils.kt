package com.example.calculoohm.utils

object OhmCalculatorUtils {
    fun CalcularVoltagem(resistance: Double, current: Double): Double {
        return resistance * current
    }
}
