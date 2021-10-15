package trabalho3;
import java.util.Scanner;
public class senha {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Usuario ");
		String usuario = sc.nextLine();
		System.out.print("Senha ");
		String senha = sc.nextLine();
		while(usuario.contains(senha)) {
			System.err.println("ERRO, usuario igual senha!!!");
			System.out.println();
			System.out.print("Usuário ");
			usuario = sc.nextLine();
			System.out.print("Senha ");
			senha = sc.nextLine();
			System.out.println();
		}System.out.println("Login aprovado");
		sc.close();
	}}