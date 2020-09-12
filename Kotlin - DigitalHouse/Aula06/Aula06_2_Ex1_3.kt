fun main(){
    print(somaImposto(10.0,100.0) )
}

fun somaImposto(taxa:Double, custo:Double): Double {
    return custo / ((100.0-taxa)/100.00)
}