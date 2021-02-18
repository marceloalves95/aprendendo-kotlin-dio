package objetos

import interfaces.Logavel

/*
 *@created 18/02/2021 - 12:43
 *@project aprendendo-kotlin-dio
 *@author Rubio Alves
*/

class Gerente(nome:String, CPF:String, salario:Double, val senha:String) :Funcionario(nome = nome, CPF = CPF, salario = salario) , Logavel {

    override fun calculoAuxilio(): Double = salario * 0.4

    override fun login(): Boolean = "senha123" == senha


}