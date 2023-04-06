package level0

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-02-10
 * **/

/** 문제 설명
개미 군단이 사냥을 나가려고 합니다. 개미군단은 사냥감의 체력에 딱 맞는 병력을 데리고 나가려고 합니다.
장군개미는 5의 공격력을, 병정개미는 3의 공격력을 일개미는 1의 공격력을 가지고 있습니다.
예를 들어 체력 23의 여치를 사냥하려고 할 때, 일개미 23마리를 데리고 가도 되지만,
장군개미 네 마리와 병정개미 한 마리를 데리고 간다면 더 적은 병력으로 사냥할 수 있습니다.
사냥감의 체력 hp가 매개변수로 주어질 때,
사냥감의 체력에 딱 맞게 최소한의 병력을 구성하려면 몇 마리의 개미가 필요한지를 return하도록 solution 함수를 완성해주세요. **/

private fun solution(hp: Int): Int {
    var fullHp = hp
    var answer = 0
    while (fullHp > 0) {
        if (fullHp >= 5) {
            fullHp -= 5
            answer += 1
        } else if (fullHp >= 3) {
            fullHp -= 3
            answer += 1
        } else if (fullHp >= 1) {
            fullHp -= 1
            answer += 1
        }
    }
    return answer
}

fun main() {
    val hp = 999
    val result = 201

    checkAnswer(solution(hp) == result)
}