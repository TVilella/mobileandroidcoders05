abstract class Pessoa(val nome: String, val numeroRegistro: Int) {
    abstract val podeDarAula: Boolean
    abstract val fazChamada: Boolean
    abstract val podeAssistirAula: Boolean
    abstract val podeFazerLicao: Boolean

}