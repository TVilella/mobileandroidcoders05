fun main(args: Array<String>) {
  var maiorValor:Double = Double.MIN_VALUE 
  for(numero in 1..5){
    print("Digite o $numero º número: ")
    var numeroLido: Double = readLine()!!.toDouble()
    if(numeroLido > maiorValor) maiorValor = numeroLido
  }
  println("O maior numero foi: $maiorValor")
}