package org.example
class Persona(
    // Declaración de los atributos de PERSONA
    var dni: String = "",
    var nombre: String = "",
    var apellido: String = "",
    var edad: Int = 0,
    var estadoCivil: Boolean = false
) {
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

    // Declaración de los constructores
    constructor() : this("", "", "") // Sin parámetros

    constructor(nombre: String, apellido: String) : this("", nombre, apellido) // Solo nombre y apellido como parámetros
}