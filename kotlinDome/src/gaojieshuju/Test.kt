package gaojieshuju

/**
 * （String） -.> Unit 函数类型 参数为字符串  返回值为Unit
 */
var print = fun(name : String) : Unit{
    println(name)
}
fun main() {
    var name = listOf<String>("tom","mi","nice","boy")
    name.forEach(print)

    name.forEach {
        println(it)//闭包
    }
}