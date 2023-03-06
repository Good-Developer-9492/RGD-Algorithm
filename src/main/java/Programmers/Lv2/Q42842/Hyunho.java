package Programmers.Lv2.Q42842;

public class Hyunho {
    //19.36ms, 81.7MB
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sumCarpet = brown + yellow;

        for (int i = 1; i <= sumCarpet; i++) {
            int width = i; //세로
            int height = sumCarpet / width; //가로

            if (width > height){
                break;
            }

            if ((width - 2) * (height - 2) == yellow){
                answer[0] = height;
                answer[1] = width;
                return answer;
            }
        }

        return answer;
    }
}
