package trabalho3;
import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
		int n1=1;
		int n2=1;
		int n3=1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um termo da sequência de Fibonacci ");
		int termo = sc.nextInt();
		for (int i=0; i<termo; i++) {
			if(i!=0 && i!=1) {
				n1=n2;
				n2+=n3;
				n3=n1;
				System.out.print(n2+" ");
			}else {
				System.out.print (n1+" ");
			}
		}sc.close();
	}}