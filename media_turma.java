package trabalho3;
import java.util.Scanner;
public class media_turma {
	public static void main(String[] args) {
		float media=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("digite a quantidade de turmas ");
		int turmas = sc.nextInt();
		while(turmas<=0) {
			System.out.print("digite a quantidade de turmas ");
			turmas = sc.nextInt();
			System.out.println();
		}
		for(int i=1; i<=turmas; i++) {
			System.out.print("quantidade de alunos<=40 para a "+i+"ª turma ");
			int alunos = sc.nextInt();
			while(alunos>40 && alunos<=0) {
				System.out.print("quantidade de alunos<=40 para a "+i+"ª turma ");
				alunos = sc.nextInt();
			}
		media = media + alunos;
		}
		media = media/turmas;
		System.out.printf("número médio de alunos por turma:%.2f %n",(media));
		sc.close();
}}