package hs

/**
 * list or map
 */
import java.util.*

fun main() {
    orlist()
    orliste()
    orMap()
}

/**
 * 创建简单 list 数组
 * 输出
 */
fun orlist(){
    var list = listOf<String>("1","2","3")
    for (i in list){
        println("数据:$i")
    }
}

/**
 * 迭代 输出 下标 和 值
 */
fun orliste(){
    var list = listOf<String>("1","2","3")
    for ((i,e) in list.withIndex()){
        println("key:$i,value:$e")
    }
}
fun orMap(){
    var map = TreeMap<String,String>()
    map["好"] = "good"
    map["学习"] = "study"
    map["上"] = "up"
    println(map["好"])//获取数据
}