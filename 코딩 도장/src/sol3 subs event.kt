
class Solution3() {
    fun findSub(input: Array<String>): String {
        val reg = Regex("[a-zA-Z1-9]+@{1}[a-zA-Z1-9\\.\\-]+")
        val result: MutableList<String> = mutableListOf()
        for (turn in 0..input.size - 1) {
            var regFind = reg.find(input[turn])?.value ?: "NULL"
            result.add(regFind)
        }
        var ret = ""
        do {
            ret = result[(0..input.size - 1).random()]
        } while (ret == "NULL")
        return "rec : ${ret}"
    }
}
data class data(val s : String){

}

class Subclass{
    val a : Int
    val b : String
    constructor(a : Int, b : String){
        this.a = a
        this.b = b
    }
}

fun main() {
    val obj = Solution3()
    val inp1 = data("cong a@css.cig.kyushu-u.ac.jp")
    val inp2 = data("wev..ej! b@css.cig.kyushu-u.ac.jp")
    val inp3 = data("eei2!! c@css.cig.kyushu-u.ac.jp")
    val inp : Array<String> = arrayOf<String>(inp1.s, inp2.s, inp3.s)

    println(obj.findSub(inp))
}