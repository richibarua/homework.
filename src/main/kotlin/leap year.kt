import java.util.Scanner
fun main(array: Array<String>){
    var reader = Scanner(System .`in`)
    print("Enter the Year: ")
    var year:Int = reader.nextInt()

    if (year%2==0){
        if (year%400==0 || year%100!=0 && year%4==0){
            println("$year is a leap year and Even")
        }
    }else{
        println("$year is not a leap year and Even")
    }
    if (year%2==0){
        if (year%400==0 || year%100!=0 && year%4==0){
            println("$year is a leap year and odd")
        }
    }else{
        println("$year is not a leap year and odd")
    }
}