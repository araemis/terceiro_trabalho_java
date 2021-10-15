package trabalho3;
import java.util.Scanner;
public class voto {
	public static void main(String[] args) {
		int [] v = new int[4];
		int total=0;
		double perc_nulo=0,perc_branco=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Para finalizar o programa digite 0");
		System.out.println("Candidatos 1-Jose, 2-João, 3-Marcos, 4-Melissa, 5-Nulo, 6-branco");
		for (int i=0;i>-1;i++) {
			System.out.print("voto:");
			int voto = sc.nextInt();	
			if(voto==0) {
				i=-2;
			}else if (voto ==1) {
				v[voto-1]++;
				total++;
			}else if (voto ==2) {
				v[voto-1]++;
				total++;
			}else if (voto ==3) {
				v[voto-1]++;
				total++;
			}else if (voto ==4) {
				v[voto-1]++;
				total++;
			}else if (voto ==5) {
				perc_nulo++;
				total++;
			}else if (voto ==6) {
				perc_branco++;
				total++;
			}else {
				System.out.println("voto inválido");
			}
		}
		for(int i=0;i<=3;i++) {
			if(v[i]!=0) {
				System.out.println("Total de votos do "+(i+1)+"º candidato:"+v[i]);
			}
		}
			System.out.println("Total de votos do nulos:"+perc_nulo);
			System.out.println("Total de votos do brancos:"+perc_branco);
			System.out.printf("percentagem de votos do nulos:%2.2f %n",perc_nulo/total);
			System.out.printf("percentagem de votos do brancos:%2.2f %n",perc_branco/total);
		for(int i=0;i<=3;i++) {
			if(v[i]==0) {
				System.out.println((i+1)+"º candidato tem "+v[i]+" votos");
			}
		}sc.close();
}}