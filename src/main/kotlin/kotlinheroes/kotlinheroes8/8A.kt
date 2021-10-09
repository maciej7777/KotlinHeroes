package main.kotlin.kotlinheroes.kotlinheroes8

import java.util.*

/**
 * This is a solution for a problem described in https://codeforces.com/contest/1571/problem/A
 */
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val t = sc.nextInt()
    sc.nextLine()

    for (i in 0 until t) {
        val x = sc.nextLine()

        if (x.contains('<') && x.contains('>')) {
            println("?")
        } else if (x.contains('<')) {
            println("<")
        } else if (x.contains('>')) {
            println(">")
        } else {
            println("=")
        }
    }
}