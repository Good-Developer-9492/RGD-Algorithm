package Programmers.Lv2.Q12911;

public class Hyunho {
    //0.12ms, 52.1MB
    public int solution(int n) {
        int answer = 0;
        int count = binaryOneCount(n);
        int idx = n + 1;

        while (true) {
            int temp = binaryOneCount(idx);

            if (count == temp) {
                answer = idx;
                break;
            }
            idx++;
        }

        return answer;
    }

    private int binaryOneCount(int i){
        return Integer.toBinaryString(i)
            .replace("0", "")
            .length();
    }
}
