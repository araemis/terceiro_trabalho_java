package trabalho3;
import java.util.Scanner;
public class divisibilidade {
	public static void main(String[] args) {
		int test=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("digite um número inteiro ");
		int num = sc.nextInt();
		for(int i=1;i<=num;i++) {
			if(num%i==0) 
				test++;
				if(test==3)
					i=num;
		}
		if(test==2) 
			System.out.print("número é primo");
		else {
			System.out.print("número nao é primo e divisivel por: ");
			for (int i=1; i<=num; i++) {
				if(num%i==0)
					System.out.print(i+" ");
			}
		}sc.close();
}}