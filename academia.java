package trabalho3;
import java.util.Scanner;
public class academia {
	public static void main(String[] args) {
		int cod,c_alto=0,c_baixo=0,c_magro=0,c_gordo=0,alto=0,baixo=0,peso,gordo=0,magro=0;
		double media_altura=0,media_peso=0;
		Scanner sc = new Scanner(System.in);
		for(int i=1;i>-1;i++) {
			System.out.print("Digite o seu código ");
			cod = sc.nextInt();
			if(cod==0) {
				media_altura = media_altura/(i-1);
				media_peso = media_peso/(i-1);
				i=-2;
			}else {
				System.out.print("Informe a sua altura em cm ");
				int altura = sc.nextInt();
				System.out.print("Informe o seu peso em kg ");
				peso = sc.nextInt();
				System.out.println();
				if (i==1) {
					alto = altura;
					baixo = altura;
					gordo = peso;
					magro = peso;
					c_alto = cod;
					c_baixo = cod;
					c_magro = cod;
					c_gordo = cod;
					media_altura = altura;
					media_peso = peso;
				}else {
					if (alto<altura) {
						alto = altura;
						c_alto = cod;
					}else if (baixo>altura) {
						baixo = altura;
						c_baixo = cod;
					}
					if (gordo<peso) {
						gordo = peso;
						c_gordo = cod;
					}else if (magro>peso) {
						magro = peso;
						c_magro = cod;
					}
					media_altura = media_altura + altura;
					media_peso = media_peso + peso;
}}}
		System.out.println("Cliente do código:"+c_alto+ " é o mais alto, com "+alto+" cm");
		System.out.println("Cliente do código:"+c_baixo+" é o mais baixo com "+baixo+" cm");
		System.out.println("Cliente do código:"+c_gordo+" é o mais gordo com "+gordo+" kg");
		System.out.println("Cliente do código:"+c_magro+" é o mais magro com "+magro+" kg");
		System.out.printf("média das alturas: %.2f %n",(media_altura));
		System.out.printf("média dos pesos: %.2f %n",(media_peso));
		sc.close();
}}