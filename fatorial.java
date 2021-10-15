package trabalho3;
import java.util.Scanner;
public class fatorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("número ");
		int num = sc.nextInt();
		int calc = num;
		System.out.print(num+"!=");
		for(int i=num-1; i>0 ;i--) {
			calc *= i;
			System.out.print((i+1)+".");
		}		
		System.out.print(1+"="+calc);
		sc.close();
	}}
