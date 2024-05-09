package d1;

import java.util.Scanner;

public class MidNum {
    public static void main(String[] args) {
        // 중간값은 통계 집단의 수치를 크기 순으로 배열 했을 때 전체의 중앙에 위치하는 수치를 뜻한다.
        // 입력으로 N 개의 점수가 주어졌을 때, 중간값을 출력하라.
        // input
        // 9
        // 85 72 38 80 69 65 68 96 22
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];

        for(int i = 0; i < N ; i ++){
            nums[i] = sc.nextInt();
        }
        int temp = 0;
        for(int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                if(nums[i] > nums[j]){
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        int resultIndex = (N / 2);
        System.out.println(nums[resultIndex]);
    }
}
