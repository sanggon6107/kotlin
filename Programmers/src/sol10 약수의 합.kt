class Solution10 {
    fun solution(n: Int): Int {
        var answer = 0
        for (i in 1..n){
            if(n%i == 0){answer += i}
        }
        return answer
    }

    fun solution_(n : Int) : Int{
        var answer = 0
        var a = (1..n)
            .filter{n%it == 0}
            .sum()

        //
        val b = generateSequence(3 to 4){it.first + it.second to it.second+3}
            .map{it.first}
            .take(10)
            .toMutableList()
        //

        println(a)
        return a
    }
}

fun main() {
    val obj = Solution10()
    println(obj.solution(12))
    println(obj.solution(5))
    println(obj.solution_(12))
}