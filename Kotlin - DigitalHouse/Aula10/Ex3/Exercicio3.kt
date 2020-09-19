fun main(){
    var pepino = Estoque("Picles", 100, 30)

    println(pepino.mostra())

    pepino.mudarNome("Pepino")

    pepino.mudarQtdMinima(45)

    pepino.darBaixa(250)
    pepino.darBaixa(80)

    if(pepino.precisaRepor()) pepino.repor(pepino.qtdMinima)

    println(pepino.mostra())
}