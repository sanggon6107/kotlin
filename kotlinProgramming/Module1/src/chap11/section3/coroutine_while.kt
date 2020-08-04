package chap11.section3

import kotlinx.coroutines.*

fun main() = runBlocking{
    val startTime = System.currentTimeMillis()

    val jobs = GlobalScope.launch{
        var nextPrintTime = startTime
        var i = 0
        while (i<5){// --> while(isActive)로 변경 : jobs.cancelAndJoin()으로 while루프 탈출
            if (System.currentTimeMillis() >= nextPrintTime){
                println("i : $i")
                nextPrintTime += 500L
                i += 1
            }
        }
    }

    delay(400L)
    println("calling cancelAndJoin().")
    jobs.cancelAndJoin() // GlobalScope.launch 종료 후 완료까지 대기(finally)

    //cancelAndJoin() 호출했지만 finally로 건너뛰지 않음
    println("done.")
}