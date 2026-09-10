fun main(){
    val numero = (1 .. 5).toList()

    val calculo = numero.reduce { fatorial, numero -> fatorial * numero }

    println(calculo)
}