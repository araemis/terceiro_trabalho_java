package trabalho3;
import java.util.Scanner;
public class aluno {
	public static void main(String[] args) {
		int n_alto=0,n_baixo=0,altura,alto=0,baixo=0;
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=5;i++) {
			System.out.print(+i+"� aluno informe seu n�mero ");
			int num = sc.nextInt();
			System.out.print("Digite a sua altura em cm ");
			altura = sc.nextInt();
			while(altura<=0) {
				System.out.print("Digite a sua altura em cm ");
				altura = sc.nextInt();
			}
			if (i==1) {
				alto = altura;
				baixo = altura;
				n_alto = num;
				n_baixo = num;
			}else {
				if (alto<altura) {
					alto = altura;
					n_alto = num;
				}
				if (baixo>altura) {
					baixo = altura;
					n_baixo = num;
				}	
			}
		}
		System.out.println("Aluno do n�mero: "+n_alto+ " � o mais alto com "+alto+" cm");
		System.out.println("Aluno do n�mero: "+n_baixo+" � o mais baixo com "+baixo+" cm");
		sc.close();
}}