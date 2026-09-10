fun main(){
    val nota1 = 2
    val nota2 = 2
    val nota3 = 2

    val media = (nota1 + nota2 + nota3).toDouble() / 3

    val mediaFormatada = String.format("%.2f", media)

    println(mediaFormatada)
}