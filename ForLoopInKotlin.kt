fun main() {
    println("You are in main method")
    for(i in 1..5){
        print("$i ")
    }
    println()
    variation1()
}
fun variation1(){
    println("You are in variation1 method")
    for(i in 1..5 step 2){
        print("$i ")
    }
    println()

    variation2()
}
fun variation2(){
    println("You are in variation2 method")
    for(i in 1 until 5){
        print("$i ")
    }
    println()

    variation3()
}
fun variation3(){
    println("You are in variation3 method")
    for(i in 10 downTo 1){
        print("$i ")
    }
    println()

    variation4()
}
fun variation4(){
    println("You are in variation4 method")
    for(i in 10 downTo 1 step 2){
        print("$i ")
    }
    println()

    table()
}
fun table(){
    println("You are in table method")
    println("Enter the number you want to print the table: ")
    val number =Integer.parseInt(readLine())
    for(i in 1..10){
        println("$number X $i = ${i*number}")
    }
}