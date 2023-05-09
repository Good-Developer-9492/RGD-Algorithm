package Programmers.Lv2.Q118667;

import java.util.LinkedList;
import java.util.Queue;

public class Hyunho {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;

        Queue<Integer> numberQueue1 = new LinkedList<>();
        int sumQueue1 = 0;
        for (int q : queue1) {
            numberQueue1.add(q);
            sumQueue1 += q;
        }

        Queue<Integer> numberQueue2 = new LinkedList<>();
        int sumQueue2 = 0;
        for (int q : queue2) {
            numberQueue2.add(q);
            sumQueue2 += q;
        }

        while (sumQueue1 != sumQueue2) {

            if (sumQueue1 > sumQueue2) {
                int number = numberQueue1.poll();
                sumQueue1 -= number;
                numberQueue2.add(number);
                sumQueue2 += number;
            } else if (sumQueue1 < sumQueue2) {
                int number = numberQueue2.poll();
                sumQueue2 -= number;
                numberQueue1.add(number);
                sumQueue1 += number;
            }

            answer++;

            //(큐의 길이*3) 만큼 숫자를 이동시켜도 값이 같아지지 않는다면 -1을 반환한다
            if (answer > queue1.length * 3) {
                answer = -1;
                break;
            }
        }

        return answer;
    }


    //////////시간 초과............//
//    public int solution(int[] queue1, int[] queue2) {
//        int answer = 0;
//
//        Queue<Integer> numberQueue1 = new LinkedList<>();
//        for (int q : queue1) {
//            numberQueue1.add(q);
//        }
//        NumberQueue firstQueue = new NumberQueue(numberQueue1);
//
//        Queue<Integer> numberQueue2 = new LinkedList<>();
//        for (int q : queue2) {
//            numberQueue2.add(q);
//        }
//        NumberQueue secondQueue = new NumberQueue(numberQueue2);
//
//        while (firstQueue.totalSum() != secondQueue.totalSum()) {
//
//            if (firstQueue.totalSum() > secondQueue.totalSum()) {
//                secondQueue.add(firstQueue.poll());
//            } else if (firstQueue.totalSum() < secondQueue.totalSum()) {
//                firstQueue.add(secondQueue.poll());
//            }
//
//            answer++;
//
//            //loop count(answer) 이 (큐의 길이*3) 보다 크다면 -1을 반환한다
//            if (answer > queue1.length * 3) {
//                answer = -1;
//                break;
//            }
//        }
//
//        return answer;
//    }
//
//    static class NumberQueue {
//        private final Queue<Integer> queue;
//
//        public NumberQueue(Queue<Integer> queue) {
//            this.queue = queue;
//        }
//
//        public int totalSum(){
//            return this.queue.stream()
//                .mapToInt(i -> i)
//                .sum();
//        }
//
//        public int poll() {
//            return this.queue.poll();
//        }
//
//        public void add(int number) {
//            this.queue.add(number);
//        }
//    }
}
