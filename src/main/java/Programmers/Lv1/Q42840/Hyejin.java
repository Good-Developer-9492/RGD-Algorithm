package Programmers.Lv1.Q42840;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Hyejin {
    public int[] solution(int[] answers) {
        //8.16ms, 77.1MB
        List<Student> list = new ArrayList<>();
        //학생1 배열
        list.add(new Student(1, new int[]{1, 2, 3, 4, 5}));
        list.add(new Student(2, new int[]{2, 1, 2, 3, 2, 4, 2, 5}));
        list.add(new Student(3, new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}));

        for (int c : answers) {
            list.forEach(a -> a.correctCheck(c));
        }

        Student max = list.stream().max(Comparator.comparingInt(a -> a.count)).get();

        int[] answer = list.stream()
            .filter(a -> a.count == max.count)
            .mapToInt(a -> a.no)
            .toArray();

        return answer;
    }

    public static class Student {
        int no;
        int[] numbers;
        int point;
        int count;

        public Student(int no, int[] numbers) {
            this.no = no;
            this.numbers = numbers;
            point = 0;
            count = 0;
        }

        public void correctCheck(int answer) {
            if (numbers[point++] == answer) count++;
            if (point >= numbers.length) point = 0;
        }
    }
}
