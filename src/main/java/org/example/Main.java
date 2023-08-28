package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(toCamelCase("the_Stealth_Warrior"));
    }


    static String toCamelCase(String s){
        String[] split = s.split("[-_]");

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            char[] charArray = split[i].toCharArray();
            if(i == 0) {
                stringBuilder.append(charArray);
            }else {
                char upperCase = Character.toUpperCase(charArray[0]);
                charArray[0] = upperCase;
                stringBuilder.append(charArray);
            }

        }
        return stringBuilder.toString();
    }
}