import java.lang.Integer.min
import kotlin.math.max

class Solution1 {
    fun solution(a: Int, b: Int): Long {
        val a1 = min(a, b).toLong()
        val n = (max(a, b)-a1+1).toLong()
        val answer : Long = (n*(2*a1+n-1))/2
        return answer
    }
}

fun main() {
    val ob = Solution1()
    println(ob.solution(-10_000_000, 9_000_000))
}