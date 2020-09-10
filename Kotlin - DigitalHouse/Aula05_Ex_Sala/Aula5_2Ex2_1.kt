fun main(args: Array<String>) {
  print("Quantas notas? ")
  var qtdNotas: Int = readLine()!!.toInt()
  var soma: Int = 0

  for(qtd in 1..qtdNotas){
    print("digite a $qtd nota: ")
    soma += readLine()!!.toInt()
  }

  var resultado: Int = soma / qtdNotas
  println("A média é de: $resultado")
}