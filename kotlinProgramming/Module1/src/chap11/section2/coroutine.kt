package chap11.section2

import kotlinx.coroutines.*

suspend fun doSomething(){ //suspend는 코루틴 내에서만 호출 가능
    println("Do something!")
}

fun main() { //메인 스레드

    val job = GlobalScope.launch{
        delay(150L)
        println("object")
    }

    GlobalScope.launch { //새 코루틴 백그라운드에서 실행시킴
        doSomething()
    }
    GlobalScope.launch{//새 코루틴 백그라운드에서 실행시킴
        delay(500L)
        println("delay : 500L")
    }
    println("isActive : ${job.isActive}, isCompleted : ${job.isCompleted}")

    println("hello")
    Thread.sleep(3000L)
    println("isActive : ${job.isActive}, isCompleted : ${job.isCompleted}")
    //main thread 끝


}