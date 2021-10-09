package main.kotlin.kotlinheroes.kotlinheroes8

import java.util.*

/**
 * This is a solution for a problem described in https://codeforces.com/contest/1571/problem/B
 */
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val t = sc.nextInt()

    for (i in 0 until t) {
        sc.nextLong()
        val dayA = sc.nextLong()
        val a = sc.nextLong()
        sc.nextLong()
        val c = sc.nextLong()
        val dayB = sc.nextLong()

        if (a == c) {
            println(a)
        } else {
            println(c.coerceAtMost(dayB-dayA+a))
        }
    }
}