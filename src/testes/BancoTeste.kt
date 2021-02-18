package testes

import data.Banco


/*
 *@created 18/02/2021 - 10:59
 *@project aprendendo-kotlin-dio
 *@author Rubio Alves
*/

fun main(){

    //Uso da data class Banco
    val digiOneBank = Banco("DigitalOne",12)
    println("Nome do Banco: ${digiOneBank.nome}")
    println("Número do Banco: ${digiOneBank.numero}")


}