package com.example.programmerstests.programmers;

/**
 * 문자열 my_string과 정수 k가 주어질 때, my_string을 k번 반복한 문자열을 return 하는 solution 함수를 작성해 주세요.
 */
public class StringMultiplication {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        String result = solution.solution("string", 5);

        System.out.println("result = " + result);
    }
    static class Solution2 {
        public String solution(String my_string, int k) {
            String answer = "";

            for (int i=0; i <k; i++) {
                answer += my_string;
            }
            return answer;
        }
    }
}


