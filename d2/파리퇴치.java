package d2;

import java.util.Scanner;

public class 파리퇴치 {
    public static void main(String[] args) {
        // N x N 배열 안의 숫자는 해당 영역에 존재하는 파리의 개수를 의미한다.
        // M x M 크기의 파리채를 한 번 내리쳐 최대한 많은 파리를 죽이고자 한다.
        // 죽은 파리의 개수를 구하라!

        // N 은 5 이상 15 이하이다.
        // M은 2 이상 N 이하이다.
        // 각 영역의 파리 갯수는 30 이하 이다.
        Scanner sc = new Scanner(System.in);
        int T;
        int N, M;
        T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            N = sc.nextInt();
            M = sc.nextInt();
            int[][] table = new int[N][N];
            // 배열 채우기
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    table[i][j] = sc.nextInt();
                }
            }

            // 테이블 탐색
            // 0, 0 에서 시작해서 N-M, N-M 까지
            int max = 0;
            for (int i = 0; i < N - M + 1; i++) {
                for (int j = 0; j < N - M + 1; j++) {
                    // 파리채 넓이 탐색
                    int sum = 0;
                    for (int k = 0; k < M; k++) {
                        for (int h = 0; h < M; h++) {
                            // i+k, j+h
                            sum += table[i + k][j + h];
                        }
                    }
                    // 수 비교
                    if (max < sum) {
                        max = sum;
                    }
                }
            }
            // output
            System.out.println("#" + test_case + " " + max);
        }
    }
}
