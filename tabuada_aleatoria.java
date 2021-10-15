package trabalho3;
import java.util.Scanner;
public class tabuada_aleatoria {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Montar a tabuada de ");
		int num = sc.nextInt();
		System.out.print("valor inicial ");
		int inicio = sc.nextInt();
		System.out.print("valor final ");
		int fim = sc.nextInt();
		while (inicio>fim) {
			System.out.print("valor inicial");
			inicio = sc.nextInt();
			System.out.print("valor final ");
			fim = sc.nextInt();
		}
		System.out.println("Montar a tabuada de: "+num);
		System.out.println("Começar pelo: "+inicio);
		System.out.println("Terminar no: "+fim);
		for(int i=inicio;i<=fim;i++) {
			int total = i*num;
			System.out.println(num+" x "+i+" = "+total);
		}sc.close();
}}