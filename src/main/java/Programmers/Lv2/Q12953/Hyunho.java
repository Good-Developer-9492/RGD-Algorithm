package Programmers.Lv2.Q12953;

public class Hyunho {
    //0.09ms, 76.5MB
    public int solution(int[] arr) {
        int greatestCommonDivision = calcGreatestCommonDivision(arr[0], arr[1]);
        int leastCommonMultiple = (arr[0] * arr[1]) / greatestCommonDivision;

        for (int i = 2; i < arr.length; i++) {
            greatestCommonDivision = calcGreatestCommonDivision(leastCommonMultiple, arr[i]);
            leastCommonMultiple = (leastCommonMultiple * arr[i]) / greatestCommonDivision;
        }

        return leastCommonMultiple;
    }


    private int calcGreatestCommonDivision(int num1, int num2) {
        while (num1 % num2 != 0) {
            int remainderValue = num1 % num2;
            num1 = num2;
            num2 = remainderValue;
        }

        return num2;
    }
}
