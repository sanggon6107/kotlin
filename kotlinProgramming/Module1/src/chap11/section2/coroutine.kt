package chap11.section2

import kotlinx.coroutines.*


fun main() { //메인 스레드
    GlobalScope.launch { //새 코루틴 백그라운드에서 실행시킴
        delay(1000L)
        println("world")
    }
    GlobalScope.launch{//새 코루틴 백그라운드에서 실행시킴
        delay(500L)
        println("delay : 500L")
    }


    println("hello")
    Thread.sleep(3000L)
    //main thread 끝


}