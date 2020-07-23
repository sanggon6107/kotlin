class Solution9 {
    fun solution(num: Int): Int {
        var count : Int = 0
        var number  : Int = num
        for (i in 1..500){
            if (number == 1){return count}
            when (number % 2){
                0 -> {
                    number = number / 2
                    count += 1
                }
                1 -> {
                    number = number * 3 + 1
                    count += 1
                }
            }
        }
        return -1
    }
}

fun main() {
    val obj = Solution9()
    println(obj.solution(6))
    println(obj.solution(16))
    println(obj.solution(12345678))

}