package com.example.programmerstests.algorithm.chap01;

import java.util.Scanner;

public class SumWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.println("n의 값: ");
        int n = sc.nextInt();

        int sum = 0; // 합
        int i = 1;

        while (i <= n) { // i 가 n 이하면 반복함
            sum += i; // sum 에 i를 더함
            i++; // i 값을 1만큼 증가시킴
        }

        System.out.println("1부터 " + n + "까지의 합은 " + sum + " 입니다.");
    }
}
