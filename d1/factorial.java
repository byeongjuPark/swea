package d1;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		double T;
		T=sc.nextInt();
		int result;
        if(T == 1){
            System.out.println(1);
            return;
        }
        if((T % 2) == 0){
        	result = (int) ((T+1) * (T/2));
            System.out.println(result);
        } else {
        	result = (int) (((T+1) * (T/2)) + (T+1));
            System.out.println(result);
        }
    }
}
