fun main(args: Array<String>) {
  print("Digite o Número: ")
  var numero: Int = readLine()!!.toInt()
  var resto: Double = numero % 2.0

  if(resto > 0) println("O número $numero é impar")
  else println("O número $numero é par")
}