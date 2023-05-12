package Programmers.Lv2.Q17683;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Tuna {
    public String solution(String m, String[] musicinfos) {
        // 맞는 musicinfos가 없을때 결과값 (None)
        String answer = "(None)";
        // 주어진 m에서 #붙은 음계를 다른 문자로 치환
        String melody = changeMelody(m);
        // 여러개의 musicinfos가 매칭될경우 비교할 재생시간
        int maxTime = Integer.MIN_VALUE;

        for (String info : musicinfos) {
            String[] infos = info.split(",");
            MusicInfo musicInfo = new MusicInfo(infos[0], infos[1], infos[2], changeMelody(infos[3]));

            String tmp = musicInfo.sheetInfo;
            // 재생 시작시간과 끝시간의 분 차이
            int time = musicInfo.getPlayMinutes();
            // 각 문자마다 1분씩 소요되는데, 재생시간이 그 시간보다 길다면 늘려주고, 짧다면 줄여주기
            if (time > musicInfo.sheetInfo.length()) {

                tmp = musicInfo.sheetInfo
                    // 나눠서 나온 몫만큼 반복
                    + musicInfo.sheetInfo.repeat(Math.max(0, time / musicInfo.sheetInfo.length() - 1))
                    // 나눠서 나온 나머지만큼 일부 추출해서 추가
                    + musicInfo.sheetInfo.substring(0, time % musicInfo.sheetInfo.length());
            } else {
                tmp = tmp.substring(0, time);
            }

            // 비교 후 정답 골라내기
            if (tmp.contains(melody) && time > maxTime) {
                answer = musicInfo.title;
                maxTime = time;
            }
        }

        return answer;
    }

    // #붙은 음계들 한 문자로 표현되도록 치환하는 메소드
    private String changeMelody(String melody) {
        return melody.replaceAll("C#", "H")
            .replaceAll("D#", "I")
            .replaceAll("F#", "J")
            .replaceAll("G#", "K")
            .replaceAll("A#", "L");
    }

    public static class MusicInfo {
        private final LocalTime startTime;
        private final LocalTime endTime;
        private final String title;
        private final String sheetInfo;

        public MusicInfo(String startTime, String endTime, String title, String sheetInfo) {
            this.startTime = LocalTime.parse(startTime);
            this.endTime = LocalTime.parse(endTime);
            this.title = title;
            this.sheetInfo = sheetInfo;
        }

        public int getPlayMinutes() {
            return (int) ChronoUnit.MINUTES.between(startTime, endTime);
        }
    }
}
