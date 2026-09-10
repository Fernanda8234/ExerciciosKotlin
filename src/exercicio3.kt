fun main(){
    val idade = 17

    when(idade){
        in 0 .. 12 -> println("criança")
        in 13 .. 17 -> println("adolescente")
        in 18 .. 59 -> println("adulto")
        else -> if(idade < 0) println("inválido") else println("idoso")
    }
}