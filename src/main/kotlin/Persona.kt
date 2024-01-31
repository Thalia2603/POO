package org.example

/**
 * Declaracion de la clase Persona con sus métodos aniversario(),casamiento(),divorcio() y toString(). Y sus atributos propios dni,nombre,apellido,edad y estadoCivil
 * @author Thalia Bravo
 */
class Persona {

    private var dni: String = ""
    private var nombre: String = ""
    private var apellido: String = ""
    private var edad: Int = 0
    private var estadoCivil: Boolean = false
    /**
     * Declaracion de los métodos aniversario(),casamiento(),divorcio() y toString()
     * @author Thalia Bravo
     */
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
    /**
     * Declaracion de los contructores primario y secundario
     * @author Thalia Bravo
     */
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
