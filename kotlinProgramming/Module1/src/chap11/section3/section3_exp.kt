package chap11.section3

import kotlinx.coroutines.*

suspend fun job1(){
    delay(1L)
    for (j in 101..200){
        println(j)
    }
    println("async1")
    println("async1")
    println("async1")
    println("async1")
    println("async1")
}

suspend fun job2(){
    delay(1L)
    for (k in 201..300){
        println(k)
    }
    println("async2")
    println("async2")
    println("async2")
    println("async2")
    println("async2")
    println("async2")
}

fun main(){
    val val1 = GlobalScope.async{
        job1()
    }

    val val2 = GlobalScope.async{
        job2()
    }

    GlobalScope.launch {
        println("${val1}, ${val2}")
    }
    readLine()
}