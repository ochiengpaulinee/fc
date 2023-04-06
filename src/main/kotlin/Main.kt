import java.nio.DoubleBuffer

fun main(){
//ageClassified(1)
//    ageClassified(3)
//    ageClassified(15)
//    ageClassified(23)
////    isPositive(2)
////    isPositive(-60)
////    shoeSize(41)
////    shoeSize(37)
//    countryNationality("Rwanda")
//    countryNationality("Ghana")
//    countryNationality("Portugal")
//    countryNationality("Kenya")
//    countryNationality("America")


    println(mixed(arrayOf("home",5,6.5,7.5,"hey",7.0)))
    var numbers = arrayOf(37,52,66,107,38,91)
    println(numbers)

    var languages = arrayOf("zulu","Kiswahili","Luganda")
    for (lang in languages){
        println("I can speak $lang")
    }

    for (x in 64..74){
        println(x*x)
    }
    val name = "Adalab"
    for (x in name){
        println(x)
    }
//    val nums = arrayOf(1,2,3,4)
//    val squares = emptyList<Int>()
//    nums.forEachIndexed{index,num ->
//        square[index] =
//   }
}

fun ageClassified(age:Int){
//    if(age in 0..1) {
//        println("You are a baby")
//    }
//    else if(age in 2..3){
//        println("you are a toddler")
//    }
//    else if(age in 4..17){
//        println("you are a child")
//    }
//    else{
//        println("you are an adult")
//    }
    when(age){
        in 0..1 -> println("you are a baby")
        in 2 ..3 -> println("you are a toddler")    //can use instead of if..elseif...else
        in 4..17 -> println("you are a child")
        else -> println("you are an adult")
    }
}
fun isPositive(num:Int){
    if(num > 0){
        println("positive")
    }
    else{
        println("negative")
    }
}

//write a function that takes in a country name and prints out the correspondent nationality for
//each of the following countries:
//Rwanda,Ghana,Portugal,Wales.
//Any other country should default to "Not applicable"

fun countryNationality(country:String){
//    if(country == "Rwanda"){
//        println("Rwandese")
//    }
//    else if (country === "Ghana"){
//        println("Ghanian")
//    }
//    else if (country =="Portugal" ){
//        println("Portugese")
//    }
//    else if (country == "Wales"){
//        println("Walian")
//    }
//    else{
//        println("Not applicabe")
//    }
    when(country){
        in "Rwanda" -> println("Rwandese")
        in "Ghana" -> println("Ghanian")
        in "Portugal" -> println("Portugese")
        in "Walian" -> println("Walish")
        else -> println("Not applicable")
    }
}

//Write a function that takes in array of random integers and prints out whether
//each is odd or even

//fun numbers(nums:Int){
//  var num = arrayOf(37,52,66,107,38,91)
//    for(n/2 in nums){
//        println("even")
//    }
//}
fun numbers(nums:Array<Int>){
    for(num in nums)
        if(num%2==0){
            println("even")
        }
            else{
                println("odd")
            }
}

//write a function that takes in an array of mixed types
//and returns the sum of all
//the decimal elements

fun mixed( mix:Array<Any>):Double{
    var decimals = 0.0
for(mixx in mix){
    if(mixx is Double){
        decimals +=mixx
    }
}
return decimals
}
