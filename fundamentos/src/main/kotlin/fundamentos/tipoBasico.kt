package fundamentos

fun main () {
    val one = 1 // Int
    val threeBillion = 3000000000 // Long
    val oneLong = 1L // Long
    val oneByte: Byte = 1

    val e = 2.7182818284 // Double
    val eFloat = 2.7182818284f // Float, actual value is 2.7182817

    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010

    println(hexBytes)

    val a: Int = 100
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a

    val b: Int = 10000 // b > 127 ou b > -128 : println(boxedB === anotherBoxedB) : false
    val boxedB: Int? = b
    val anotherBoxedB: Int? = b

    println(boxedA === anotherBoxedA) // true
    println(boxedB === anotherBoxedB) // true

    val c: Int = 1
    val d: Long = c.toLong()

    val l = 1L + 3 // Long + Int => Long

    println(1 + 2)
    println(2_500_000_000L - 1L)
    println(3.14 * 2.71)
    println(10.0 / 3)

    val x = 5 / 2.toDouble()
    println(x == 2.5)

    println('5'.digitToInt()) // 5
    println('3'.digitToInt(radix = 8)) // 3
    println('A'.digitToInt(radix = 16)) // 10
    println('k'.digitToInt(radix = 36)) // 20

    println("///////////////////////////")
    val str = "abcd 123"
    for (h in str) {
        println(h)
    }

    println("///////////////////////////")
    val s = "abc" + 1
    println(s + "def")

    println("///////////////////////////")

    val text = """
    for (o in "foo")
        print(o)
    """

    print(text)

    println("///////////////////////////")
    val text2 = """
    |Tell me and I forget.
    |Teach me and I remember.
    |Involve me and I learn.
    |(Benjamin Franklin)
    """.trimMargin()
    print(text2)

    println("\n///////////////////////////")
    val price = """
    ${'$'}9.99
    """
    print(price)

    println("///////////////////////////")
    val p = "abc"
    println("$p.length is ${p.length}") // Prints "abc.length is 3"

}