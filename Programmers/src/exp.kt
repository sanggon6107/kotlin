fun main() {
    val str = "1dwd"
    val list = mutableListOf(0, 1, 3, 2)

    println(list.slice(IntRange(1, 3)).sorted())

}