class Solution2 {
    fun solution(s: String): String {
        var len = s.length
        when (len%2) {
            0 -> return s.slice(IntRange((len/2)-1, len/2))
            else -> return s[len/2].toString()
        }
    }
}
fun main() {
    val obj = Solution2()
    println(obj.solution("str1"))
}