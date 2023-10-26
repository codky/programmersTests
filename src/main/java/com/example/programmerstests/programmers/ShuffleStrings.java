package com.example.programmerstests.programmers;

public class ShuffleStrings {
    public static void main(String[] args) {
        ShuffleStringsSolution solution = new ShuffleStringsSolution();
        String result = solution.solution("minseok", "test111");
        System.out.println("result = " + result);

    }
    static class ShuffleStringsSolution {
        public String solution(String str1, String str2) {
            String answer = "";

            for (int i = 0; i < str1.length(); i++) {
                answer+= str1.charAt(i);
                answer+= str2.charAt(i);
            }
            return answer;
        }
    }
}


