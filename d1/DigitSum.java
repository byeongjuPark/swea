package d1;

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        // 하나의 자연수를 입력 받아 각 자릿수의 합을 계산하는 프로그램을 작성하라.
        // 자연수 N은 1부터 9999까지의 자연수이다. (1 ≤ N ≤ 9999)

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int sum = 0;

        sum += N / 1000;
        if(N > 1000){
            N = N % 1000;
        }
        sum += N / 100;
        if(N > 100){
            N = N % 100;
        }
        sum += N / 10;
        if(N > 10){
            N = N % 10;
        }
        sum += N;
        System.out.println(sum);
    }


    // 아스키 코드 이용해서 풀어보기 [-'0']
}
