package org.example

fun main() {
 /* MAIN CLASE PERSONA
    val p1 = Persona("4444444W","Thalia","Bravo",21,true)
    val p2 = Persona("Thalia", "Bravo")

    println("Ejemplo de ejecución 1: $p1")
    println("Ejemplo de ejecución 2: $p2")
    p1.aniversario()
    println("$p1")
    p2.casamiento()
    println("$p2") */


   /* MAIN CLASE CIRCULO
   var op: Int
    var circuloActual: Circulo? = null //inicializamos la variable circuloActual a nulo para poder ir actualizandola durante la ejecucuion del programa

    do {
        showMenu()
        op = readIntRange("Introduzca opción", 1, 6)
        circuloActual = mainMenuOptions(op, circuloActual)
    } while (op != 6)*/

    val croissant=Pasta("Croissant",0.25f,125f)
    val ensaimada=Pasta("Ensaimada",0.15f,145f)
    val donut=Pasta("Donut",0.35f,125.45f)
    val agua=Bebida("Agua",1.00f)
    val cafe=Bebida("Café",1.35f)
    val teRojo=Bebida("Te rojo",1.50f)
    val cola=Bebida("Coca Cola",1.65f)
    cola.contieneAzucar()
    println(croissant)
    println(ensaimada)
    println(donut)
    println(agua)
    println(teRojo)
    println(cafe)
    println(cola)

}

