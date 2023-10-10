package com.example.programmerstests;

public class OverwritingStrings {
    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.solution("Cha1n5awMa7!!", "inSawMan", 3));

    }

}
class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String before = my_string.substring(0, s); // "Cha"
        String after = my_string.substring(s + overwrite_string.length()); // 3 + 7 , "1n5awMa7"
        return before + overwrite_string + after; // Cha + inSawMan + !!
    }
}