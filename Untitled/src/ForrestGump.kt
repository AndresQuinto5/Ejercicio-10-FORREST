class ForrestGump<Chocolate>(val life: BoxOfChocolateR<Chocolate>){
    var isRunning: Boolean = false
    fun runForrest(){
        isRunning = true
    }

    fun sayTheLineForrest(): String {
        val picked =life.pickOne()

        if (picked == null){
            return "Life is a sheet >:c"
        }
        return "Life is like a box of chocolates! \n${picked}"
    }
}

