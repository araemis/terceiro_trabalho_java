package trabalho3;
import java.util.Scanner;
public class serie {
	public static void main(String[] args) {
		int res=1;
		System.out.print("S = ");
		Scanner sc = new Scanner(System.in);
		for (int i=1; i<37; i++) {
			int n1=38;
			int n2=39;
			n1+=-i;
			n2+=-i;
			res+=(n1*n2)/i;
			System.out.print(("("+n1+"*"+n2+")")+"/"+i+" + ");
		}
		System.out.print("("+1+"*"+2+")"+"/"+37+"="+res);
		sc.close();
	}}
//15. Mostre e calcule a série S = (37*38)/1 + (36*37)/2 + (35*36)/3 + ... + (1*2)/37. 