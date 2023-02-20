package Programmers.Lv1.Q12977;

public class Tuna {
    // (0.3ms, 75MB)
    public int solution(int[] nums) {
        boolean[] arr = new boolean[3001];
        arr[0] = true;
        arr[1] = true;
        for (int i = 2; i < arr.length; i++) {
            if (arr[i]) continue;

            for (int j = 2; i * j <= 3000; j++) {
                arr[i * j] = true;
            }
        }

        int count = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int num = nums[i] + nums[j] + nums[k];
                    if (!arr[num]) count++;
                }
            }
        }

        return count;
    }
}
