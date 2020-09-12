fun main(){
    while(true) {
        var numRecebido = readLine()!!.toInt()
        println(positivoNegativo(numRecebido))
    }
}

fun positivoNegativo(recebido: Int): Char {

    if(recebido > 0 ) return 'P'

    return 'N'
}