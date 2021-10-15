package trabalho3;
import java.util.Scanner;
public class media {
	public static void main(String[] args) {
		double media=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe a quantidade de notas a ser digitada ");
		int vezes = sc.nextInt();
		for(int i=0;i<vezes;i++) {	
			System.out.print("número:");
			int num = sc.nextInt();
				media = media + num;
		}
		media = media/vezes;
		System.out.printf("media:%.2f %n",(media));
		sc.close();
}}