package chap10.section3

import java.io.*
import java.nio.file.Files // inl : 비동기(넌블럭)
import java.nio.file.Paths
import java.nio.file.StandardOpenOption


fun main(){
    val path = "D:\\kotlin_test\\kotlin_test.txt" //디렉터리 자동 생성 불가능.
    val text = "test_text..\ntest_text.."

    val outString : String = "in.FileWriter_test"
    val PrintWriter_path : String = "D:\\kotlin_test\\io.printWrither_test.txt"

    try{
        Files.write(Paths.get(path), text.toByteArray(),StandardOpenOption.CREATE)// nio.file.Files

        val file = File(PrintWriter_path) //io
        val printWriter = PrintWriter(file)

        printWriter.println(outString)
        printWriter.close()

        file.writeText("kotlin_library_writeText") // 코틀린 내부 라이브러리 writeText
        file.appendText("kotlin_library_appendText")

        val writer = FileWriter("D:\\kotlin_test\\il.filewriter_test.txt", true)//기본
        writer.write("test__test")

        val reader = FileReader("D:\\kotlin_test\\read.txt")//기본

        println("before")
        println(reader.readText())
        println("after")
    }
    catch(e : IOException){
        println("Error : IOException.")
    }
    finally{
        println("the main function has been called.")
    }
}