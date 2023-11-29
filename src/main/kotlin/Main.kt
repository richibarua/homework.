import java.util.Scanner
fun main(args: Array<String>) {
//    purno()
//    jerin()
    richu()
}
//fun purno() {
//    var scan = Scanner(System.`in`)
//    var year: Int = scan.nextInt()
//    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
//        println("it is a leap year")
//    } else {
//        println("it is not a leap year")
//    }
//}
//fun jerin(){
//    val n =10
//    var a =0
//    var b =1
//    var fibo= 0
//    println("${a} ${b} ")
//    for (i in 3 ..n){
//        fibo = a+b
//        a=b
//        b=fibo
//        print("${fibo} ")
//    }
//}
fun richu(){
    val a =10
    val b =20
    val result = sumtwo(a,b)
    println(result)
}
fun sumtwo(a:Int, b:Int):Int{
    val x = a+b
    return x
}
