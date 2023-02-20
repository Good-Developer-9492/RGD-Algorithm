package Programmers.Lv1.Q72410;


public class Hyejin {
    public String solution(String new_id) {

        new_id = minusScale(new_id);
        new_id = removeSpecialSymbol(new_id);
        new_id = convertDot(new_id);
        new_id = removeDot(new_id);
        new_id = fillEmptyWord(new_id);
        new_id = cutLength(new_id);
        new_id = fillShortWord(new_id);

        return new_id;
    }

    private String minusScale(String word) {
        return word.toLowerCase();
    }

    //2단계
    private String removeSpecialSymbol(String word) {
        return word.replaceAll("[^a-z0-9-_.]", "");
    }

    //3단계
    private String convertDot(String word) {

        while (word.contains("..")) {
            word = word.replaceAll("\\.\\.", ".");
        }
        return word;
    }

    //4단계
    private String removeDot(String word) {
        if (word.length() == 1 && word.charAt(0) == '.') return "";
        if (word.charAt(0) == '.') word = word.substring(1);
        if (word.charAt(word.length() - 1) == '.') {
            word = word.substring(0, word.length() - 1);
        }
        return word;
    }

    //5단계
    private String fillEmptyWord(String word) {

        if (word.equals("")) return "a";
        return word;
    }

    //6단계
    private String cutLength(String word) {
        if (word.length() >= 16) {
            word = word.substring(0, 15);
            return removeDot(word);
        }
        return word;
    }

    //7단계
    private String fillShortWord(String word) {
        while (word.length() < 3) {
            word += word.charAt(word.length() - 1);
        }
        return word;
    }

}
