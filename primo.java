package trabalho3;
import java.util.Scanner;
public class primo {
	public static void main(String[] args) {
		int test=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("n�mero inteiro ");
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
			System.out.println("n�mero � primo");
		else
			System.out.println("n�mero nao � primo ");
		sc.close();
}}