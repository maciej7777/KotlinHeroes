package main.kotlin.kotlinheroes.kotlinheroes5

import java.util.*

/**
 * This is a solution for a problem described in https://codeforces.com/contest/1431/problem/C
 */
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val t = sc.nextInt()


    for (i in 0 until t) {
        val n = sc.nextInt()
        val k = sc.nextInt()

        val items = Array(n) { 0 }
        for (item in 0 until n) {
            items[item] = sc.nextInt()
        }

        if (n == 1) {
            println((1/k).toInt() * items[0])
        } else {
            items.sortDescending()
            var maxValue = 0
            var elementsBought = k
            var time = 1
            while (elementsBought <= items.size) {
                val priceReduction = items.copyOfRange(elementsBought-time, elementsBought).sum()
                if (priceReduction > maxValue) {
                    maxValue = priceReduction
                }
                elementsBought+=k
                time++
            }
            println(maxValue)
        }
    }
}