package main.kotlin.kotlinheroes.kotlinheroes2

import java.util.*
import kotlin.math.min

class Day(val min: Long, val max: Long, val cost: Long)

/**
 * This is a solution for a problem described in https://codeforces.com/contest/1211/problem/C
 */
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val nOfDays = sc.nextInt()
    var ices = sc.nextLong()

    val days = mutableListOf<Day>()

    for (i in 0 until nOfDays) {
        val a = sc.nextLong()
        val b = sc.nextLong()
        val c = sc.nextLong()
        days.add(Day(a, b, c))
    }

    var minPrice: Long = 0
    for (i in 0 until nOfDays) {
        minPrice += days[i].min * days[i].cost
        ices -= days[i].min
    }

    days.sortBy { it.cost }

    for (i in 0 until nOfDays) {
        if (ices > 0) {
            val icesToTake = min(days[i].max - days[i].min, ices)

            minPrice += icesToTake * days[i].cost
            ices -= icesToTake
        }
    }

    if (ices != 0L) {
        println("-1")
    } else {
        println(minPrice)
    }
}