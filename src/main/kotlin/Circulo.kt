package org.example

import kotlin.math.PI

class Circulo(
    var radio: Double =0.0,
    var color:String="Blanc"
){
    fun permimetro(): Double {
        return 2* PI*radio
    }
    fun area(): Double {
        return radio*radio* PI
    }
    override fun toString():String{
        return "CIRCULO--> RADIO: $radio, COLOR: $color"
    }
    constructor(radio: Double) : this() {
        this.radio = this.radio
    }

    //getters
    fun GettColor():String{
        return color
    }
    fun GettRadi():Double{
        return radio
    }

    //setters
    fun SettColor(colorActualizado:String){
        color=colorActualizado
    }
    fun SettRadi(radioActualizado:Double){
        radio=radioActualizado
    }
}