package chap08.section1

class Box<T>(t : T){
    // class Box<T>(var name : T){...}

    var name = t
}

fun main(){
    val box1 : Box<Int> = Box<Int>(1)
    val box2 : Box<String> = Box<String>("string.")

    println("box1.name : ${box1.name}")
    println("box2.name : ${box2.name}")
}

