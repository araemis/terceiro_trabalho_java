package trabalho3;
import java.util.Scanner;
public class invertido {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Digite um número inteiro ");
		int num = sc.nextInt();
		int n = num;
		int mod=10;
		int num_f = 0;
		sc.close();
		while(n!=0) {
			num%=mod;
			num_f=(num_f+num)*mod;
			n=(n-num)/mod;
			num=n;
		}
		num_f/=mod;
		System.err.println("Número digitado "+n);
		System.out.println("Número invertido "+num_f);
		sc.close();
}}