import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var a = 0
    var b = 1
    var c = 0

    for (i in 2..n) {
        c = c + a + b
        val tem = a
        a = b
        b = b + tem
    }

    println(c)

}