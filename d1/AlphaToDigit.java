package d1;

import java.util.Scanner;

public class AlphaToDigit {
    public static void main(String[] args) {
        // 알파벳으로 이루어진 문자열을 입력 받아 각 알파벳을 1부터 26까지의 숫자로 변환하여 출력하라.
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();
        char alpha[] = inputStr.toCharArray();
        for(int i = 0 ; i < alpha.length; i++){
            char a = (char) (alpha[i] -  'A' + 1);
            System.out.print((int)a + " ");
        }
    }
}
