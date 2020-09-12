fun main() {
    val alturas = ArrayList<Double>()

    for (i in 1..5) {
        print("digite a $i altura: ")
        val altura: Double = readLine()!!.toDouble()
        alturas.add(altura)
    }

    alturas.reverse()

    alturas.forEach { altura -> println(altura) }
}