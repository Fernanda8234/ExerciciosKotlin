fun main(){
    val idade = listOf(15, 18, 20, 16, 25, 17)

    val maiorIdade = idade.filter{it >= 18}
    val qntd = maiorIdade.size
    val media = maiorIdade.sum() / qntd
    println(maiorIdade)
    println(media)
}