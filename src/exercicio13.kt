fun main(){
    val lista = mutableListOf(1,2,3,4,5)

    val resultado = lista.filter{it % 2 != 0}

    println(resultado)
}