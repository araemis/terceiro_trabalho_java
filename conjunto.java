package trabalho3;
import java.util.Scanner;
public class conjunto {
	public static void main(String[] args) {
		int menor=0;
		int maior=0;
		int soma=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("quantidade de n�meros ir� digitar ");
		int vezes = sc.nextInt();
		for(int i=0;i<vezes;i++) {
			System.out.print((i+1)+"� numero ");
			int num = sc.nextInt();
			if (i==0) {
				maior = num;
				menor = num;
				soma = num;
			}else {
				if(num>maior) 
					maior = num;
				if(num<menor) 
					menor = num;
				soma = soma + num;	
		}}
		System.out.println("menor n�mero "+menor);
		System.out.println("maior n�mero "+maior);
		System.out.println("soma dos n�mero "+soma);
		sc.close();
	}}