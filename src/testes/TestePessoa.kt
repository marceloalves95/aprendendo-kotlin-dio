package testes

import objetos.Pessoa

/*
 *@created 18/02/2021 - 12:01
 *@project aprendendo-kotlin-dio
 *@author Rubio Alves
*/

fun main() {

    val marcelo = Pessoa(nome = "Marcelo", CPF = "123.456.789-12")
    println("Nome: ${marcelo.nome}")
    println("CPF: ${marcelo.CPF}")



}