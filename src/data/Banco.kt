package data


/*
 *@created 18/02/2021 - 10:58
 *@project aprendendo-kotlin-dio
 *@author Rubio Alves
*/

data class Banco(
    val nome:String,
    val numero:Int){


    fun info() = "$nome - $numero"

}

