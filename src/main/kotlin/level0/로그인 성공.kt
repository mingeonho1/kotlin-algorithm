package level0

import checkAnswer

/**
 * © DEV MING 💻
 * Current date: 2023-03-14
 * **/

/** 문제 설명
머쓱이는 프로그래머스에 로그인하려고 합니다.
머쓱이가 입력한 아이디와 패스워드가 담긴 배열 id_pw와 회원들의 정보가 담긴 2차원 배열 db가 주어질 때,
다음과 같이 로그인 성공, 실패에 따른 메시지를 return하도록 solution 함수를 완성해주세요.

아이디와 비밀번호가 모두 일치하는 회원정보가 있으면 "login"을 return합니다.
로그인이 실패했을 때 아이디가 일치하는 회원이 없다면 “fail”를,
아이디는 일치하지만 비밀번호가 일치하는 회원이 없다면 “wrong pw”를 return 합니다. **/

private fun solution(idPw: Array<String>, db: Array<Array<String>>): String {
    var answer = ""
    for (item in db) {
        if (idPw[0] == item[0] && idPw[1] == item[1]) {
            return "login"
        }
        if (idPw[0] == item[0]) {
            answer = "wrong pw"
        }
    }
    if (answer == "") {
        answer = "fail"
    }
    return answer
}

fun main() {
    val idPw = arrayOf("programmer01", "15789")
    val db =
        arrayOf(arrayOf("programmer02", "111111"), arrayOf("programmer00", "134"), arrayOf("programmer01", "1145"))
    val result = "wrong pw"

    checkAnswer(solution(idPw, db) == result)
}