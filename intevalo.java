package trabalho3;
import java.util.Scanner;
public class intevalo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("número ");
		int a = sc.nextInt();
		System.out.print("número ");
		int b = sc.nextInt();
		if (a<b) {
			a++;
			while (a<b) {
				System.out.print(a++ +" ");
			}
		}else {
			b++;
			while (a>b) {
				System.out.print(b++ +" ");
			}
	}sc.close();
	}}