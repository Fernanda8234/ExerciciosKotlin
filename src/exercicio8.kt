fun main(){
    val numero = arrayOf(1, 2, 3, 4)
    val pares = numero.filter { it % 2 == 0 }

//    val pares = numero.filter { num -> num % 2 == 0 } é a mesma coisa
//    var soma = 0
//    var contador = 0
//
//    while(contador < pares.size){
//        soma+= pares[contador]
//        contador++
//    }

    val soma = pares.sum()
    println(soma)
}