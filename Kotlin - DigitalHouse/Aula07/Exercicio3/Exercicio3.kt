fun main(){
    var atleta1 = Atleta("Felipe")
    var atleta2 = Atleta("Lucas")

    atleta1.energia = 50
    atleta1.nivel = 5
    atleta2.nivel = 2

    var provaFacil = Prova(1,10)
    var provaChata = Prova(2,60)
    var provaDificil = Prova(4,40)

    if(provaFacil.podeRealizar(atleta1)) println("O ${atleta1.nome} pode realizar a prova")
    else println("O ${atleta1.nome} não pode realizar a prova")

    if(provaChata.podeRealizar(atleta1)) println("O ${atleta1.nome} pode realizar a prova")
    else println("O ${atleta1.nome} não pode realizar a prova")

    if(provaDificil.podeRealizar(atleta1)) println("O ${atleta1.nome} pode realizar a prova")
    else println("O ${atleta1.nome} não pode realizar a prova")

    if(provaFacil.podeRealizar(atleta2)) println("O ${atleta2.nome} pode realizar a prova")
    else println("O ${atleta2.nome} não pode realizar a prova")

    if(provaChata.podeRealizar(atleta2)) println("O ${atleta2.nome} pode realizar a prova")
    else println("O ${atleta2.nome} não pode realizar a prova")

    if(provaDificil.podeRealizar(atleta2)) println("O ${atleta2.nome} pode realizar a prova")
    else println("O ${atleta2.nome} não pode realizar a prova")

}