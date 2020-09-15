fun main(){
    val numeros = arrayOfNulls<Int>(4)

    for(i in 0..3){
        print("Digite o ${i+1}º numero ")
        numeros[i] = readLine()!!.toInt()
    }

//    return print(maiorQue(numeros[0] ,numeros[2] ,numeros[3]) || maiorQue(numeros[1] ,numeros[2] ,numeros[3]) )

    return print( (numeros[0]!! > numeros[2]!! && numeros[0]!! > numeros[3]!!) || (numeros[1]!! > numeros[2]!! && numeros[1]!! > numeros[3]!!))
}

//fun maiorQue(num1: Int, num2: Int, num3:Int): Boolean{
//    return ((num1 > num2) && (num1 > num3))
//}