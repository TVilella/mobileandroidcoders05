fun main(args: Array<String>) {
  while(true){
    print("Primeira nota: ")
    var nota1: Double = readLine()!!.toDouble()

    print("Segunda nota: ")
    var nota2: Double = readLine()!!.toDouble()

    var media: Double = (nota1 + nota2) /2

    if(media == 10.0){
      println("Aprovado com distinção")
    }else if(media >= 7.0){
      println("Aprovado")
    }else{
      println("Reprovado")
    } 
  }
}