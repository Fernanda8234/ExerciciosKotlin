fun main(){
    class Produto(val nome:String, val preco:Double)
        val produtos = listOf<Produto>(
            Produto("pão",1.00),
            Produto("ovo",5.00),
            Produto("leite",12.00)
    )
    val produtoMaisCaro = produtos.maxByOrNull { it.preco } // !!

    println(produtoMaisCaro?.nome)
}