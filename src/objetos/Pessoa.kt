package objetos

/*
 *@created 18/02/2021 - 09:44
 *@project aprendendo-kotlin-dio
 *@author Rubio Alves
*/

class Pessoa {

    //Declaração de Variáveis
    var nome:String = "Marcelo Alves"
    var cpf:String = "123.123.123-12"


}

fun main(){

    //Essa variável armazena o objeto Pessoa
    val marcelo = Pessoa()

    //Aqui é chamado retorno do objeto Pessoa
    println(marcelo.nome)
    println(marcelo.cpf)


}