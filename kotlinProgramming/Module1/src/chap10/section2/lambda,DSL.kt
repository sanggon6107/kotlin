package chap10.section2




fun main() {                                      // readLine()
    print("input : ")
    try {
        val input: String = readLine()!!.toString()
        println("input data : ${input}")
    } catch (e: Exception) {
        println("Error.")
    }
}

