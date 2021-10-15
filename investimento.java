package trabalho3;
import java.util.Scanner;
public class investimento {
	public static void main(String[] args) {
		float media=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("informe a quantidade de CDs comprados ");
		int cd = sc.nextInt();
		while(cd<=0) {
			System.out.print("informe a quantidade de CDs comprados ");
			cd = sc.nextInt();
		}
		for(int i=1; i<=cd; i++) {
			System.out.print("informe o valor de cada cd ");
			int preco = sc.nextInt();
			while(preco<=0) {
				System.out.print("informe o valor de cada cd ");
				preco = sc.nextInt();
			}
		media = media + preco;
		}
		System.out.printf("valor total investido:%.0f %n",(media));
		media = media/cd;
		System.out.printf("valor médio gasto em cada cd:%.2f %n",(media));
		sc.close();
}}