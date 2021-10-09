package main.kotlin.kotlinheroes.kotlinheroes2

import java.util.*

/**
 * This is a solution for a problem described in https://codeforces.com/contest/1211/problem/B
 */
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()

    val integers = Array(n) { 0 }
    for (i in 0 until n) {
        integers[i] = sc.nextInt()
    }

    val max:Long = integers.max()!!.toLong()
    val maxIndex = integers.indices.maxWith(compareBy(
        {integers[it]},
        {it}
    )) ?: -1

    if (max > 1) {
        println((max - 1) * n + maxIndex + 1)
    } else {
        println(maxIndex + 1)
    }
}