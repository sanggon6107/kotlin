package chap11.section3

import kotlinx.coroutines.*

fun main() = runBlocking{
    async{
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
    async{
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
    for (i in 1 .. 100){
        println(i)
    }
    println("main")
    println("main")
    println("main")
    println("main")
    println("main")
    println("main")
    println("main")
}