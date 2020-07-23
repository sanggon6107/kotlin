package chap09.section2


fun main() {

    val st = "string123"
    val e = split(st)
    println("split : ${e}")
    println("sp_gen : ${sp_gen(st)}")
    }

fun split(str : String) : MutableList<String>{
    val ret = mutableListOf<String>()
    for (i in str) {
        ret.add(i.toString())
    }
    return ret
}

fun sp_gen(str : String) : MutableList<Char>{
    val ret_gen = generateSequence(str[0] to 1){str[it.second] to it.second+1}
        .map{it.first}
    return ret_gen.take(str.length).toMutableList<Char>()


}