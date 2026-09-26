fun main(){
    open class Funcionario(val nomeFuncionario:String, private val salarioFuncionario:Double){

        open fun salario(): Double{
            return salarioFuncionario
        }

    }

    class Gerente(nomeFuncionario:String, salarioFuncionario:Double) :Funcionario(nomeFuncionario, salarioFuncionario){

        override fun salario():Double{
            val salario = super.salario()
            return salario + (salario * 0.20)
        }

    }

    val conta = Funcionario("Fernanda", 1000.0)
    val contaMaisBonus = Gerente("João", 1000.0)

    println("Funcionário: ${conta.nomeFuncionario}")
    println("Salário: R$ ${conta.salario()}")

    println()

    println("Gerente: ${contaMaisBonus.nomeFuncionario}")
    println("Salário com 20% de comissão: R$ ${contaMaisBonus.salario()}")

}