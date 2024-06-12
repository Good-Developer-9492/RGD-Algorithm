package Programmers.Lv2.Q68645;

public class Hyejin {
    //달팽이는 아래 -> 오른쪽 -> 대각선 을 반복하면서 횟수가 1씩 준다
    //아래 4칸 -> 오른쪽 3칸 -> 대각선 2칸 -> 아래 1칸..
    //아래로 가는 것 y축 증가
    //오른쪽으로가는 것 x축 증가
    //대각선으로 가는 것 y,x 감소

    public int[] solution(int n) {
        int[][] box = new int[n][n];
        int idx = 1;

        int y = -1;
        int x = 0;
        for(int i = 0; i< n; i++){
            for(int j = i; j<n; j++){
                //아래로 이동
                if(i%3==0){
                    y++;
                }
                //오른쪽
                if(i%3==1){
                    x++;
                }
                //대각선
                if(i%3==2){
                    y--;
                    x--;
                }

                //이동한 곳에 값 넣기
                box[y][x] = idx++;
            }
        }

        //정답 채우기
        int[] answer = new int [idx-1];

        int k = 0;
        for(int i = 0 ; i< n; i++){
            for(int j = 0; j< n; j++){
                if(box[i][j] == 0) break;
                answer[k++] = box[i][j];
            }
        }
        return answer;
    }
}
