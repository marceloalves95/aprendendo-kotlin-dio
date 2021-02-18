package testes

import objetos.Funcionario
import objetos.Pessoa
import java.math.BigDecimal


/*
 *@created 18/02/2021 - 12:14
 *@project aprendendo-kotlin-dio
 *@author Rubio Alves
*/


fun main() {

    val marcelo = Pessoa(nome = "Marcelo", CPF = "123.456.789-12")
    println("Nome: ${marcelo.nome}")
    println("CPF: ${marcelo.CPF}")

    val funcionario = Funcionario("Marcelo","123.456.789-12", BigDecimal.valueOf(2000.0))
    println("Funcionário: ${funcionario.nome}")
    println("CPF: ${funcionario.CPF}")
    println("Salário: ${funcionario.salario}")

}