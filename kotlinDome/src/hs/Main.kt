package hs
/**
 * Kotlin 函数编写规则
 *    fun 函数名 （参数名 ： 参数类型） ： 返回值类型{
 *    函数体
 *    }
 */
fun main() {
    println(plus(3,5))
    println(plus2(3,3))
    diaoyong()
}
fun plus(a: Int , b :Int ) : Int {
    return a + b
}
fun plus2(a: Int , b :Int ) : Int = a + b
/**
  作业
        */
fun sayHello (name : String) : String = name
fun checkAge (age : Int) : Boolean{
    /**
     * 相当于
     *    if (age == 0){
    return true
    }else {
    return false
    }
     */
    return age >= 0
}
fun saveLog (logLevel : Int) {
    println("saveLog  = $logLevel")
}
fun diaoyong (){
    println(sayHello("name"))
    println(checkAge(18))
    println(saveLog(3))
}
/**
        输出
        8
        6
        name
        true
        saveLog  = 3
        kotlin.Unit

 */
