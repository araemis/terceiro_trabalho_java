package trabalho3;
import java.util.Scanner;
public class par_impar {
	public static void main(String[] args) {
		int par=0;
		int impar=0;
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<10; i++) {
			System.out.print((i+1)+"� n�mero ");
			byte num = sc.nextByte();
			if (num%2==0) 
				par++;
			else 
				impar++;
		}
		System.out.println("dos n�meros digitados "+par+" s�o pares e "+impar+" s�o impares");
		sc.close();
	}}