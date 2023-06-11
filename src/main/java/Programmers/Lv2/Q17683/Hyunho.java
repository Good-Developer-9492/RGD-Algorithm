package Programmers.Lv2.Q17683;

public class Hyunho {
    public String solution(String m, String[] musicinfos) {
        m = change(m);
        int time = 0;
        String answer = "(None)";
        for (String music : musicinfos) {
            String[] musicinfo = music.split(",");

            int H1 = Integer.parseInt(musicinfo[0].substring(0, 2));
            int M1 = Integer.parseInt(musicinfo[0].substring(3, 5));
            int H2 = Integer.parseInt(musicinfo[1].substring(0, 2));
            int M2 = Integer.parseInt(musicinfo[1].substring(3, 5));
            int playtime = (H2 - H1) * 60 + M2 - M1;
            String sound = change(musicinfo[3]);
            String fullSound = "";
            for (int i = 0; i < playtime; i++){
                fullSound += sound.charAt(i % sound.length());
            }

            if (fullSound.contains(m)) {
                if (time >= playtime){
                    continue;
                }

                answer = musicinfo[2];
                time = playtime;
            }
        }

        return answer;
    }

    public String change(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        for (int i = 0; i < stringBuilder.length(); i++){
            if (stringBuilder.charAt(i) == '#')
                stringBuilder.replace(i - 1, i + 1, "" + (char)(stringBuilder.charAt(i-1) + 32));
        }

        return stringBuilder.toString();
    }
}
