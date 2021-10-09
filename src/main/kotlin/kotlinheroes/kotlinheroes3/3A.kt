package main.kotlin.kotlinheroes.kotlinheroes3

import java.util.*

/**
 * This is a solution for a problem described in https://codeforces.com/contest/1297/problem/A
 */
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()

    val numbers = mutableListOf<Int>()

    for (i in 0 until n) {
        val r = sc.nextInt()
        numbers.add(r)
    }

    for (i in 0 until n) {
        when {
            numbers[i] < 1000 -> {
                println(numbers[i])
            }
            numbers[i] < 999500 -> {
                var textNumber = numbers[i] / 1000;
                if (numbers[i] - textNumber * 1000 > 499) {
                    textNumber++;
                }
                println(""+textNumber+"K")
            }
            numbers[i] < 1000000 -> {
                println("1M")
            }
            else -> {
                var textNumber = numbers[i] / 1000000;
                if (numbers[i] - textNumber * 1000000 > 499999) {
                    textNumber++;
                }
                println(""+textNumber+"M")
            }
        }
    }
}