package objetos

import java.math.BigDecimal


/*
 *@created 18/02/2021 - 11:59
 *@project aprendendo-kotlin-dio
 *@author Rubio Alves
*/

abstract class Funcionario(
    nome:String,
    CPF:String,
    val salario:Double
    ) : Pessoa(nome,CPF) {

        protected abstract fun calculoAuxilio():Double

    override fun toString(): String = """
        Nome: $nome
        CPF: $CPF
        Salário: $salario
        Auxilio: ${calculoAuxilio()}
        
        
    """.trimIndent()


}