package main.kotlin.kotlinheroes.kotlinheroes5

import java.util.*

/**
 * This is a solution for a problem described in https://codeforces.com/contest/1431/problem/A
 */
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val t = sc.nextInt()


    for (i in 0 until t) {
        val n = sc.nextInt()
        val customers = LongArray(n) { 0 }
        for (customer in 0 until n) {
            customers[customer] = sc.nextLong()
        }

        customers.max()!!;
        var maxValue = 0L;

        for (customer in 0 until n) {
            val price = customers[customer]
            val income = customers.count { money -> money >= price } * price
            if (income > maxValue) {
                maxValue = income
            }
        }

        println(maxValue)
    }
}