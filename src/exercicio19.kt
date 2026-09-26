fun main(){

    class ContaBancaria(val nomeTitular:String, private var saldo:Double){

        fun depositar(valor: Double){

            when {
                valor <= 0 -> println("O valor do depósito deve ser maior que zero.")
                valor > 0 -> {
                    saldo += valor
                    println("Depósito de R$ $valor realizado! Você agora tem R$ $saldo.")
                }
            }

        }

        fun sacar(valor: Double){

            when {
                valor > saldo -> println("Saldo insuficiente. Você tem apenas R$ $saldo.")
                valor <= 0 -> println("O valor do saque deve ser maior que zero.")
                valor <= saldo -> {
                    saldo -= valor
                    println("Saque de R$ $valor realizado! Você agora tem R$ $saldo.")
                }

            }

        }

        fun consultar(){
            println("Titular: $nomeTitular")
            println("Você tem R$ $saldo na sua conta.")
        }

    }

    val conta = ContaBancaria("Fernanda", 1000.0)

    conta.consultar()
    conta.depositar(500.0)
    conta.sacar(200.0)
    conta.consultar()

}