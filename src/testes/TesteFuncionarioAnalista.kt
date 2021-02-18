package testes

import objetos.Analista
import objetos.Funcionario

/*
 *@created 18/02/2021 - 12:14
 *@project aprendendo-kotlin-dio
 *@author Rubio Alves
*/


fun main() {

    val marcelo = Analista(nome = "Marcelo", CPF = "123.456.789-12", 2000.0)
    imprimirRelatorio(marcelo)


}

fun imprimirRelatorio(funcionario: Funcionario) = println(funcionario.toString())