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

    //A função copy irá copiar os dados da data class e você pode alterá-lo (por meio do parâmetro da função copy())
    val banco2 = digiOneBank.copy(nome= "Banco2")

    println(banco2.info())
    println(banco2.nome)


}