fun main(args: Array<String>) {
    var num= mutableListOf(100,20,5,80,10,500,2)
    println("list before editing$num")
    var numw= mutableListOf<Int>()
    for(i in 0 until num.size-1){
     var plus=num[i]+1
       var square=plus*plus
        if (square >100){
            numw.add(square-10)
       }
    }
    println("list after some operations $numw")
        numw.reverse()
    println("list after reverse it $numw")
        if (numw.size>=3){
          val  average=(numw[0]+numw[1]+numw[2])/3
    println("average for first 3 numbers after reverse $average ")}
}