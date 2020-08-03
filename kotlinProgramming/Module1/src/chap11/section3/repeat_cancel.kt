package chap11.section3

import kotlinx.coroutines.*

fun main() = runBlocking{
    val job=launch{
        repeat(1000){
                i -> println("println : $i")
            delay(200L)
        }
    }
    delay(1300L)
    job.cancel()
}