fun main(args: Array<String>) {
  while(true){
    print("Quanto quer sacar? ")
    var valor: Int = readLine()!!.toInt()

    if(valor > 600 || valor < 10) {
      println("Valor inválido")
      continue
    }

    var qtdNota100 :Int = valor / 100  
    var resto: Int = valor % 100 
    var qtdNota50  :Int = resto / 50
    resto = resto % 50
    var qtdNota10  :Int = resto / 10
    resto %= 10
    var qtdNota5   :Int = resto / 5
    resto %= 5
    var qtdNota1   :Int = resto / 1

    if(qtdNota100 > 0) println("$qtdNota100 notas de 100")
    if(qtdNota50 > 0) println("$qtdNota50 notas de 50")
    if(qtdNota10 > 0) println("$qtdNota10 notas de 10")
    if(qtdNota5 > 0) println("$qtdNota5 notas de 5")
    if(qtdNota1 > 0) println("$qtdNota1 notas de 1")
  }
}