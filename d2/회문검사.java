package d2;

import java.util.Scanner;

public class 회문검사 {
    public static void main(String[] args) {
        // "level" 과 같이 거꾸로 읽어도 제대로 읽은 것과 같은 문장이나 낱말을 회문(回文, palindrome)이라 한다.
        // 단어를 입력 받아 회문이면 1을 출력하고, 아니라면 0을 출력하는 프로그램을 작성하라.
        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int result = 1;
			String word = sc.next();
            String[] wordArr = word.split("");
            for(int i = 0; i < word.length() /2; i++){
                if(!wordArr[i].equals(wordArr[word.length()-i -1])){
                    result = 0;
                }
            }
            System.out.println("#" + test_case + " " + result);
		}
    }
}
