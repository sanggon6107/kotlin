package chap11.section2

import kotlinx.coroutines.*

suspend fun work1 () : String{
    delay(3000L)
    println("work1")
    return "one"
}

suspend fun work2 () : String{
    delay(1000L)
    println("work2")
    return "two"
}

private fun worksInSerial(){

    GlobalScope.launch {

        val one = work1()
        val two = work2()
        println("$one")
        println("$two")
    }
}

private fun workInParallel(){
    val one_parallel = GlobalScope.async{ // one_parallel, two_parallel : 병렬처리
        work1()
    }
    val two_parallel = GlobalScope.async{
        work2()
    }

    GlobalScope.launch{
        println("${one_parallel.await()} + ___ ${two_parallel.await()}")// 병렬처리후 진행
    }

}

private fun mult(a : String, b : Int) : String{
    var result = ""
    for (i in 1..b){
        result += a
    }
    return result
}

fun main(){
    worksInSerial()
    println(mult("-", 30))
    workInParallel()
    readLine()
}