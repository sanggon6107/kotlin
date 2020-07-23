class Solution5 {
    fun solution(n: Long): IntArray {
        val a = n.toString().toMutableList().reversed()
            //.map{Integer.parseInt(it.toString())}
            .map{it.toInt()}
        val b = a.map{it.toString()}
        println(b)
        print(a)
        return a.toIntArray()
    }
}

fun main() {
    val obj = Solution5()
    println(obj.solution(123456))

    val str1 = "STRING"
    println(str1.toMutableList())

    val stNum = "1"
    println(Integer.parseInt(stNum))
}