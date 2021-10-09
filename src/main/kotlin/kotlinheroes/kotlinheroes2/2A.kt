package main.kotlin.kotlinheroes.kotlinheroes2

import java.util.*

class Problem(val complexity: Int, val index: Int)

/**
 * This is a solution for a problem described in https://codeforces.com/contest/1211/problem/A
 */
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()


    val problems = mutableListOf<Problem>()

    for (i in 0 until n) {
        val r = sc.nextInt()
        problems.add(Problem(r, i))
    }

    problems.sortBy{it.complexity}

    val solution = mutableListOf<Int>()
    solution.add(problems[0].index + 1)

    for (i in 1 until n) {
        if (problems[i-1].complexity < problems[i].complexity) {
            solution.add(problems[i].index + 1)
        }
    }

    if (solution.size < 3) {
        println("-1 -1 -1")
    } else {
        println("" + solution[0] + " " + solution[1] + " " + solution[2])
    }
}
