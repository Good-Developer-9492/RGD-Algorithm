package Programmers.Lv2.Q42842;

public class Hyejin {
    //0.02ms, 75.2MB
    //0.06ms, 81.5MB
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        //넓이 = brown + yellow
        int area = brown + yellow;


        //세로 1씩 증가하면서 계산한다
        for (int height = 3; height <= area; height++) {
            //가로 * 세로 = 너비 안나누어 떨어지는 값은 넘어가기
            if (area % height != 0) continue;
            int width = area / height;

            //가로 > 세로
            if (width < height) break;

            //계산한 노란색블럭 == input 노란색블럭 일치하면 return
            if (yellowBlockCal(width, height) == yellow) return new int[]{width, height};
        }
        System.out.println("?");
        return answer;
    }

    private int yellowBlockCal(int width, int height) {
        return (width - 2) * (height - 2);
    }
}
