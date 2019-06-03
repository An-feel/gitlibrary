package hs

fun main() {
    Whens(60)

}
fun Whens(score : Int){
    /**
     * kotlin when 表达式 比  Java switch 更方便
     */
    when(score) {
        100 -> println("优秀")
        60 ->   println("及格")
        else -> println("请继续加油")
    }
}
fun Whenss(score : Int){

    when(score) {
        100 -> println("优秀")
        60 ->   println("及格")
        else -> println("请继续加油")
    }
}