class Professor(val nomeProf: String, val RD:Int): Pessoa(nomeProf,RD) {
    override val podeDarAula: Boolean
        get() = true

    override val fazChamada: Boolean
        get() = true

    override val podeAssistirAula: Boolean
        get() = false

    override val podeFazerLicao: Boolean
        get() = false

}