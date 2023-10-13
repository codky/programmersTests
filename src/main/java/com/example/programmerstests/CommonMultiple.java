package com.example.programmerstests;

public class CommonMultiple {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int result = solution.solution(55, 10, 5);
        System.out.println("result = " + result);
    }
    static class Solution {
        public int solution(int number, int n, int m) {

            if (number % n == 0 && number % m == 0) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
