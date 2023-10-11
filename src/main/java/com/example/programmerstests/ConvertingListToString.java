package com.example.programmerstests;

public class ConvertingListToString {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] arr = {"a","b","c"};
        String result = solution.solution(arr);
        System.out.println("result = " + result);
    }

    static class Solution {
        public String solution(String[] arr) {

            String answer = "";



            for (int i = 0; i < arr.length; i++) {
                answer+= arr[i];
            }

            return answer;
        }
    }
}
