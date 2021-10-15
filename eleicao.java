package trabalho3;
import java.util.Scanner;
public class eleicao {
	public static void main(String[] args) {
		int c1=0;
		int c2=0;
		int c3=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("total de votantes? ");
		int total = sc.nextInt();
		for(int i=1;i<=total;i++) {
			System.out.println("candidatos:1-joão, 2-maria, 3-keke");
			System.out.print("em quem deseja votar? ");
			int voto = sc.nextInt();
			while(voto!=1 && voto!=2 && voto!=3) {
				System.out.println("candidatos:1-joão, 2-maria, 3-keke");
				System.out.print("em quem deseja votar? ");
				voto = sc.nextInt();
			}
			if(voto==1) 
				c1++;
			else if(voto==2)
				c2++;
			else 
				c3++;
		}
		System.out.println("candidato João:"+c1+" votos");
		System.out.println("candidata Maria:"+c2+" votos");
		System.out.println("candidato Keke:"+c3+" votos");
		sc.close();
}}