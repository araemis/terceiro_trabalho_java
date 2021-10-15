package trabalho3;
import java.util.Scanner;
public class soma {
	public static void main(String[] args) {
		int a,b,soma=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("primeiro número ");
		a = sc.nextInt();
		System.out.print("segundo número ");
		b = sc.nextInt();
		if (a<b) {
			a++;
			while (a<b) {
				soma=soma+a;
				System.out.print(a++ +" ");}
		}else {
			b++;
			while (a>b) {
				soma=soma+b;
				System.out.print(b++ +" ");}
	}
	System.out.println();
	System.out.println("Soma dos números no intervalo "+soma);
	sc.close();
	}}