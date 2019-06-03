package dg

/**
 * 演示递归
 * 阶乘  5的阶层 5*4*3*2*1
 */
fun main() {
    println(fach(5))
    println(ollAdd(100
        ,0))
}
fun fach(num : Int): Int{
    return if (num == 1) {
        1
    }else{
        num * fach(num - 1)
    }

}

/**
 * 尾递归优化
 */
tailrec fun ollAdd(num : Int ,result : Int): Int{
    println("num:$num,result:$result")
    return if (num == 0) {
        1
    }else{
       ollAdd(num - 1 ,result + num)
    }

}