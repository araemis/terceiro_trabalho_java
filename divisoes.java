package trabalho3;
import java.util.Scanner;
public class divisoes {
	public static void main(String[] args) {
		int div=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número ");
		int n = sc.nextInt();
		System.out.println();
		System.out.print("Primo entre 1 e "+n+": ");
		for(int i=1;i<=n;i++) {
			int test=0;
			for(int a=1;a<=i;a++) {
				div++;
				if(i%a==0)
					test++;				
			}
			if(test==2) 
				System.out.print(i+" ");			
		}
		System.out.println();
		System.out.print("número de divisões executadas:"+div);
		sc.close();
}}