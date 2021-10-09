package main.kotlin.kotlinheroes.kotlinheroes6

import java.util.*

/**
 * This is a solution for a problem described in https://codeforces.com/contest/1488/problem/A
 */
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val t = sc.nextInt()

    for (i in 0 until t) {
        val x = sc.nextLong()
        var y = sc.nextLong()

        var count = 0;
        while (y > 0) {
            var biggest = 0L
            if (x < y) {
                biggest = findTheBiggestElementForKotlinHeroes6A(x, y)
                y -= biggest;
                count++;
            } else if (x == y) {
                count++;
                break;
            } else {
                count += y.toInt()
                break;
            }
        }

        println(count)
    }
}

fun findTheBiggestElementForKotlinHeroes6A(x: Long, y: Long): Long {
    var previous = 1L
    var k = x
    while (k <= y) {
        previous = k
        k *= 10
    }
    return previous;
}