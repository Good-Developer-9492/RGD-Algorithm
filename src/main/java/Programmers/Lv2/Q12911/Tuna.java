package Programmers.Lv2.Q12911;

public class Tuna {
    // (0.05ms / 75MB)
    public int solution(int n) {
        String nbs = Integer.toBinaryString(n);
        int nbsOneCount = nbs.replace("0", "").length();

        int answer;
        int i = n + 1;
        while (true) {
            String ibs = Integer.toBinaryString(i);
            int ibsOneCount = ibs.replace("0", "").length();
            if (ibsOneCount == nbsOneCount) {
                answer = i;
                break;
            }

            i++;
        }

        return answer;
    }
}
