package fundamentos

fun main() {
    var nome: String? = "Gustavo"

    println(nome?.length)

    val toShort : Short = nome!!.length.toShort();

    var nome2 = "Sofia"

    var tamanho: Int = nome?.length ?: 0

    var lista : List<Int?> = listOf(1,2,null)
    var listaNulable : List<Int?>? = null
}