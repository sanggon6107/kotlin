package chap11.section3

import kotlinx.coroutines.*

fun main() = runBlocking{// 메인 스레드
    val jobs = arrayListOf<Job>()

    jobs += launch{
        println("main runBlocking : ${Thread.currentThread().name}")
    }

    jobs += launch(Dispatchers.IO){ // Dispatchers에 의해 입출력 스레드로
        println("IO : ${Thread.currentThread().name}")
    }
    jobs += launch(Dispatchers.Default){// 디스패처 기본 설정 스레드
        println("Dispatchers.Default : ${Thread.currentThread().name}")
    }
    jobs += launch(newSingleThreadContext("myNewThread")){ //새로운 스레드 생성
        println("newSingleThreadContext : ${Thread.currentThread().name}")
    }

    jobs.forEach{it.join()}

}