package d3;

import java.util.Scanner;

public class 증가하는사탕수열 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int[] candies = new int[3];
            for(int i =0; i< candies.length; i++){
                candies[i] = sc.nextInt();
            }
            int result =0;
            int outCheck = 0;
            if(candies[0] < 1 || candies[1] < 2|| candies[2] < 3){
                result = -1;
                outCheck = 1;
            }
            if(outCheck == 0){
                if(candies[1] >= candies[2]){
                    result += (candies[1] - candies[2] + 1);
                    candies[1] = candies[1] - result;
                }
                if(candies[0] >= candies[1]){
                    // 5 2 3
                    result += (candies[0] - candies[1] + 1);
                    candies[0] = candies[0] - result;
                }
            }

			System.out.println("#" + test_case + " " + result);
		}
    }
}