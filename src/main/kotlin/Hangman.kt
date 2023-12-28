

val words = listOf("ant","cat","flower","tree","cake","rat","comma","computer","krishna")
var mistakes=0
var guesses= arrayListOf<String>()
var remainingGuesses= 6
var word= arrayListOf<String>()



fun main(args: Array<String>) {
    println("Press T for trial mode or Press S to start the game")
    var answer= readln()?:""
    var condition=true

    if (answer.toUpperCase() == "T") {
        test(1)
        condition=false
    } else if (answer.toUpperCase() == "s") {
        test(0)
        condition=false
    } else {
        println("Wrong entry")
    }

    gameSetup(1)
    gameStatus(0)


}



fun gameStatus(mistake: Int){
    when(mistake){
        0 -> mistakes0()
        1 -> mistakes1()
        2 -> mistakes2()
        3 -> mistakes3()
        4 -> mistakes4()
        5 -> mistakes5()
        6 -> mistakes6()

    }
}

fun mistakes0(){
    println("   |------|-")
    println("   |      | ")
    println("   |        ")
    println("   |        ")
    println("   |        ")
    println("   |        ")
    println(" / | \\     ")
    println("/  |  \\    ")

}
fun mistakes1(){
    println("   |------|-")
    println("   |      | ")
    println("   |      O ")
    println("   |        ")
    println("   |        ")
    println("   |        ")
    println(" / | \\     ")
    println("/  |  \\    ")

}
fun mistakes2(){
    println("   |------|-")
    println("   |      | ")
    println("   |      O ")
    println("   |      | ")
    println("   |      | ")
    println("   |        ")
    println(" / | \\     ")
    println("/  |  \\    ")

}
fun mistakes3(){
    println("   |------|-")
    println("   |      | ")
    println("   |      O ")
    println("   |     /| ")
    println("   |      | ")
    println("   |        ")
    println(" / | \\     ")
    println("/  |  \\    ")

}
fun mistakes4(){
    println("   |------|-")
    println("   |      | ")
    println("   |      O ")
    println("   |     /|\\ ")
    println("   |      | ")
    println("   |        ")
    println(" / | \\     ")
    println("/  |  \\    ")

}
fun mistakes5(){
    println("   |------|-")
    println("   |      | ")
    println("   |      O ")
    println("   |     /|\\")
    println("   |      | ")
    println("   |     /  ")
    println(" / | \\     ")
    println("/  |  \\    ")

}
fun mistakes6(){
    println("   |------|-")
    println("   |      | ")
    println("   |      O ")
    println("   |     /|\\")
    println("   |      | ")
    println("   |     / \\ ")
    println(" / | \\     ")
    println("/  |  \\    ")

}

fun gamestart(){

    println("-----@@@@@@-------@------@-----@--@@@@@@-------@@@@@@@---@-------@--@@@@@@---@@@@@@----")
    println("-----@-----------@-@-----@-@-@-@--@------------@-----@----@-----@---@--------@----@----")
    println("-----@--@@@-----@---@----@--@--@--@@@@@--------@-----@-----@---@----@@@@@----@@@@@@----")
    println("-----@----@----@-@-@-@---@-----@--@------------@-----@------@-@-----@--------@-@-------")
    println("-----@@@@@@---@-------@--@-----@--@@@@@@-------@@@@@@@-------@------@@@@@@---@---@-----")

}

fun test(varr:Int){
    if (varr==1){
        println("value is 1")
    }
    else if(varr==0){
        println("value is 0")

    }else{
        println("Idiot")
    }
}