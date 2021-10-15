package trabalho3;
import java.util.Scanner;
public class nota {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("digite uma nota entre 0 e 10 ");
		int nota = sc.nextInt();
		while(nota<0 || nota>10) {
			System.err.println("valor inválido!");
			System.out.println();
			System.out.print("digite uma nota entre 0 e 10 ");
			nota = sc.nextInt();
		}
		System.out.println("valor válido");
		System.out.print("nota:"+nota);
		sc.close();
	}}