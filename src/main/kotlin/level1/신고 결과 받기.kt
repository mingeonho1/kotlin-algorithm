package level1

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-07-22
 * **/

/** 이제 백준 허브로 자세한 내용이 커밋되고 여기는 풀이만 작성 **/

private fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
    var answer: IntArray = intArrayOf()

    val reportMap = hashMapOf<String, MutableList<String>>()

    id_list.forEach { id ->
        reportMap[id] = mutableListOf()
    }

    report.forEach { re ->
        val reporter = re.split(" ")
        val from = reporter[0]
        val to = reporter[1]

        reportMap[to]?.add(from)
    }

    // 이제 한명의 신고는 하나로 처리해야함
    // 그 다음 k랑 비교해서 메일 개수 확인

    return answer
}

fun main() {
    val idList = arrayOf("muzi", "frodo", "apeach", "neo")
    val report = arrayOf("muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi")
    val k = 2
    val answer = intArrayOf(2, 1, 1, 0)

    checkAnswer(solution(idList, report, k).contentEquals(answer))
}