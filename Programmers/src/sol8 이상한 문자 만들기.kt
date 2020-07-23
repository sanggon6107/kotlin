class Solution8 {
    fun solution(s: String): String {
        val map : String = "aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ"
        val answer : MutableList<String> = mutableListOf<String>()
        val list : MutableList<String> = s.split(" ").toMutableList()
        for (wordIdx in 0..list.size-1){
            var seq = generateSequence(list[wordIdx][0] to 1){list[wordIdx][it.second] to it.second+1}
                .map{it.first}
                .take(list[wordIdx].length).toMutableList()
            var counter : Int = 0
            for (i in 0..seq.size-1){
                if (seq[i] in map){counter += 1}
                if (counter % 2 != 0){seq[i] = seq[i].toUpperCase()}
                else if (counter % 2 == 0){seq[i] = seq[i].toLowerCase()}
            }
            answer.add(seq.joinToString(""))
        }
    return answer.joinToString(" ")
    }
}

fun main() {
    val obj = Solution8()
    println(obj.solution("try hello world"))
}