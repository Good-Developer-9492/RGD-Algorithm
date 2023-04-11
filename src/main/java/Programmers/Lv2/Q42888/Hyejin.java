package Programmers.Lv2.Q42888;

import java.util.*;

public class Hyejin {
    //1.97ms, 65.3MB
    //144.17ms, 160MB
    public String[] solution(String[] record) {
        List<Message> messages = new ArrayList<>();
        Map<String, String> nickName = new HashMap<>();

        for (String value : record) {
            String[] arr = value.split(" ");
            String order = arr[0];
            String uid = arr[1];

            if (order.equals("Enter")) {
                messages.add(new Message(uid, "님이 들어왔습니다."));
                nickName.put(uid, arr[2]);
            }

            if (order.equals("Leave")) {
                messages.add(new Message(uid, "님이 나갔습니다."));
            }

            if (order.equals("Change")) {
                nickName.put(uid, arr[2]);
            }
        }
        String[] answer = new String[messages.size()];
        for (int i = 0; i < messages.size(); i++) {
            String name = nickName.get(messages.get(i).uid);
            answer[i] = name + messages.get(i).message;
        }
        return answer;
    }

    static class Message {
        private String uid;
        private String message;

        public Message(String uid, String message) {
            this.uid = uid;
            this.message = message;
        }
    }
}
