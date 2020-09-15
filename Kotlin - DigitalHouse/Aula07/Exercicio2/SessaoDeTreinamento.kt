class SessaoDeTreinamento (val experiencia: Int){
    fun treinarA(jogador: JogadorDeFutebol){
        jogador.correr()
        jogador.fazerGol()
        jogador.correr()

        var expAnt = jogador.experiencia
        jogador.experiencia += experiencia

        return println("Experiencia Inicial: ${expAnt} | Experiencia Final: ${jogador.experiencia}")
    }
}