fun main() {
    var sistemasOperacionais = intArrayOf(0, 0, 0, 0, 0, 0);
    val nomeSistema = arrayOf("Windows Server ", "Unix ", "Linux ", "Netware ", "Mac OS ", "Outros ")
    var totalVotos = 0

    do{
        print("Digite seu voto: ")
        var voto: Int = readLine()!!.toInt()

        if(voto < 0 || voto > 6){
            println("número inválido")
            continue
        }else if(voto == 0) break

        sistemasOperacionais[voto-1]++
        totalVotos++

    }while(true)

    for(i in 0..5){
        print(nomeSistema[i])
        print("| ")
        print(sistemasOperacionais[i])
        print(" | ")

        var percentual: Double = (sistemasOperacionais[i]*100.0) / totalVotos
        print("%.2f".format(percentual))
        println(" %")
    }

    print(totalVotos)
}