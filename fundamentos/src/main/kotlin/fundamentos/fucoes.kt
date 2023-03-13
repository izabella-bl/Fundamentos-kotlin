package fundamentos

fun main(){
    println("hello world")
    println(retorno())
    println(dizOi(nome(),24))
}

fun retorno(): String{
    return "Hello world"
}
fun nome(): String{
  return "Gustavo"
}

fun dizOi(nome:String, idade:Int){
    println("Oi ${nome}, parabéns pelos seus ${idade} anos")
}