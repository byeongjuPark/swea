package d2;

import java.util.Scanner;

public class 삼육구 {
    public static void main(String[] args) {
        // 3 6 9 게임을 프로그램으로 제작중이다. 게임 규칙은 다음과 같다.
        // 1. 숫자 1부터 순서대로 차례대로 말하되, “3” “6” “9” 가 들어가 있는 수는 말하지 않는다.
        // 2. "3" "6" "9"가 들어가 있는 수를 말하지 않는대신, 박수를 친다. 이 때, 박수는 해당 숫자가 들어간 개수만큼 쳐야 한다.  
        // 예를 들어 숫자 35의 경우 박수 한 번, 숫자 36의 경우 박수를 두번 쳐야 한다.
        // 입력으로 정수 N 이 주어졌을 때, 1~N 까지의 숫자를
        // 게임 규칙에 맞게 출력하는 프로그램을 작성하라.
        // 박수를 치는 부분은 숫자 대신, 박수 횟수에 맞게 “-“ 를 출력한다.
        // 여기서 주의해야 할 것은 박수 한 번 칠 때는 - 이며, 박수를 두 번 칠 때는 - - 가 아닌 -- 이다. 
        Scanner sc = new Scanner(System.in);
		int N;
		N=sc.nextInt();

        for(int i =1; i < N+1; i++){
            String str = String.valueOf(i);
            String[] strArr = str.split("");
            int check = 0;
            for(int j = 0; j < strArr.length; j++){
                if(strArr[j].equals("3") || strArr[j].equals("6") ||strArr[j].equals("9")){
                    System.out.print("-");
                    check = 1;
                }
            }
            if(check == 0){
                System.out.print(i);
            }
            System.out.print(" ");
        }
    }
}
