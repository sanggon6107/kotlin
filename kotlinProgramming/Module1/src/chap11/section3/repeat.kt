package chap11.section3

import kotlinx.coroutines.*

fun main() = runBlocking{
    GlobalScope.launch{ // GLobalScope이므로 메인이 runBlocking이라도 메인스레드 종료시 블럭 종료. launch로 블럭 구성시 종료되지 않음
        repeat(1000){
            i -> println("println : $i")
            delay(200L)
        }
    }
    delay(1300L)
    println("...'delay' over.")
}