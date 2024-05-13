package d2;

import java.util.Scanner;

public class 최빈수 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
		{
            int[] nums = new int[1000];
            int max=0;
            int index=0;
            for(int i = 0; i< 1000; i++){
                nums[i] = sc.nextInt();
            }
			int[] countArr = new int[100];

            for(int i =0 ; i < 100; i++){
                countArr[i] = 0;
            }


            for(int i = 0; i < 100; i++){
                countArr[nums[i]-1]++;
            }

            for(int i = 0; i< 100; i++){
                if(countArr[i] >max){
                    index = i;
                    max = countArr[i];
                }
            }

            System.out.println("#"+test_case+" " + nums[index]);
		}
        
        
        
    }
}
