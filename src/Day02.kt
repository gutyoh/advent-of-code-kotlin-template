fun main() {
    fun part1(input: List<String>): Int {
        var horizontalPosition = 0
        var depthPosition = 0

        val commandList = input.map { it.split(" ") }

        for (command in commandList) {
            if (command[0] == "forward") {
                horizontalPosition += command[1].toInt()
            } else if (command[0] == "up") {
                depthPosition -= command[1].toInt()
            } else if (command[0] == "down") {
                depthPosition += command[1].toInt()
            }
        }
        return horizontalPosition * depthPosition
    }

    fun part2(input: List<String>): Int {
        var horizontalPosition = 0
        var depthPosition = 0

        var aim = 0

        val commandList = input.map { it.split(" ") }

        for (command in commandList) {
            if (command[0] == "forward") {
                horizontalPosition += command[1].toInt()
                depthPosition += (command[1].toInt() * aim)
            } else if (command[0] == "up") {
                aim -= command[1].toInt()
            } else if (command[0] == "down") {
                aim += command[1].toInt()
            }
        }
        return horizontalPosition * depthPosition
    }

    val input = readInput("Day02")
    println(part1(input))
    println(part2(input))
}