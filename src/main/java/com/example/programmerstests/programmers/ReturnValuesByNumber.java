package com.example.programmerstests.programmers;

public class ReturnValuesByNumber {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(7);
        System.out.println("result = " + result);
    }

    static class Solution {
        public int solution(int n) {
            int answer = 0;

            if ( n % 2 == 1 ) { // 홀수면
                for (int i=1; i<=n; i+=2) { // 1~n까지 홀수값만
                    answer += i; // 더한다.
                }
            } else {
                for (int i=2; i<=n; i+=2) { // 짝수면 2~n까지
                    answer += i*i; // 2*2 4*4 6*6 ...
                }
            }
            return answer;
        }
    }
}
