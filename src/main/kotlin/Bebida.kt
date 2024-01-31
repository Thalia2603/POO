package org.example

class Bebida {
    private var nombre:String=""
    private var precio:Float=0f
    private var esAzucarada:Boolean=false

    constructor(nombre: String,precio:Float,esAzucarada: Boolean){
        this.nombre=nombre
        this.precio=precio
        this.esAzucarada=esAzucarada
    }
    constructor(nombre:String,esAzucarada:Boolean){
        this.nombre=nombre
        this.esAzucarada=esAzucarada
    }

    constructor(nombre: String,precio: Float){
        this.nombre=nombre
        this.precio=precio
    }

    override fun toString():String{
        return "$nombre - $precio - $esAzucarada "
    }


    //TODO actualizar el precio de +0.15 en funcion de si es azuarada o no
    fun setterPrecio(precioActualizado:Float) {
        this.precio=precioActualizado
    }

    fun contieneAzucar(){
        esAzucarada=true
    }
}