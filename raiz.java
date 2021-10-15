package trabalho3;
import java.util.Scanner;
public class raiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("base ");
		int base = sc.nextInt();
		int calc = base;
		System.out.print("expoente ");
		float exp = sc.nextFloat();
		if (exp>=0) {
			for(int i=0; i<exp-1; i++) {
				if(exp!=0)
					calc *= base;
				else
					base=1;
			}
			System.out.println(base+"^"+exp+" = "+calc);
			}
		else 
			System.err.println("ERRO! expoente negativo");			
			sc.close();
	}}