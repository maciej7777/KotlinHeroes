package main.kotlin.kotlinheroes.kotlinheroes4

import java.util.*

data class TestCase(val n: Int, val k: Int)

/**
 * This is a solution for a problem described in https://codeforces.com/contest/1346/problem/A
 */
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val testCasesNumber = sc.nextInt()

    val testCases = mutableListOf<TestCase>()

    for (i in 0 until testCasesNumber) {
        val testCase = TestCase(sc.nextInt(), sc.nextInt())
        testCases.add(testCase)
    }

    for (i in 0 until testCasesNumber) {
        val n1 = testCases[i].n / (1 + testCases[i].k + testCases[i].k * testCases[i].k + testCases[i].k * testCases[i].k * testCases[i].k)
        val n2 = n1 * testCases[i].k
        val n3 = n2 * testCases[i].k
        val n4 = n3 * testCases[i].k

        println("$n1 $n2 $n3 $n4");
    }
}