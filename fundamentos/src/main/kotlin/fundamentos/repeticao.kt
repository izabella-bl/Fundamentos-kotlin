package fundamentos

fun main(){
  //println(printa1a10())
  // printa10a1()
  //println(printaPar1a10())
    println(while1a10())
}

fun while1a10(){
    var x = 0
    while(x<=10){
        println(x)
        x++
    }
}

fun printa1a10(){
    for (numero in 1 ..10){
        println(numero)
    }
}

fun printa10a1(){
    for (numero in 10 downTo 1){
        println(numero)
    }
}

fun printaPar1a10(){
    for (numero in 2..10 step 2){
        println(numero)
    }
}