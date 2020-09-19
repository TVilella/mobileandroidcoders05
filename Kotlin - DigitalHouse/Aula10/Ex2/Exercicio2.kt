fun main(){
    var fatura1 = Fatura()
    var item1 = Item(1, "Item1", 2 , 3.50)
    var item2 = Item(2,"Item2", 3, 5.20)

    fatura1.itens.add(item1)
    fatura1.itens.add(item2)

    print(fatura1.getTotalFatura())
}