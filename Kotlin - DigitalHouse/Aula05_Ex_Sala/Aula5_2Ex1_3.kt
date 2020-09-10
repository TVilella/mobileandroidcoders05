fun main(args: Array<String>) {

  print("Digite o 1º número: ")
  var num1: Int = readLine()!!.toInt()
  print("Digite o 2º número: ")
  var num2: Int = readLine()!!.toInt()

  if(num1 < num2){
    for(intervalo in num1+1 .. num2-1){
      println(intervalo)
    }
  }else if (num1 > num2){
    for(intervalo in num2+1 .. num1-1){
      println(intervalo)
    }
  }else println("Sem intervalo entre os valores")
  
}