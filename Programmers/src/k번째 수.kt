/*
class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        val answer = mutableListOf<Int>()
        for (i in commands){
            println("${i[0]}, ${i[1]}, ${i[2]}")
            answer.add((array.slice(IntRange(i[0], i[1]))).sorted()[i[2]])
        }
        println(answer)
        return answer.toIntArray()
    }
}

fun main() {
    val a = Solution()
    println("Main")
    val b = (a.solution(intArrayOf(0, 1, 2, 3, 4), arrayOf(intArrayOf(0, 2, 1), intArrayOf(1, 4, 2), intArrayOf(2, 3, 0))))
    println("b : $b")
}
*/

class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {

        val a = commands.map{x -> array.slice(IntRange(x[0]-1, x[1]-1)).sorted()[x[2]-1]}
            .toIntArray()
        return a
    }
}

fun main() {
    val obj = Solution()

    println(obj.solution(intArrayOf(0, 1, 2, 3, 4), arrayOf(intArrayOf(1, 3, 1), intArrayOf(1, 4, 2), intArrayOf(2, 3, 1))))
}
 