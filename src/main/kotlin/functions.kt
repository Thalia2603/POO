package org.example

fun mainMenuOptions(op: Int, circuloActual: Circulo?): Circulo? {
    var circulo = circuloActual // Inicializar la variable temporal

    when (op) {
        1 -> {
            val radio = readDouble("Introduzca el radio: ")
            val color = readWord("Introduzca color: ", "Datos incorrectos")
            circulo = Circulo(radio, color)
        }
        2 -> {
            val radio = readDouble("Introduzca el radio: ")
            circulo = Circulo(radio)
        }
        3 -> {
            println(circulo ?: "No hay círculos añadidos")
        }
        4 -> {
            println("Perímetro: ${circulo?.permimetro() ?: "No hay círculos añadidos"}")
        }
        5 -> {
            println("Área: ${circulo?.area() ?: "No hay círculos añadidos"}")
        }
        6 -> {
            println("Hasta la próxima")
        }
        else -> println("Opción inválida")
    }
    return circulo
}

fun showMenu() {
    println("Menu:")
    println("1.- Crear un círculo con radio y color")
    println("2.- Crear un círculo con radio")
    println("3.- Mostrar último círculo creado")
    println("4.- Mostrar perímetro del último círculo creado")
    println("5.- Mostrar área del último círculo creado")
    println("6.- Salir")
}