class Solution2(){
    fun solution(str : String) : Any{
        val reg = Regex("123")
        //return reg.findAll(str).take(1).toMutableList()
        return reg.findAll(str)
            .map{it.value}
            .toList()
        //sequence의 size가 이미 결정되었으므로 take(Int) 필요없음
    }
    fun sol(arr : List<String>){
        val reg = Regex("[a-zA-Z0-9]+@{1}[a-zA-Z0-9\\-]+]")
        val res = reg.findAll(arr[0])
            .map{it.value}
            .toList()

        println("res ; ${res}")
    }

}

fun main() {
    val obj = Solution2()
    println(obj.solution("12356 @ 444"))
    println(obj.sol(listOf<String>("ssa2@cig.kyushu-u.ac.jp")))
}