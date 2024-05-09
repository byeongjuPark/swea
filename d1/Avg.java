package d1;

import java.util.Scanner;

public class Avg {
    public static void main(String[] args) {
        // 평균 구하기 (소수점 첫째에서 반올림)
        // 22 8 5 123 7 2 63 7 3 46
        // #2 29

        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];
        for (int i = 0; i < 10; i++) {
            nums[i] = sc.nextInt();
        }

        double sum = 0;
        int avg = 0;
        double count = nums.length;
        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
        }

        avg = (int)Math.round(sum/count);
        System.out.println(avg);
        sc.close();
    }
}
