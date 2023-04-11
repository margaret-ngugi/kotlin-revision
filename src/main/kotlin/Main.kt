fun main() {

    //TOPIC 1(VARIABLES-KOTLIN)
   // You are creating an app to capture student records. Some of the data you will
     //       capture includes full name, age, phone number, weight in kg and citizen. For the
   // citizen field you will track whether a student is a Kenyan or not.

    var name:String = "Diana Atieno"
    println(name)

    var age:Int = 19
    println(age)

    var phoneNumber:String="074563425190"
    println(phoneNumber)

    var weight :Double= 50.0
            println(weight)

    var citizenKenyan=false
    println(citizenKenyan)

    //TOPIC 2(KOTLIN OPERATORS AND FUNCTIONS)
    //Q1
     modulus(23,3)
    //Q2
    addition(40,37,42,45,)
    //Q3
    sentence()



}

//TOPIC 2(KOTLIN OPERATORS AND FUNCTIONS)

// Q1 Create and invoke a function that given 2 numbers returns the remainder of their division
fun modulus(num1:Int,num2:Int){
    var remainder = num1 % num2
    println(remainder)

}



// Q2 Create and invoke function that returns the sum of any given 4 numbers
fun addition(num1: Int,num2: Int,num3:Int,num4:Int){
    var sum = num1+num2+num3+num4
    println(sum)
}



// Q3 Create and invoke a function that prints out an interesting fact about yourself
fun sentence(){
    var sentence = "I love reading books"
    println(sentence)

}