package org.example

/**
 * Declaracion de la clase Pasta
 * @author Thalia Bravo
 */
class Pasta {
    private var nombre:String=""
    private var precio:Float=0f
    private var peso:Float=0f
    private var calorias:Float=0f

    override fun toString():String{
        return "$nombre - $precio - $peso - $calorias"
    }

    constructor(nombre: String){
        this.nombre
    }
    constructor(nombre:String,peso:Float,calorias:Float){
        this.nombre=nombre
        this.peso=peso
        this.calorias=calorias
    }

    constructor(nombre: String,precio:Float,peso: Float,calorias: Float){
        this.nombre=nombre
        this.precio=precio
        this.peso=peso
        this.calorias=calorias
    }

    fun gettPeso():Float{
        return peso
    }

    fun gettCalorias():Float{
        return calorias
    }

    fun settPrecio(precioActualizado:Float){
        this.precio=precioActualizado
    }

    //TODO calcular precio pasta segun calorias y peso, y actualizar el precio

}