package hs

/**
 * 函数表达式
 * 下列表达不一样
 * 意思一样
 *
 * fun add(x : Int , y : Int) : Int {
return x + y
}


fun adds(x : Int , y : Int) : Int = x + y
 *
 *
 *var addjs:(Int , Int ) -> Int = { x,y -> x+y} 第二种写法
 * var addj = { x : Int , y : Int -> x + y}  简洁的写法
 *
 *
println(i(1,2))
 */
fun main() {
     var addj = { x : Int , y : Int -> x + y}
    var addjs:(Int , Int ) -> Int = { x,y -> x+y}
    println(addj(1,2))
    println(addjs(9,9))
    println(add(3,3))
    println(adds(3,4))
}
fun add(x : Int , y : Int) : Int {
    return x + y
}
fun adds(x : Int , y : Int) : Int = x + y
