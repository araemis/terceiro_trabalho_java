package trabalho3;
import java.util.Scanner;
public class conveniencias {
	public static void main(String[] args) {
		float total=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("• Lojas Tabajara ");
		for(int i=1;i>-1;i++) {
			System.out.print("Valor do "+i+"º produto R$");
			float pro = sc.nextFloat();
			while(pro<0) {
				System.out.print("Valor do "+i+"º produto R$");
				pro = sc.nextFloat();
			}
			total+=pro;
			if(pro==0) {
				System.out.println("Total: R$ "+total);
				System.out.print("Dinheiro: R$ ");
				float din = sc.nextFloat();
				while(din<total) {
					System.out.print("Dinheiro: R$ ");
					din = sc.nextFloat();
				}
				float tro = din - total;
				System.out.println("Troco: R$ "+tro);
				i=0;
				System.out.println();
				System.out.println("• Lojas Tabajara ");
			}	
		}sc.close();	
}}