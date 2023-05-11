package Programmers.Lv2.Q131704;

import java.util.Stack;

public class Hyunho {
    public int solution(int[] order) {
        int answer = 0;
        ConveyorBelt subConveyorBelt1 = ConveyorBelt.of();

        int currentBoxNumber = 0;

        for (int i = 1; i <= order.length; i++) {
            if (order[currentBoxNumber] != i) {
                subConveyorBelt1.addBox(i);
                continue;
            }

            currentBoxNumber++;
            answer++;

            while (subConveyorBelt1.checkOffload(order[currentBoxNumber])) {
                subConveyorBelt1.offload();
                currentBoxNumber++;
                answer++;
            }
        }

        return answer;
    }

    static class ConveyorBelt {
        private final Stack<Integer> stack;

        private ConveyorBelt(Stack<Integer> stack) {
            this.stack = stack;
        }

        static ConveyorBelt of() {
            return new ConveyorBelt(new Stack<>());
        }

        public void addBox(int box) {
            stack.add(box);
        }

        public boolean checkOffload(int orderBoxNumber) {
            return stack.size() > 0 && stack.peek() == orderBoxNumber;
        }

        public void offload() {
            stack.pop();
        }
    }
}
