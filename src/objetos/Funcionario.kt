package objetos

import java.math.BigDecimal


/*
 *@created 18/02/2021 - 11:59
 *@project aprendendo-kotlin-dio
 *@author Rubio Alves
*/

class Funcionario(
    override val nome:String,
    override val CPF:String,
    val salario:BigDecimal
    ) : Pessoa(nome,CPF) {


}