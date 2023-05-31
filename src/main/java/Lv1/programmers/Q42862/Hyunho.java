package Lv1.programmers.Q42862;

import java.util.Arrays;

public class Hyunho {
    /**
     * 1. 체육복을 도난당한 학생은 0으로 변경
     * 2. 여벌이 있는 학생은 2로 변경
     * 3. for문을 돌면서 체육복이 없을 경우 좌우 학생을 비교하여 여벌이 있을 경우 1로 변경
     */
    //2.01ms, 67.5MB
    public int solution(int n, int[] lost, int[] reserve) {
        Student student = new Student(n);
        student.initialize();

        for (int l : lost) {
            student.decrease(l);
        }

        for (int r : reserve) {
            student.increase(r);
        }

        for (int i = 0; i < n; i++) {
            student.verifyAvailableForRent(i);
        }

        return (int) student.studentsEligibleToParticipate();
    }

    private static class Student {
        private final int[] array;

        public Student(int size) {
            this(new int[size]);
        }

        public Student(int[] array) {
            this.array = array;
        }

        public int size() {
            return array.length;
        }

        public void initialize() {
            for (int i = 0; i < size(); i++) {
                this.array[i]++;
            }
        }

        public void decrease(int lost) {
            this.array[lost - 1]--;
        }

        public void increase(int reserve) {
            this.array[reserve - 1]++;
        }

        public void verifyAvailableForRent(int index) {
            if (index - 1 >= 0 && this.array[index - 1] == 0 && this.array[index] >= 2) {
                this.array[index - 1]++;
                this.array[index]--;
            }

            if (index + 1 < this.size() && this.array[index + 1] == 0 && this.array[index] >= 2) {
                this.array[index + 1]++;
                this.array[index]--;
            }
        }

        public long studentsEligibleToParticipate() {
            return Arrays.stream(this.array)
                .filter(s -> s >= 1)
                .count();
        }
    }
}
