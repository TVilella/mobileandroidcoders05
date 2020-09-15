fun main(){
    var jogador1 = JogadorDeFutebol("Felipe")
    var jogador2 = JogadorDeFutebol("Lucas", 80)

    jogador1.experiencia = 10
    jogador2.experiencia = 8

    val treinoSimples = SessaoDeTreinamento(1)

    treinoSimples.treinarA(jogador1)
    treinoSimples.treinarA(jogador2)
}