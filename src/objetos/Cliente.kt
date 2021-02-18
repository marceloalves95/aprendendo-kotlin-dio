package objetos

import enum.ClienteTipo
import interfaces.Logavel

/*
 *@created 18/02/2021 - 13:51
 *@project aprendendo-kotlin-dio
 *@author Rubio Alves
*/

class Cliente(
    nome:String,
    CPF:String,
    val clienteTipo: ClienteTipo,
    val senha:String

) :Pessoa (nome,CPF),Logavel{


    override fun login(): Boolean = "123456" == senha

    override fun toString(): String = """
        Nome:   $nome
        CPF:    $CPF
        Tipo:   ${clienteTipo.descricao}
    """.trimIndent()



}