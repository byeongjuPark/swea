package d2;

import java.util.Scanner;

public class 지그재그숫자 {
    public static void main(String[] args) {
        // 1부터 N까지의 숫자에서 홀수는 더하고 짝수는 뺐을 때 최종 누적된 값을 구해보자.

        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        
        int[] inputNum = new int[T];
        for(int i = 0; i < T; i++){
            inputNum[i] = sc.nextInt();
        }

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int sum = 0;
            for(int i = 0; i< inputNum[test_case-1] ; i++){
                if((i+1) % 2 == 0){
                    sum -= (i+1);
                } else {
                    sum += (i+1);
                }
            }
			System.out.println("#" + test_case + " " + sum);
		}
    }
}
