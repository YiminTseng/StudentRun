package Kotlin

import java.util.*
import kotlin.math.max

fun main() {
    userInput()

//    val stu = Student("Vix",70,90)
//    stu.print()
//    println("highest: ${stu.highest()}")
}

class Student(var name: String, var english: Int, var math: Int) {
    fun print() {
        print("$name\t$english\t$math\t${getAverage()}\t${grading()}\t${highest()}" )
//        println("最高分: ${highest()}")
        print("\t"+grading())
    }
    fun getAverage()= (english + math) / 2
    fun passOrFailed()= if (getAverage()>60) "PASS" else "FAILED"

    fun grading() = when(getAverage()){
        in 90..100 -> 'A'
        in 80.. 89 -> 'B'
        in 70.. 79 -> 'C'
        in 60.. 69 -> 'D'
        else -> 'F'}


    fun highest() = if (english > math) {
        print("English:")
        english
    } else {
        print("English:")
        math
    }

}
private fun userInput() {
    val scanner = Scanner(System.`in`)
    print("enter student's name:")
    var name = scanner.next()
    print("enter student's english score:")
    var english = scanner.nextInt()
    print("enter student's math score:")
    var math = scanner.nextInt()
    val stu = Student(name, english, math)
    stu.print()
}