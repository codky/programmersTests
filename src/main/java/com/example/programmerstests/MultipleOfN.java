package com.example.programmerstests;

public class MultipleOfN {
    public static void main(String[] args) {
        MultipleOfNSolution solution = new MultipleOfNSolution();
        int result = solution.solution(34, 3);
        System.out.println("result = " + result);
    }
    static class MultipleOfNSolution {
        public int solution(int num, int n) {

            if (num % n == 0) {
                return 1;
            }
            return 0;

        }
    }
}
