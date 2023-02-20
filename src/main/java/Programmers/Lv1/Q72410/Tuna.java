package Programmers.Lv1.Q72410;

public class Tuna {
    // (5ms / 74MB)
    public String solution(String new_id) {
        // 1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
        StringBuilder answer = new StringBuilder(new_id.toLowerCase());
        System.out.println("STEP1:\t" + answer);

        // 2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
        answer = new StringBuilder(answer.toString().replaceAll("[^a-z0-9-_.]", ""));
        System.out.println("STEP2:\t" + answer);

        // 3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
        answer = new StringBuilder(answer.toString().replaceAll("\\.+", "."));
        System.out.println("STEP3:\t" + answer);

        // 4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
        if (!answer.toString().isEmpty() && answer.charAt(0) == '.') answer = new StringBuilder(answer.substring(1));
        if (!answer.toString().isEmpty() && answer.charAt(answer.length() - 1) == '.') answer = new StringBuilder(answer.substring(0, answer.length() - 1));
        System.out.println("STEP4:\t" + answer);

        // 5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
        if (answer.toString().equals("")) answer = new StringBuilder("a");
        System.out.println("STEP5:\t" + answer);

        // 6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
        //      만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
        if (answer.length() > 15) answer = new StringBuilder(answer.substring(0, 15));
        if (answer.charAt(answer.length() - 1) == '.') answer = new StringBuilder(answer.substring(0, answer.length() - 1));
        System.out.println("STEP6:\t" + answer);

        // 7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
        if (answer.length() <= 2) {
            while (answer.length() < 3) {
                answer.append(answer.charAt(answer.length() - 1));
            }
        }
        System.out.println("STEP7:\t" + answer);

        return answer.toString();
    }
}
