package baekjoon.kotlin

fun main() {

    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    var changes = 1000 - br.readLine().toInt()
    var cnt = 0

    listOf(500, 100, 50, 10, 5, 1).forEach {
        if (changes > it) {
            cnt += changes / it
            changes %= it
        }
    }

    bw.write("$cnt")
    bw.flush()
    bw.close()
}