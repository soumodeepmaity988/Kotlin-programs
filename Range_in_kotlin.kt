fun main() {
    println("You are in main method")
    val number =10
    val result=number in 1..5
    println(result)
    userInput()
}

fun userInput() {
    println("You are in userInput method")
    print("Enter the value of number: ")
    val number =Integer.parseInt(readLine())
    val result=number in 1..5
    println(result)
}