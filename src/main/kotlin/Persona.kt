package org.example
class Persona {
    // Declaración de los atributos de PERSONA
    private var dni: String = ""
    private var nombre: String = ""
    private var apellido: String = ""
    private var edad: Int = 0
    private var estadoCivil: Boolean = false


    /*  //valores por dejecto
    init {
        dni="4444444W"
        nombre="Thalia"
        apellido="Soler"
        edad=21
        estadoCivil=true
    }*/

    // Declaración de los métodos
    fun aniversario() { // Cuando es aniversario, se suma un año a edad
        edad++
    }

    fun casamiento() { // Si está casado, estadoCivil vale true; sino, por defecto es false
        estadoCivil = true
    }

    fun divorcio() { // Si deja de estar casado, el estado civil se actualiza y vale false
        estadoCivil = false
    }

    override fun toString(): String {
        // Retornamos un texto con el valor que tiene la clase persona en ese momento
        return "DNI= $dni, NOMBRE=$nombre, APELLIDO=$apellido, EDAD= $edad, ESTADO CIVIL=$estadoCivil"
    }

    /* private fun calcDNI(nombre: String,apellido: String):String{
        var dni:String
        if (nombre.length>0){

        }
    }*/

    // Declaración de los constructores
    constructor() {

    } // Sin parámetros

    //constructor(nombre: String, apellido: String) : this("", nombre, apellido) // Solo nombre y apellido como parámetros
    //constructor(dni: String,nombre: String,apellido: String,edad: Int,estadoCivil: Boolean):this(){

    constructor(nombre: String, apellido: String) {
        this.nombre = nombre
        this.apellido = apellido
    }

    constructor(dni: String, nombre: String, apellido: String, edad: Int, estadoCivil: Boolean) {
        this.dni = dni
        this.nombre = nombre
        this.apellido = apellido
        this.edad = edad
        this.estadoCivil = estadoCivil
    }
}
