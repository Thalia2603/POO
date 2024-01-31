package org.example

import kotlin.math.PI

/**
 * Declaración de la clase circulo con sus métodos perimetro y área y sus atributos radio y color
 * @author Thalia Bravo
 */
class Circulo{
    private var radio: Double =0.0
    private var color:String="Blanc"
    /**
     * Métodos propios de la clase Circulo: perimetro(), area() y toString()
     * @author Thalia Bravo
     */
    fun permimetro(): Double {
        return 2* PI*radio
    }
    fun area(): Double {
        return radio*radio* PI
    }
    override fun toString():String{
        return "CIRCULO--> RADIO: $radio, COLOR: $color"
    }
    /**
     * Constructores primario y secundario de la clase Circulo
     * @author Thalia Bravo
     */
    constructor(radio: Double,color:String){
        this.radio=radio
        this.color=color
    }
    constructor(radio: Double){
        this.radio=radio
    }
    /**
     * Getters  de la clase Circulo
     * @return String
     * @author Thalia Bravo
     */
    fun GettColor():String{
        return color
    }
    fun GettRadi():Double{
        return radio
    }

    fun SettColor(colorActualizado:String){
        color=colorActualizado
    }
    fun SettRadi(radioActualizado:Double){
        radio=radioActualizado
    }
}