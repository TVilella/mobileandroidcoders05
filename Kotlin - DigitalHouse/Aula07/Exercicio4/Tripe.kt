class Tripe( val alturaMinima: Int, val alturaMaxima: Int) {
    var dobrado: Boolean = true
    var alturaAtual: Int = alturaMaxima

    fun definirAltura(novaAltura: Int){
        alturaAtual = novaAltura
    }

    fun dobrar(){
        dobrado = true
    }

    fun desdobrar(){
        dobrado = false
    }

    fun guardar(){
        dobrar()
        definirAltura(alturaMinima)
    }

    fun prontoParaGuardar(): Boolean{
        return (dobrado && alturaAtual == alturaMinima)
    }

    fun usar(){
        desdobrar()
        definirAltura(alturaMaxima/2)
    }

    fun prontoParaUsar(): Boolean{
        return (!dobrado && ( alturaAtual == (alturaMaxima/2) ) )
    }
}