fun main(args: Array<String>) {
  print("Informe o número: ")
  var numero: Int = readLine()!!.toInt()

  for(multip in 1..10){
    var resultado: Int = numero * multip
    println("$numero X $multip = $resultado")
  }
}