package Lv1.programmers.Q72410;

public class Hyunho {

    //0.91ms, 71.5MB - 4.29ms, 80.9MB
    public String solution(String new_id) {
        String answer = "";
        String newId = new_id.toLowerCase();

        //decorator pattern
        Decorator d = new StringDecorator(
            new PointTrim(
                new ConversionContinuousCharacter(
                    new RemoveSpecialCharacters(
                        new SourceString()))));
        newId = d.transformation(newId);

        if (checkEmpty(newId)) {
            newId = "a";
        }

        if (verifyLengthExceeded(newId)) {
            newId = newId.substring(0, 15);
            if (newId.charAt(14) == '.') {
                newId = newId.substring(0, 14);
            }
        }

        return addCharacters(newId);
    }

    private boolean checkEmpty(String str) {
        return str.isEmpty();
    }

    private boolean verifyLengthExceeded(String str) {
        return str.length() > 15;
    }

    public String addCharacters(String str) {
        StringBuilder strBuilder = new StringBuilder(str);
        int scarceCount = 3 - str.length();
        if (scarceCount > 0) {
            for (int i = 0; i < scarceCount; i++) {
                strBuilder.append(strBuilder.charAt(str.length() - 1));
            }
        }
        return strBuilder.toString();
    }


    interface Decorator {
        String transformation(String str);
    }

    static class SourceString implements Decorator {

        @Override
        public String transformation(String str) {
            return str;
        }
    }

    static class StringDecorator implements Decorator {
        protected Decorator decorator;

        public StringDecorator(Decorator decorator) {
            this.decorator = decorator;
        }

        @Override
        public String transformation(String str) {
            return this.decorator.transformation(str);
        }
    }

    static class RemoveSpecialCharacters extends StringDecorator {

        public RemoveSpecialCharacters(Decorator decorator) {
            super(decorator);
        }

        @Override
        public String transformation(String str) {
            String match = "[^0-9a-zA-Z._\\-]";
            return super.transformation(str)
                .replaceAll(match, "");
        }
    }

    static class ConversionContinuousCharacter extends StringDecorator {

        public ConversionContinuousCharacter(Decorator decorator) {
            super(decorator);
        }

        @Override
        public String transformation(String str) {
            StringBuilder strBuilder = new StringBuilder(super.transformation(str));
            for (int i = 0; i < strBuilder.length() - 1; i++) {
                if (strBuilder.charAt(i) == '.' && strBuilder.charAt(i + 1) == '.') {
                    strBuilder.deleteCharAt(i + 1);
                    i--;
                }
            }
            return strBuilder.toString();
        }
    }

    static class PointTrim extends StringDecorator {
        public PointTrim(Decorator decorator) {
            super(decorator);
        }

        @Override
        public String transformation(String str) {
            StringBuilder strBuilder = new StringBuilder(super.transformation(str));
            if (strBuilder.charAt(0) == '.') {
                strBuilder.deleteCharAt(0);
            }
            if (strBuilder.length() > 1) {
                if (strBuilder.charAt(strBuilder.length() - 1) == '.') {
                    strBuilder.deleteCharAt(strBuilder.length() - 1);
                }
            }
            return strBuilder.toString();
        }
    }
}
