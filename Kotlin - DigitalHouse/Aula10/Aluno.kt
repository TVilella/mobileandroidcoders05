class Aluno(val nomeAluno: String, val sobrenome:String, val RA: Int): Pessoa(nomeAluno + sobrenome,RA) {
    override val podeDarAula: Boolean
        get() = false

    override val fazChamada: Boolean
        get() = false

    override val podeAssistirAula: Boolean
        get() = true

    override val podeFazerLicao: Boolean
        get() = true

}