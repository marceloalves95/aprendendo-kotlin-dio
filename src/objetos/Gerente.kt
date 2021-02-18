package objetos

/*
 *@created 18/02/2021 - 12:43
 *@project aprendendo-kotlin-dio
 *@author Rubio Alves
*/

class Gerente(nome:String, CPF:String, salario:Double) :Funcionario(nome = nome, CPF = CPF, salario = salario) {

    override fun calculoAuxilio(): Double = salario * 0.4


}