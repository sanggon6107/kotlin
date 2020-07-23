class Solution4 {
    fun solution(answers: IntArray): IntArray {
        var answer = mutableListOf<Int>(0)
        var localMax : Int = 0
        val ansS = arrayOf<IntArray>(intArrayOf(1, 2, 3, 4, 5), intArrayOf(2, 1, 2, 3, 2, 4, 2, 5), intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5))

        for (comp in 0..2){
            var comp1 = generateSequence(1 to ansS[comp][0]){it.first+1 to ansS[comp][(it.first)%(ansS[comp].size)]}
                .map{it.second == answers[(it.first-1)%answers.size]}

            val localCount = comp1.take(answers.size).toList().count{it == true}
            println("localCount : ${localCount}, localMax : ${localMax}")
            when{
                localCount > localMax -> {answer = mutableListOf(comp+1)
                localMax = localCount}
                localCount == localMax -> answer.add(comp+1)
            }
        }
        return answer.toIntArray()
    }
}

fun main() {
    val obj = Solution4()
    obj.solution(intArrayOf(1, 3, 2, 4, 2))
    obj.solution(intArrayOf(1, 2, 3, 4, 5))

}