package d3;

import java.util.Scanner;

public class 원안의점 {
    public static void main(String[] args) {
        // N이 주어질 때, 원점을 중심으로 반지름이 N인 원 안에 포함되는 격자점(x,y 좌표가 모두 정수인 점)의 개수를 구하는 프로그램을 작성하라.
        // 다시 말하자면, x^2+y^2<=N^2인 격자점의 개수를 구하는 프로그램을 작성하라.
        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
		{
            int N = sc.nextInt();
            int result = 0;
            for(int x = 0; x < N ; x++){
                for(int y = 0; y < N; y++){
                    if((x*x) + (y*y) <= (N*N)){
                        result += 1;
                    }
                }
            }
            
            result = ((result-N) *4) +5;
            System.out.println("#" + test_case + " " + result);
		}
    }
}
