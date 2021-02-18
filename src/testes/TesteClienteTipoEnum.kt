package testes

import enum.ClienteTipo


/*
 *@created 18/02/2021 - 11:31
 *@project aprendendo-kotlin-dio
 *@author Rubio Alves
*/

fun main(){

    ClienteTipo.values().forEach { elemento ->

        println("${elemento.name} - ${elemento.descricao}")

    }

    val pf = ClienteTipo.PF
    println("${pf.name} - ${pf.descricao}")

    val pj = ClienteTipo.PJ
    println("${pj.name} - ${pj.descricao}")


}