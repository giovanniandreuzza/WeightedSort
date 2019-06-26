fun main(args: Array<String>) {
    val a = mutableListOf<Int>()

    var mp = 0.0
    var sum = 0.0

    for (i in 1..1000000) {
        a.add(i)
    }

    val indexOfItem = weightedSort(a.toTypedArray(), getMp(a.toTypedArray()), 100)

    if (indexOfItem < a.size)
        println("Element at $indexOfItem -> ${a[indexOfItem]}")
    else
        println("i > size")

}

fun getMp(array: Array<Int>): Double {
    var mp = 0.0
    var sum = 0.0

    for (i in 0 until array.size) {
        val p: Double = i.toDouble() / array[i]
        mp += array[i] * p
        sum += p
    }

    return mp / sum
}

fun weightedSort(array: Array<Int>, mp: Double, x: Int): Int {
    return ((x * mp) / (mp + x)).toInt()
}