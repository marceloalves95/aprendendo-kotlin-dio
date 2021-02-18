package testes

import enum.ClienteTipo
import objetos.Cliente


/*
 *@created 18/02/2021 - 13:55
 *@project aprendendo-kotlin-dio
 *@author Rubio Alves
*/

fun main(){

    val jose = Cliente(
        nome = "Jose da Silva",
        CPF = "123.456.789-12",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )
    println(jose)

    TesteAutenticacao().autentica(jose)

}
