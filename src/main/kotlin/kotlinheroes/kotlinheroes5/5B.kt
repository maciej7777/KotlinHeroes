package main.kotlin.kotlinheroes.kotlinheroes5

import java.util.*

/**
 * This is a solution for a problem described in https://codeforces.com/contest/1431/problem/B
 */
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val t = sc.nextInt()

    for (i in 0 until t) {
        val language = sc.next()

        var underlined = 0
        var previous = ' '
        var previousVUnderlined = false;
        for (j in language.indices) {
            if (language[j] == 'w') {
                underlined++
                previousVUnderlined = false
            } else if (previous == 'v' && !previousVUnderlined) {
                underlined++
                previousVUnderlined = true
            } else {
                previousVUnderlined = false
            }

            previous = language[j];
        }

        println(underlined)
    }
}