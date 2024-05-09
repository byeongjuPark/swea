package d1;

import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
        // 10개의 수를 입력 받아, 그 중에서 가장 큰 수를 출력하는 프로그램을 작성하라.
        int test_case = 1;
        Scanner sc = new Scanner(System.in);
        

        int[] nums = new int[10];
        for(int i = 0; i < 10 ; i++){
            nums[i] = sc.nextInt();
        }
        int temp = 0;
        for(int i = 0; i < 10; i++){
            if(temp <= nums[i]){
                temp = nums[i];
            }
        }
        System.out.println("#" + test_case + " " + temp);
    }
}
