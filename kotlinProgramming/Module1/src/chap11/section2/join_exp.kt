package chap11.section2

import kotlinx.coroutines.*

fun main() = runBlocking{

    val jobs = List(100_000){
        launch {
            delay(1000L)
            print(".")
        }
        }
    //jobs.forEach{it.join()} //join으로 launch 작업 끝날 때 까지 기다리고 println
    println("\nexp")
    }