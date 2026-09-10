fun main(){
    var numero = 0

    while(numero <= 100){
        println(numero)
        numero++

        when{
            numero % 3 == 0 && numero % 5 == 0 -> print("BatataQuente ")
            numero % 3 == 0 -> print("Batata ")
            numero % 5 == 0 -> print("Quente ")
        }
    }
}