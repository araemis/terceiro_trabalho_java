package trabalho3;
import java.util.Scanner;
public class habitantes {
	public static void main(String[] args) {
		int anos=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("popula��o inicial pa�s a ");
		float a = sc.nextFloat();
		System.out.print("taxa de crescimento pa�s a ");
		float ta = sc.nextFloat();
		System.out.println();
		System.out.print("popula��o final pa�s b ");
		float b = sc.nextFloat();
		System.out.print("taxa de crescimento pa�s b ");
		float tb = sc.nextFloat();
		while(a<b) {
			a+=(a*ta);
			b+=(b*tb);
			anos++;
			if(a>b) {
				System.out.println();
				System.out.println("anos necess�rios para o pa�s A ser maior que o pa�s B "+anos);
				System.out.println();
				anos=0;
				System.out.print("popula��o inicial pa�s a ");
				a = sc.nextFloat();
				System.out.print("taxa de crescimento pa�s a ");
				ta = sc.nextFloat();
				System.out.println();
				System.out.print("popula��o final pa�s b ");
				b = sc.nextFloat();
				System.out.print("taxa de crescimento pa�s b ");
				tb = sc.nextFloat();}
		}sc.close();
		System.err.println("Popula��o do pa�s A maior que do pa�s B");
	}}