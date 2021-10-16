package trabalho3;
import java.util.Scanner;
public class invertido {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Digite um número inteiro ");
		int num = sc.nextInt();
		int n = num;
		int mod=10;
		String num_f="";
		sc.close();
		while(n!=0) {
			num%=mod;
			num_f += num;
			n=(n-num)/mod;
			num=n;
		}
		System.out.println("Número invertido "+num_f);
		sc.close();
}}
