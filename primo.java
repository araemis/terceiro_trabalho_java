package trabalho3;
import java.util.Scanner;
public class primo {
	public static void main(String[] args) {
		int test=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("número inteiro ");
		int num = sc.nextInt();
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				test++;
				if(test==3)
					i=num;
			}
		}
		System.out.println();
		if(test==2) 
			System.out.println("número é primo");
		else
			System.out.println("número nao é primo ");
		sc.close();
}}