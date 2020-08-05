package chap11.section3

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.*

fun  main() = runBlocking {
    val chn_buffer = Channel<Int>(3) // (4) : 버퍼 크기
    val sender = launch(coroutineContext){ // coroutineContext : 부모 컨텍스트. 여기서는 runBlocking
        repeat(10){
            println("Sending $it")
            chn_buffer.send(it)
        }
    }
    delay(1000L)
    println("cancel..")
    sender.cancel()
}