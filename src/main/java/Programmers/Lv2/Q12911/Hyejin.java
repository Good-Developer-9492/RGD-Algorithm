package Programmers.Lv2.Q12911;

public class Hyejin {
    //0.03ms, 73.8MB)
    //0.08ms, 52.4MB
    public int solution(int n) {
        int countOneAtN = countOne(Integer.toBinaryString(n));
        int number = n + 1;

        while (true) {
            String convert = Integer.toBinaryString(number);

            if(countOne(convert) == countOneAtN) break;

            number++;
        }
        return number;
    }

    private int countOne(String s){
        int count = 0;
        for(char c : s.toCharArray()){
            if(c == '1') count++;
        }
        return count;
    }
}
