class Solution(){
    fun solution1(arr : IntArray) : Int{
        return arr.toMutableList().sorted()[1]
    }
}

fun main() {
    val obj = Solution()
    println(obj.solution1(intArrayOf(1, 2, 3)))
    println(obj.solution1(intArrayOf(4, 4, 6)))
    println(obj.solution1(intArrayOf(10, 10, 10)))
}