package fundamentos

fun main(){
    parOuImpar(2)
    parOuImpar(15)
}

fun parOuImpar(numero:Int){
    if (numero % 2 == 0)
         println("par")
    else
         println("impar")
}