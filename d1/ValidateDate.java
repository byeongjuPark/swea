package d1;

import java.util.Scanner;

public class ValidateDate {
    public static void main(String[] args) {
        // 연월일 순으로 구성된 8자리의 날짜가 입력으로 주어진다.
        // 해당 날짜의 유효성을 판단한 후, 날짜가 유효하다면 ”YYYY/MM/DD”형식으로 출력하고,
        // 날짜가 유효하지 않을 경우, -1 을 출력하는 프로그램을 작성하라.
        // ※ 2월의 경우, 28일인 경우만 고려한다. (윤년은 고려하지 않는다.)
        Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		int day[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        String[] dates = new String[T];
        for(int i = 0; i < T; i++){
            dates[i] = sc.next();
        }
        
		for(int test_case = 1; test_case <= T; test_case++)
		{
		
            String inputStr = dates[test_case-1].trim();
			
            String date[] = new String[3]; 
            date[0] = inputStr.substring(0, 4);
            date[1] = inputStr.substring(4, 6);
            date[2] = inputStr.substring(6, 8);

            int valiMonth = Integer.parseInt(date[1]);
            int valiDay = Integer.parseInt(date[2]);
            if(valiMonth == 0 || valiMonth > 12 || valiDay == 0 || valiDay > day[valiMonth-1]){
                System.out.println("#"+ test_case + " -1");
                continue;
            }

            System.out.println("#"+ test_case + " "+date[0] + "/" + date[1] + "/" + date[2]);

        }
    }   
}
