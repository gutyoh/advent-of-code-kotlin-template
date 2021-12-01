fun main() {
    fun part1(input: List<String>): Int {
        // return input.size
        var counter = 0
        val numberList = input.map { it.toInt() }

        for (i in numberList.indices) {
            // if it's the last number end the loop
            if (i == numberList.size - 1) {
                break
            }
            if (numberList[i+1] > numberList[i]) {
                counter++
            }
        }
        return counter
    }

    fun part2(input: List<String>): Int {
        // return input.size
        var counter = 0
        val numberList = input.map { it.toInt() }

        for (i in numberList.indices) {
            // if it's the last number end the loop
            if (i == numberList.size - 3) {
                break
            }
            if (numberList[i+1] + numberList[i+2] + numberList[i+3] > numberList[i] + numberList[i+1] + numberList[i+2]) {
                counter++
            }
        }
        return counter
    }

    // test if implementation meets criteria from the description, like:
    // val testInput = readInput("Day01_test")
    // check(part1(testInput) == 1)

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
