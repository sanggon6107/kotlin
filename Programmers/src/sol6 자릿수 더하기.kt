class Solution6 {
    fun solution(n: Int): Int {
        var answer = 0
        for (i in n.toString()){
            answer += Integer.parseInt(i.toString())
        }
        return answer
    }
}

fun main() {
    val obj = Solution6()
    println(obj.solution(123))
}