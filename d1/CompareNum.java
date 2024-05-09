package d1;

import java.util.Scanner;

public class CompareNum {
    public static void main(String[] args) {

        int test_case = 1;
        // 2개의 수를 입력 받아 크기를 비교하여 등호 또는 부등호를 출력하는 프로그램을 작성하라.
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[2];
        for(int i = 0; i < 2; i++){
            nums[i] = sc.nextInt();
        }
        if(nums[0] < nums[1]){
            System.out.println("#" + test_case + " <");
        } else if (nums[0] == nums[1]){
            System.out.println("#" + test_case + " =");
        } else {
            System.out.println("#" + test_case + " >");
        }
        
    }
}
