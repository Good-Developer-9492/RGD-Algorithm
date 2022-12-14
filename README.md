# GD-Algorithm

Real Good Developer's Algorithm Study Repo

## 현재 진행중인 문제

* [프로그래머스 코딩테스트 연습 Lv.1]
  * 프로그래머스 코딩테스트 연습에서 필터링(Lv.1, Java), 정렬(정답률 높은 문제순)

## 진행 방식

* [프로그래머스 코딩테스트 연습]의 문제 풀이
  * Lv의 모든 문제를 풀이했을 시, 동일 레벨의 [스킬 체크] 진행
  * 프로그래머스의 연습문제를 전부 풀이했을 경우 코딩테스트 역량 시험 진행
  * 프로그래머스의 과정이 마무리되면 백준 강의의 문제들, leetcode 등의 문제들로 추후 선택
* 테스트 진행
  * 코딩 테스트 사이트에 직접 붙여넣고 성공 테스트
    * **만약 문제에 예시로 나와있지 않은 반례를 발견하면 테스트 코드에 추가 바람**
  * IntelliJ IDEA에서 JUnit을 활용한 테스트 진행
    * 문제에 나온 Input, Output을 입력하고 객체 변경후 JUnit을 활용한 테스트 진행
    * 테스트 실패할 경우
      * `Execution failed for task ':test'. > No tests found for given includes`
        * IntelliJ 설정에서 Build -> Build Tools -> Gradle의 Build and Run 설정을 Gradle에서 IntelliJ로 수정
      * `Java Version 17 Error`
        * 초기 프로젝트 자바버전을 17로 지정해서 생긴 문제로 추정
        * IntelliJ 설정의 Build -> Compiler -> Java Compiler의 project bytecode version을 11로 수정
* 1일 1문제 풀이 후 PR 진행
  * 패키지명은 문제번호, 파일명은 이름
  * Branch명은 이름/문제번호
  * 문제번호는 문제 사이트의 URL Path중 가장 마지막 숫자
    * https://school.programmers.co.kr/learn/courses/30/lessons/138477
    * 위의 링크의 경우 138477이 문제 번호

## 벌금

* 1일 1 PR 미 참여시 모임통장에 1,000원씩 입금

[프로그래머스 코딩테스트 연습 Lv.1]: https://school.programmers.co.kr/learn/challenges?order=acceptance_desc&levels=1&page=1&languages=java
[프로그래머스 코딩테스트 연습]: https://school.programmers.co.kr/learn/challenges
[스킬 체크]: https://programmers.co.kr/skill_checks
