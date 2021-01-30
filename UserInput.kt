fun main() {
    print("Enter your name: ")
    val name=readLine()
    print("Enter your age: ")
    val age=Integer.parseInt(readLine())
    print("Enter your designation: ")
    val desg=readLine()
    print("Enter your department: ")
    val depart=readLine()
    println("====================")
    println("Your name is $name")
    println("----------------------")
    println("Your age is ${age+1}")
    println("----------------------")
    println("Your designation is $desg")
    println("----------------------")
    println("Your department is $depart")

}