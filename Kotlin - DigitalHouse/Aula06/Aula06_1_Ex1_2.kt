fun main() {
    val numeros = ArrayList<Int>()

    for (i in 1..10) {
        print("digite o $i numero: ")
        val numero: Int = readLine()!!.toInt()
        numeros.add(numero)
    }

    numeros.reverse()

    numeros.forEach { numero -> println(numero) }
}