fun main(){
    var meuTripe = Tripe(70,170)

    if(meuTripe.prontoParaGuardar()) println("Tripé pronto para guardar")
    else {
        print("Não esta pronto falta: ")
        if(!meuTripe.dobrado) println("dobrar o tripé")
        if(meuTripe.alturaAtual != meuTripe.alturaMinima) println("recolher o tripe")
    }

    meuTripe.guardar()
    if(meuTripe.prontoParaGuardar()) println("Tripé pronto para guardar")
}