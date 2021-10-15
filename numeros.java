package trabalho3;
import java.util.Scanner;
public class numeros {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i=1; i<=20; i++) {
			if (i!=19) 
			System.out.print(i+", ");
			else 
				System.out.print(i+" e ");
		}sc.close();
	}}