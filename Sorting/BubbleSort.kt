private fun less(value1: Int, value2: Int): Boolean {
    return value1 < value2
}

private fun greater(value1: Int, value2: Int): Boolean {
    return value1 > value2
}

fun BubbleSort(arr: IntArray) {
    val size = arr.size
    var i: Int
    var j: Int
    var temp: Int
    i = 0
    while (i < size - 1) {
        j = 0
        while (j < size - i - 1) {
            if (greater(arr[j], arr[j + 1])) {
                /* Swapping */
                temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
            }
            j++
        }
        i++
    }
}

fun BubbleSort2(arr: IntArray) {
    val size = arr.size
    var i: Int
    var j: Int
    var temp: Int
    var swapped = 1
    i = 0
    while (i < size - 1 && swapped == 1) {
        swapped = 0
        j = 0
        while (j < size - i - 1) {
            if (greater(arr[j], arr[j + 1])) {
                temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
                swapped = 1
            }
            j++
        }
        i++
    }
}

// Testing code
fun main() {
    val array = intArrayOf(9, 1, 8, 2, 7, 3, 6, 4, 5)
    BubbleSort(array)
    for (i in array.indices) {
        print(array[i].toString() + " ")
    }
    println()
    val array2 = intArrayOf(9, 1, 8, 2, 7, 3, 6, 4, 5)
    BubbleSort2(array2)
    for (i in array2.indices) {
        print(array2[i].toString() + " ")
    }
}