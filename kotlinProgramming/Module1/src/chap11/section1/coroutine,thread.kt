package chap11.section1


class SimpleThread : Thread(){
    override fun run(){
        println("current thread : ${Thread.currentThread()}")
    }
}

class SimpleRunnable : Runnable {
    override fun run(){
        println("cunnrent threads : ${Thread.currentThread()}")
    }
}

class SimpleRunnable2 : Runnable {
    override fun run(){
        println("SimpleRunnable2")
    }
}

fun main(){
    val thread = SimpleThread()
    thread.start()

    val runnable = SimpleRunnable()
    val thread1 = Thread(runnable)
    thread1.start()

    val r2 = SimpleRunnable2()
    val thread2 = Thread(r2)
    thread2.start()

}