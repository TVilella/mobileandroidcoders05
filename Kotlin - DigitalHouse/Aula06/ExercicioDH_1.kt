fun main(){
    var numeros = arrayListOf<Int>()

    for(i in 0..2){
        print("Digite o ${i+1}º número: ")
        numeros.add(readLine()!!.toInt())
    }
    numeros.sort()
    numeros.reverse()

    println("O maior número digitado foi ${numeros[0]}")

    println("Deseja continuar? Sim (true) Não (false)")
    if(readLine()!!.toBoolean()) main()
}