package chap09.section1

fun main() {
    val fib = generateSequence(1 to 2){it.first to it.first + it.second}
        //.map{it.first}

    println(fib.take(10).toList())

    val test = generateSequence(1 to 2){it.second to it.first*3}
    println(test.take(10).toList())
    val t1 = generateSequence(1){it+1}
    println("t1 : ${t1.take(10).toList()}")

    val a = fun0()
    println(a)

}

fun fun0(){
    val lis = mutableListOf(1, 2, 3)

    val lis2 = lis  //스택에 저장된 메모리 주소를 참조해서 대입
    lis2.add(4)

    println(lis2 === lis)
    println("lis2 : ${lis2}")
    println("lis : ${lis}")

}