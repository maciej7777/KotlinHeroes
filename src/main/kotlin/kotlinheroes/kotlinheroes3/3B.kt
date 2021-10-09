package main.kotlin.kotlinheroes.kotlinheroes3

import java.util.*

class DataPoint(val day: Int, val type: Int)

/**
 * This is a solution for a problem described in https://codeforces.com/contest/1297/problem/B
 */
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val testCases = sc.nextInt()

    for (i in 0 until testCases) {
        val numberOfCartoons = sc.nextInt()
        val datePoints = mutableListOf<DataPoint>()
        for (j in 0 until numberOfCartoons) {
            datePoints.add(DataPoint(sc.nextInt(), -1))
            datePoints.add(DataPoint(sc.nextInt() + 1, 1))
        }

        println(getDayForKotlinHeroes3B(datePoints))
    }
}

fun getDayForKotlinHeroes3B(cartoons: MutableList<DataPoint>): Int {
    val sortedCartoons = cartoons.sortedWith(compareBy(DataPoint::day))

    var currentDate = sortedCartoons.get(0).day
    var currentValue = 1

    for (i in 1 until sortedCartoons.size) {
        if (sortedCartoons.get(i).day > currentDate && currentValue == 1) {
            return currentDate
        }
        currentDate = sortedCartoons.get(i).day

        if (sortedCartoons.get(i).type==1) {
            currentValue--
        } else {
            currentValue++
        }
    }

    return -1
}
