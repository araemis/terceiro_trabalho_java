package trabalho3;
import java.util.Scanner;
public class termos {
	public static void main(String[] args) {
		int num=1;
		Scanner sc = new Scanner(System.in);
		System.out.print("digite um termo ");
		int termo = sc.nextInt();
		System.out.print("S = ");
		for(int i=1; i<=termo; i++) {
			if(i!=termo)
				System.out.print(i+"/"+num+" + ");
			else
				System.out.print(i+"/"+num);
			num = num + 2;
		}sc.close();
	}}