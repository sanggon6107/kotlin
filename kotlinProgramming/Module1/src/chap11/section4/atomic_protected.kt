package chap11.section4




import kotlinx.coroutines.*
import java.util.concurrent.atomic.AtomicInteger
import kotlin.system.measureTimeMillis

var counter_protected = AtomicInteger(0) // 원자변수 초기화

suspend fun massiveRun_protected(action : suspend () -> Unit) {
    val n_coroutine = 1000 // 코루틴 수
    val k = 1000 // 각 코루틴 실행 횟수

    val time = measureTimeMillis { // 블럭 안 실행 시간 측정
        val jobs = List(n_coroutine) { // Job의 리스트를 만들어서 n_coroutine만큼 코루틴 생성(launch)
            GlobalScope.launch {
                repeat(k) { action() } //'action() ; main의 {counter_protected++}' 을 k회 반복
            }
        }
        jobs.forEach { it.join() } // join으로 모든 코루틴 완료할 때까지 대기
    }
    println("Completed ${n_coroutine*k} actions in ${time} ms")
}

fun main() = runBlocking{
    massiveRun_protected{
        counter_protected.incrementAndGet() // 원자변수는 메서드를 이용해 증가시켜야함. CPU명령어로 변경되어도 한 줄로 변함.
    }
    println("counter  = ${counter_protected.get()}") // 값 읽기
}