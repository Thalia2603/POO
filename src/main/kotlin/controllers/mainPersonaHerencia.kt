package controllers

import models.Professor

fun main() {
    val p1 : Professor = Professor("Santi", "Rivas")
    p1.novaEspecialitat("Programació")
    p1.novaEspecialitat("Bases de Dades")

    println(p1)

    val p2 : Professor = Professor("Raimon", "Izard")
    p2.novaEspecialitat("Bases de Dades")
    p2.novaEspecialitat("Programació")

    println(p2)

    val p3 : Professor = Professor("David", "Marín")
    p3.novaEspecialitat("Programació")
    p3.novaEspecialitat("Web")

    println(p3)


}