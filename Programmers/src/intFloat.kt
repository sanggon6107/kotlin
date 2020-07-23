/*
class Check(){
    fun check(s : String) : String {
        try{if(s.toInt()%1 == 0){return "INT"}
            else {return "".toString()}

        } catch(e : Exception){
            try{if(s.toFloat().toString() == s) {
            return "Float"}
                else {return ""}
            } catch(e : Exception){
                return "math error"
            }
        }
   }
}
fun main() {
  val obj = Check()
    println(obj.check("1.0"))

    println("1.0".toInt())
}


 */
class Check(){
    fun check(n : String) : String{
        try{
            if(n.toFloat() % 1.toFloat() == 0.toFloat()){return "정수"}
            else {return "소수"}
        } catch(e : Exception){
            return "math error"
        }
    }
}

fun main() {
    val obj = Check()
    println("INPUT : ")
    val input = readLine()
    println(obj.check(input.toString()))
}

