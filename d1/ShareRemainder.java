package d1;

import java.util.Scanner;

public class ShareRemainder {
    public static void main(String[] args) {
        // 몫 과 나머지 출력
        // 2개의 수 a, b를 입력 받아, a를 b로 나눈 몫과 나머지를 출력하는 프로그램을 작성하라.
        // 각 수는 1이상 10000이하의 정수이다.

        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
		{
            int[] nums = new int[2];
            int share, remainder;
            for(int i = 0; i < 2 ; i++){
                nums[i] = sc.nextInt();
            }
            share = nums[0] / nums[1];
            remainder = nums[0] % nums[1];
            System.out.println("#"+test_case+" "+ share + " " + remainder);

		}
    }
}
