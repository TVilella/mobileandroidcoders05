fun main(args: Array<String>) {
  print("Digite a nota 1: ")
  val nota1 = readLine()!!.toFloat()
  print("Digite a nota 2: ")
  val nota2 = readLine()!!.toFloat()
  print("Digite a nota 3: ")
  val nota3 = readLine()!!.toFloat()
  print("Digite a nota 4: ")
  val nota4 = readLine()!!.toFloat()

  var media: Float = ( nota1 + nota2 + nota3 + nota4 ) / 4

  print("A média é $media")
}