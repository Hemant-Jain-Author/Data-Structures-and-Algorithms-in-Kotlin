private fun greater(value1: Int, value2: Int): Boolean {
    return value1 > value2
}

fun InsertionSort(arr: IntArray) {
    val size = arr.size
    var temp: Int
    var j: Int
    for (i in 1 until size) {
        temp = arr[i]
        j = i
        while (j > 0 && greater(arr[j - 1], temp)) {
            arr[j] = arr[j - 1]
            j--
        }
        arr[j] = temp
    }
}

// Testing code
fun main() {
    val array = intArrayOf(9, 1, 8, 2, 7, 3, 6, 4, 5)
    InsertionSort(array)
    for (i in array.indices) {
        print(array[i].toString() + " ")
    }
}
