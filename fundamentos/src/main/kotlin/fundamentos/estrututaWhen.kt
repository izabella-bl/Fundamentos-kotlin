package fundamentos

fun main(){
    val x = 4
    when(x){
        5,-5 -> println("x==5")
        8 -> println("x==8")
        10 -> {
            println("x==10")
            println("x é uma dezena")
        }
        in 11 ..15 -> print("x esta entre 11 e 15")
        !in 16 ..20 -> print("x  nao esta entre 16 e 20")
        else -> println("Numero não mapeado")
    }
}

fun verfica(x:Any): Boolean{
    return when(x){
        is String -> x.startsWith("oi")
        else -> false
    }
}