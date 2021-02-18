package objetos

import java.math.BigDecimal


/*
 *@created 18/02/2021 - 12:28
 *@project aprendendo-kotlin-dio
 *@author Rubio Alves
*/

class Analista(nome: String, CPF: String, salario: Double) : Funcionario(nome, CPF, salario) {

    override fun calculoAuxilio() = salario * 0.1
}