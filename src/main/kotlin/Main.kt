import com.thoughtworks.kotlin_basic.util.ConvertUtil

fun main(args: Array<String>) {
    println("Hello World!")
    println("+++++++++++++++++Hello convertion!++++++++++")
    val convertRes = ConvertUtil()
    println(convertRes.convert(1,1))
    println(convertRes.convert(1,2))
    println(convertRes.convert(26, 3))
    println(convertRes.convert(701, 5))
}