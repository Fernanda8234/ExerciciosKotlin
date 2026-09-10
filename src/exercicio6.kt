fun main(){
    //    val numeros = arrayOf(5,8,2,10,3)
//    val maior = numeros.max() ?: 0
//    val maior = numeros.maxOrNull()
//    println(maior)

    val numeros = arrayOf<Int>(5,8,2,10,3) // com o tipo de dado

    var auxiliar = numeros.first() // ou [0]

    for(numero in numeros){
        if(numero > auxiliar){
            auxiliar = numero
        }
    }

    println(auxiliar)
}