package chap11.section4

//////atomic 지키지 않은 경우. 원자성 지켜진 경우는 atomic_protected참조////////////////////////////////////////


import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

var counter = 0

suspend fun massiveRun(action : suspend () -> Unit) {
    val n_coroutine = 1000 // 코루틴 수
    val k = 1000 // 각 코루틴 실행 횟수

    val time = measureTimeMillis { // 블럭 안 실행 시간 측정
        val jobs = List(n_coroutine) { // Job의 리스트를 만들어서 n_coroutine만큼 코루틴 생성(launch)
            GlobalScope.launch {
                repeat(k) { action() } //'action() ; main의 {counter++}' 을 k회 반복
            }
        }
        jobs.forEach { it.join() } // join으로 모든 코루틴 완료할 때까지 대기
    }
    println("Completed ${n_coroutine*k} actions in ${time} ms")
}

fun main() = runBlocking{
    massiveRun{
        counter ++
    }
    println("counter  = $counter")
}