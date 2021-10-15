package trabalho3;
import java.util.Scanner;
public class turma {
	public static void main(String[] args) {
		float media=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe a quantidade de pessoas que irá usar o programa ");
		int vezes = sc.nextInt();
		for(int i=0;i<vezes;i++) {
			System.out.print("idade:");
			int idade = sc.nextInt();
			while(idade<0) {
				System.out.print("idade:");
				idade = sc.nextInt();
			}
			media = media + idade;
		}
		media = media/vezes;
		if (media>=0 && media<=25)
			System.out.print("turma é jovem");
		else if (media>=26 && media<=60)
			System.out.print("turma é adulta");
		else if(media>60)
			System.out.print("turma é idosa");
		else
			System.err.println("ERRO! valor digitado inválido");
		System.out.println(" media:"+media);
		sc.close();
}}