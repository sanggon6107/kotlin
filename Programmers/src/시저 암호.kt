class Solution3 {
    fun solution(s: String, n: Int): String {
        val mapS = "aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ"
        var answer : String = ""
        for (i in s){
            if(i in mapS) {
                answer += mapS[(mapS.indexOf(i) + 2 * n) % 52]
            }
            else{
                answer += i
            }
        }
        return answer
    }
}

fun main() {
    val obj = Solution3()
    println(obj.solution("a B z", 4))
}