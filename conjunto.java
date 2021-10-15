package trabalho3;
import java.util.Scanner;
public class conjunto {
	public static void main(String[] args) {
		int menor=0;
		int maior=0;
		int soma=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("quantidade de números irá digitar ");
		int vezes = sc.nextInt();
		for(int i=0;i<vezes;i++) {
			System.out.print((i+1)+"º numero ");
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
		System.out.println("menor número "+menor);
		System.out.println("maior número "+maior);
		System.out.println("soma dos número "+soma);
		sc.close();
	}}