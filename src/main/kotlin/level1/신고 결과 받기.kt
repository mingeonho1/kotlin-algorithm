package level1

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-07-22
 * **/

/** 이제 백준 허브로 자세한 내용이 커밋되고 여기는 풀이만 작성 **/

private fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
    val idMap = mutableMapOf<String, Int>()
    val reportMap = mutableMapOf<String, HashSet<String>>()

    id_list.forEach { id ->
        reportMap[id] = hashSetOf()
        idMap[id] = 0
    }

    report.forEach { re ->
        val reporter = re.split(" ")
        val from = reporter[0]
        val to = reporter[1]

        // 신고를 한 사람을 추가하는게 아니라 신고를 받은 사람을 추가
        // 반대로 생각하기
        reportMap[to]?.add(from)
    }

    id_list.forEach { it ->
        if (reportMap[it]!!.size >= k) {
            reportMap[it]?.forEach { idMap[it] = idMap[it]!! + 1 }
        }
    }

    return idMap.values.toIntArray()
}

fun main() {
    val idList = arrayOf("muzi", "frodo", "apeach", "neo")
    val report = arrayOf("muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi")
    val k = 2
    val answer = intArrayOf(2, 1, 1, 0)

    checkAnswer(solution(idList, report, k).contentEquals(answer))
}