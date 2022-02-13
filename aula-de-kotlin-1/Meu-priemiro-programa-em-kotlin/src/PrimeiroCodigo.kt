fun main() {
    println(max2(81, 15))
}

// corpo de bloco
fun max(a: Int, b:Int): Int{
    return if ( a > b ) a else b
}

// corpo de expressão
fun max1(a:Int, b:Int): Int = if (a>b) a else b

// corpo de expressão sem a declaração do tipo de expressão
fun max2 (a: Int, b:Int) = if (a>b) a else b