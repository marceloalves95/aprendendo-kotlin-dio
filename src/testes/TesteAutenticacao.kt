package testes

import interfaces.Logavel

/*
 *@created 18/02/2021 - 13:42
 *@project aprendendo-kotlin-dio
 *@author Rubio Alves
*/

class TesteAutenticacao {

    fun autentica(logavel: Logavel) = println(logavel.login())

}