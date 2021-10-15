package trabalho3;
import java.util.Scanner;
public class prova {
	public static void main(String[] args) {
		char [] resp = new char[10];
		char [] gab = new char[10];
		boolean verd = true;
		int acertos=0,menor=0,maior=0,alunos=0;
		double media=0;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<=9;i++) {
			System.out.print("gabarito da "+(i+1)+"ª questão:");
			gab[i] = sc.next().charAt(0);
			while(gab[i]!='a' && gab[i]!='b' && gab[i]!='c' && gab[i]!='d' && gab[i]!='e') {
				System.out.println("ERRO! Alternativa incorreta tente novamente");
				System.out.print("resposta da "+(i+1)+"ª questão:");
				gab[i] = sc.next().charAt(0);
			}
		}System.out.println();
		for(int i=0;i<10;i++) {
			System.out.print("resposta da "+(i+1)+"ª questão:");
			resp[i] = sc.next().charAt(0);
			while(resp[i]!='a' && resp[i]!='b' && resp[i]!='c' && resp[i]!='d' && resp[i]!='e') {
				System.err.println("ERRO! Alternativa incorreta tente novamente");
				System.out.print("resposta da "+(i+1)+"ª questão:");
				resp[i] = sc.next().charAt(0);
			}
			if (resp[i]==gab[i]) 
				acertos++;
			if (i==9) {
				if (verd==true) {
					maior=acertos;
					menor=acertos;
					verd = false;
				}if (maior<acertos) 
					maior=acertos;
				if(menor>acertos) 
					menor=acertos;
				alunos++;
				media+=acertos;
				media/=alunos;
				acertos = 0;
				System.out.print("mais algum alunos s-sim ou n-não");
				char fim = sc.next().charAt(0);
				while(fim!='s' && fim!='n') {
					System.out.print("mais algum alunos s-sim ou n-não");
					fim = sc.next().charAt(0);
				}
				if(fim=='s') 
					i=-1;
				else {
					System.out.println();
					System.out.println("Maior Acerto:"+maior);
					System.out.println("Menor Acerto:"+menor);
					System.out.println("Total de Alunos que utilizaram o sistema:"+alunos);
					System.out.println("Média das notas da Turma:"+media);
				}
			}
		}sc.close();
}}