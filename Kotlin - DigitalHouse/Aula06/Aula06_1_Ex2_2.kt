fun main() {
    print("Quanto quer sacar? ")
    var valor: Int = readLine()!!.toInt()

    var qtdnotas = intArrayOf(0, 0, 0, 0, 0);
    val valorNota = intArrayOf(1, 5, 10, 50, 100)


    if(valor in 10..600) {

        for(i in 4 downTo 0) {
            qtdnotas[i] = (valor / valorNota[i])
            valor = (valor % valorNota[i])

            if(qtdnotas[i] > 0) println( "${qtdnotas[i]} notas de ${valorNota[i]}" )
        }

    } else println("Inválido")

}