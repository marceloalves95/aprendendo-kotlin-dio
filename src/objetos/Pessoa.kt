package objetos

/*
 *@created 18/02/2021 - 09:44
 *@project aprendendo-kotlin-dio
 *@author Rubio Alves
*/

class Pessoa {

    //Declaração de variáveis da classe Pessoa
    var nome: String = "Marcelo Alves"
    var cpf: String = "123.123.123-12"
        //Use o private set para não permitir que o objeto Pessoa possa ser alterado
        private set

    fun pessoaInfo() = "$nome e $cpf"

    /*
    Códigos usados na aula

     • Declaração de uma classe interna
       inner class Endereco{
       var rua:String = "Rua Lua"
       }

     */


}

fun main() {

    //Essa variável armazena o objeto Pessoa
    val marcelo = Pessoa()

    println(marcelo.pessoaInfo())

    /*
    Códigos usados na aula

    • Aqui é chamado as variáveis do objeto Pessoa
      println(marcelo.nome)
      println(marcelo.cpf)

    • Uso do recurso de classe interna (inner class)
      println(marcelo.Endereco().rua)

     */


}