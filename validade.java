package trabalho3;
import java.util.Scanner;
public class validade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("nome ");
		String nome = sc.nextLine();
		while(nome.length()<=3) {
		System.out.print("nome ");
		nome = sc.nextLine();
		}
		System.out.print("idade ");
		int idade = sc.nextInt();
		while(idade<0 || idade>150) {
		System.out.print("idade:");
		idade = sc.nextInt();
		}
		System.out.print("salario: ");
		float salario = sc.nextFloat();
		while(salario<=0) {
		System.out.print("salario:");
		salario = sc.nextFloat();
		}
		System.out.print("sexo f-feminino ou m-masculino ");
		char sexo = sc.next().charAt(0);
		while(sexo!= 'f' && sexo!= 'm') {
		System.out.print("sexo:");
		sexo = sc.next().charAt(0);
		}
		System.out.print("estado civil: s- solteira(o), c-casada(o), v-viuva(o), d-divociadaa(o) ");
		char estado = sc.next().charAt(0);
		while(estado!='s' && estado!='c' && estado!='v' && estado!='d') {
		System.out.print("estado civil: s- solteira(o), c-casada(o), v-viuva(o), d-divociadaa(o) ");
		estado = sc.next().charAt(0);
		}sc.close();
		System.out.println(nome+" tem "+idade+" anos, no momento ganha R$ "+salario+", seu sexo é "+sexo+" e no momento está "+ estado);
	}}