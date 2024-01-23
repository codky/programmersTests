package com.example.programmerstests.baekjun;

import java.util.Scanner;

public class P1541_잃어버린괄호 {
    static int answer = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String example = scanner.nextLine();
        String[] strings = example.split("-");
        for (int i=0; i<strings.length; i++) {
            int temp = mySum(strings[i]);
            if (i==0) answer = answer + temp;
            else answer = answer - temp;
        }
        System.out.println(answer);
    }

    private static int mySum(String string) {
        int sum = 0;
        String[] temp = string.split("[+]");

        for (int i=0; i< temp.length; i++) {
            sum = sum + Integer.parseInt(temp[i]);
        }
        return sum;
    }
}
