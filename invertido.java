package trabalho3;
import java.util.Scanner;
public class invertido {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Digite um nmero inteiro ");
		int num = sc.nextInt();
		int n = num;
		int mod=10;
		int num_f = 0;
		sc.close();
		while(n!=0) {
			num%=mod;
			num_f+=num;
			num_f*=10;
			n-=num;
			n/=10;
			num=n;
		}
		num_f/=10;
		System.out.println("Nmero invertido "+num_f);
		sc.close();
}}