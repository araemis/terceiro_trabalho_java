package trabalho3;
import java.util.Scanner;
public class impares {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i=1; i<=50; i++) {
			if(i%2!=0) {
				if (i!=47 && i!=49)
					System.out.print(i+", ");
				else if (i==47) 
					System.out.print(i+" e ");
				else if (i==49) 
					System.out.print(i);
			}
		}sc.close();
	}}