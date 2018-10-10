fun main(args: Array<String>) {
    val BoxOfChocolate = BoxOfChocolateR<Chocolate>(arrayListOf<Chocolate>(
            Chocolate("chocolate 1", "cafè", 2000),
            Chocolate("chocolate 2", "Cerezita", 2000),
            Chocolate("chocolate 3", "banana tropical", 2000)

    ));


    val forrest = ForrestGump<Chocolate>(BoxOfChocolate);
    println(forrest.sayTheLineForrest())
    println(forrest.sayTheLineForrest())
    println(forrest.sayTheLineForrest())
    println(forrest.sayTheLineForrest())
    println(forrest.sayTheLineForrest())
}