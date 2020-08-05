package chap11.section3

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel

fun mainn() = runBlocking{
    val chn_exp = Channel<Int>()

    launch{
        for (x in 1..10){
            chn_exp.send(x*x)
        }
        chn_exp.close()
    }
    //repeat(10) {println("channel : ${chn_exp.receive()}")}
    for (element in chn_exp){
        println("The elements in chn_exp : ${chn_exp.receive()}")
    }


}

fun main(){
    mainn()
}