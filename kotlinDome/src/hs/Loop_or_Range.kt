package hs

/**
 * Loop 循环
 * Range 区间  1..100
 * until 开区间 1 until 100
 * step 步长
 */
fun main() {
    forDome()
    forstep()
}
fun forDome(){
    var result = 0
    for (num in 1..100){
        print("$num,")

        result += num
    }
    println()
    println("结果：$result")
}

/**
 * step 步长
 */
fun forstep(){
    var nums = 1..100
    var result = 0
    for (num in  nums step 2){
        print("$num,")

        result += num
    }
    var c = nums.reversed()
    for (i in c){
        print("$i,")
    }
    var b = nums.count()
    println()
    println("结果：$result,,$b")
}