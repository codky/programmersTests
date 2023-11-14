package com.example.programmerstests.baekjun;

import java.util.Scanner;

public class P11399_ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 사람 수
        int[] A = new int[N]; // 자릿수별로 구분해 저장한 배열
        int[] S = new int[N]; // 합 배열: 각 사람이 인출을 완료하는 데 필요한 시간을 저장
        for (int i = 0; i < N; i++) { // 사람 수 만큼 반복
            A[i] = sc.nextInt(); // A 배열 저장하기
        }
        for (int i = 1; i<N; i++) { // 삽입 정렬
            int insert_point = i;
            int insert_value = A[i];
            for (int j = i - 1; j >= 0; j--) { // j: i - 1 ~ 0 까지 뒤에서부터 반복하기
                if (A[j] < A[i]) { // 현재 범위에서 삽입 위치 찾기
                    insert_point = j + 1;
                    break;
                }
                if (j == 0) {
                    insert_point = 0;
                }
            }
            for (int j = i; j > insert_point; j--) { // j: i ~ insert_point + 1까지 뒤에서부터 반복하기
                A[j] = A[j-1]; // 삽입을 위해 삽입 위치에서 i 까지 데이터를 한칸씩 뒤로 밀기
            }
            A[insert_point] = insert_value; // 삽입 위치에 현재 데이터 삽입하기
        }
        S[0] = A[0]; // 합 배열 만들기
        for (int i = 1; i < N; i++) {
            S[i] = S[i-1] + A[i]; // A배열을 통한 합 배열 S 만들기
        }
        int sum = 0; // 합 배열 총합 구하기
        for (int i = 0; i < N; i++) {
            sum = sum + S[i];
        }
        System.out.println(sum);
    }
}
