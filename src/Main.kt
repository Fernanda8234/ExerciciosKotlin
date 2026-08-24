//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(){
//    parImpar()
//    positivoNegativo()
//    idade()
//    tabuada()
//    soma()
//    maiorNumero()
//    contagemRegressiva()
//    somaPar()
//    dobro()
//    mediaEscolar()
//    converterCelsiusFahrenheit()
}

fun parImpar(){
    val numero = 20

    if(numero % 2 == 0){
        println("é par")
    } else{
        println("é impar")
    }
}

fun positivoNegativo(){
    val numero = -1

    if(numero > 0){
        println("positivo")
    }
    else if(numero == 0){
        println("zero")
    }
    else{
        println("negativo")
    }
}

fun idade(){
    val idade = 17

    when(idade){
        in 0 .. 12 -> println("criança")
        in 12 .. 17 -> println("adolescente")
        in 18 .. 59 -> println("adulto")
        else -> println("idoso")
    }
}

fun tabuada(){
    val numero = 20
    var tabuada = 0

    while(tabuada < 10){
        tabuada++
        val resultado = numero * tabuada
        println(resultado)
    }
}

fun soma(){
    val numero = arrayOf(1, 2, 3, 4)

    val soma = numero.sum()
    println(soma)
}

fun maiorNumero(){
    val numero = arrayOf(5,8,2,10,3)

    val maior = numero.max() ?: 0
    println(maior)
}

fun contagemRegressiva(){
    var numero = 20

    while(numero > 0){
        numero--
        println(numero)
    }
}

fun somaPar(){
    val numero = arrayOf(1, 2, 3, 4)
    val pares = numero.filter { it % 2 == 0 }

    val soma = pares.sum()
    println(soma)
}

fun dobro(){
    val numero = 20

    val dobro = numero * 2

    println(dobro)
}

fun mediaEscolar(){
    val nota1 = 2
    val nota2 = 2
    val nota3 = 2

    val media = (nota1 + nota2 + nota3).toDouble() / 3

    val mediaFormatada = String.format("%.2f", media)

    println(mediaFormatada)
}

fun converterCelsiusFahrenheit(){
    val temperatura = 10
    val celsius = temperatura * 1.8 + 32

    println(celsius)
}