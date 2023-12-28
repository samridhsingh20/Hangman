





fun gameSetup(value: Int){
    var gameover=true
    var newword = words.random()
    println(newword.length)
    for(i in 0.. newword.length-1){
        guesses.add("_")
    }
    for(j in newword){
        word.add(j.toString())
    }


    while (gameover){
        for(i in guesses){
            print(i)
        }
        println()
        println("$remainingGuesses guesses remaining")

        println("Enter a letter: ")
        var input= readLine()?:""
        var i=0
        for(i in 0..word.size-1){
            if(word[i]==input){
                guesses.set(i,word[i])

            }

        }
        if(!word.contains(input)){
            mistakes++
            remainingGuesses--
        }
        gameStatus(mistakes)
        println()

        if(mistakes==6){
            println("You Lost")
            gameover= false
            gamestart()
        }
        if(word == guesses) {
            println("Holaaaaaaaaaaaaaaaaaa")
            gameover=false
            gamestart()
        }

    }

}

