package hs

import java.lang.Exception

/**
 * 人机交互
 * readLine 和 scanse
 */
fun main() {
orRj()
}

fun orRj(){
    println("请输入第一个数字")
    var a = readLine()
    println("请输入第二个数字")
    var b = readLine()
    try {
        var num1 = a!!.toInt()
        var num2 = b!!.toInt()
        var add = {x:Int ,y :Int -> x + y}
        println("结果：" + add(num1,num2))
        orRj()
    }catch (e : Exception){
        println("请输入正确的类型")
        orRj()
    }



}