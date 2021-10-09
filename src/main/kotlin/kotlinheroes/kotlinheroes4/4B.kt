package main.kotlin.kotlinheroes.kotlinheroes4

import java.lang.Integer.min
import java.util.*

data class BootCamp(val days: Int, val k1: Int, val k2: Int, val schedule: String)

/**
 * This is a solution for a problem described in https://codeforces.com/contest/1346/problem/B
 */
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val testCasesNumber = sc.nextInt()

    val testCases = mutableListOf<BootCamp>()

    for (i in 0 until testCasesNumber) {
        val testCase = BootCamp(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.next())
        testCases.add(testCase)
    }

    for (i in 0 until testCasesNumber) {
        var previousDay = 0
        var lectures = 0
        for (dayStatus in testCases[i].schedule.toCharArray()) {
            if (dayStatus == '1') {
                val lecturesToday = min(testCases[i].k2 - previousDay, testCases[i].k1)
                lectures += lecturesToday
                previousDay = lecturesToday
            } else {
                previousDay = 0
            }
        }
        println(lectures)
    }
}