package trabalho3;
import java.util.Scanner;
public class habitantes {
	public static void main(String[] args) {
		int anos=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("população inicial país a ");
		float a = sc.nextFloat();
		System.out.print("taxa de crescimento país a ");
		float ta = sc.nextFloat();
		System.out.println();
		System.out.print("população final país b ");
		float b = sc.nextFloat();
		System.out.print("taxa de crescimento país b ");
		float tb = sc.nextFloat();
		while(a<b) {
			a+=(a*ta);
			b+=(b*tb);
			anos++;
			if(a>b) {
				System.out.println();
				System.out.println("anos necessários para o país A ser maior que o país B "+anos);
				System.out.println();
				anos=0;
				System.out.print("população inicial país a ");
				a = sc.nextFloat();
				System.out.print("taxa de crescimento país a ");
				ta = sc.nextFloat();
				System.out.println();
				System.out.print("população final país b ");
				b = sc.nextFloat();
				System.out.print("taxa de crescimento país b ");
				tb = sc.nextFloat();}
		}sc.close();
		System.err.println("População do país A maior que do país B");
	}}