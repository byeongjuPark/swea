package d1;
import java.util.Scanner;

public class FindPassword {
    public static void main(String[] args) {
        // 비밀번호 찾기
        // 비밀번호 P는 000부터 999까지 번호 중의 하나이다. 
        // 주어지는 번호 K부터 1씩 증가하며 비밀번호를 확인해 볼 생각이다.
        // 예를 들어 비밀번호 P가 123 이고 주어지는 번호 K가 100 일 때, 100부터 123까지 24번 확인하여 비밀번호를 맞출 수 있다.
        // P와 K가 주어지면 K부터 시작하여 몇 번 만에 P를 맞출 수 있는지 알아보자. 
        Scanner sc = new Scanner(System.in);
        int P, K;
        P=sc.nextInt();
        K=sc.nextInt();
        int result = 0;
        if(P==K){
            result = 1;
            System.out.println(result);
        } else if( P > K ){
            result = P - K +1;
            System.out.println(result);
        } else {
            result = 999 - (P-K +1);
            System.out.println(result);
        }
    }
}
