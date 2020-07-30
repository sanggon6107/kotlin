package chap11.section3

import kotlinx.coroutines.*

suspend fun job1() : String{
    delay(100L)
    for (j in 101..200){
        println(j)
    }
    println("async1")
    println("async1")
    println("async1")
    println("async1")
    println("async1")

    return "job1"
}

suspend fun job2() : String{
    delay(200L)
    for (k in 201..300){
        println(k)
    }
    println("async2")
    println("async2")
    println("async2")
    println("async2")
    println("async2")
    println("async2")

    return "job2"
}

fun main(){
    val val1 = GlobalScope.async{
        job1()
    }

    val val2 = GlobalScope.async{
        job2()
    }

    GlobalScope.launch {
        println("mainThread")// async는 delay가 있으므로 먼저 실행
        val a = readLine()// readLine으로 지연되는동안 지연함수(async) 실행
        println("readLIne(mainThread) : over")//readLine끝나면 실행후 최종행으로 이동

        println("${val1.await()}, ${val2.await()}") // async로 이동
    }
    println("out of launch") // GlobalScope가 실행되기 전에 최초 실행
    readLine()
    println("readLine(out of launch : over)")
}