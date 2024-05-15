package d2;

import java.util.Scanner;

public class 달팽이숫자 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] table = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                table[i][j] = 0;
            }
        }

        int[] da = { 0, 1, 0, -1 };
        int[] db = { 1, 0, -1, 0 };
        int direction = 0;
        int cnt = 1;
        int a = 0;
        int b = 0;
        int na, nb;
        while (cnt <= N * N) {
            na = a + da[direction];
            nb = b + db[direction];
            if (na >= 0 && na < N && na >= 0 && nb < N && table[a][b] == 0) {
                a = na;
                b = nb;
                table[a][b] = cnt;
                cnt++;
            } else {
                direction = (direction + 1) % 4;
            }
        }

        // ouput
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}
