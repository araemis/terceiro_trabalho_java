package trabalho3;
import java.util.Scanner;
public class lanchonete {
	public static void main(String[] args) {
		int quant=0;
		double preco,calc_total,c=0,c1=0,c2=0,c3=0,c4=0,c5=0;
		String pedido=null;
		Scanner sc = new Scanner(System.in);
		System.out.println("digite o código 0 para parar o programa");
		System.out.println("O cardápio de uma lanchonete é o seguinte:");
		System.out.println("Especificação 		Código 	Preço");
		System.out.println("Cachorro Quente 	100 	R$ 1,20");
		System.out.println("Bauru Simples 		101 	R$ 1,30");
		System.out.println("Bauru com ovo 		102 	R$ 1,50");
		System.out.println("Hambúrguer              103     R$ 1,20");
		System.out.println("Cheeseburguer 		104 	R$ 1,30");
		System.out.println("Refrigerante 		105 	R$ 1,00");
		System.out.println();
		for(int i=0;i>-1;i++) {
			System.out.print("código:");
			int cod = sc.nextInt();
			switch(cod) {
				case 100:
					pedido="Cachorro Quente";
				break;
				case 101:
					pedido="Bauru Simples";
				break;
				case 102:
					pedido="Bauru com ovo";
				break;
				case 103:
					pedido="Hambúrguer";
				break;
				case 104:
					pedido="Cheeseburguer";
				break;
				case 105:
					pedido="Refrigerante";
				break;
				case 0:
					i=-2;
				break;
				default:
					System.err.println("ERRO! codigo inválido");
			}
			if(cod>=100 && cod<=105) {
				System.out.print("quantos "+pedido+" deseja? ");
				quant = sc.nextInt();
				while (quant<=0) {
					System.out.print("quantos "+pedido+" deseja? ");
					quant = sc.nextInt();
			}
			}
			if(cod==100) {
				preco = 1.2;
				c+=(preco*quant);
			}else if(cod==101){ 
				preco = 1.3;
				c1+=(preco*quant);
			}else if(cod==102) { 
				preco = 1.5;
				c2+=(preco*quant);
			}else if(cod==103) {
				preco = 1.2;
				c3+=(preco*quant);
			}else if(cod==104) {
				preco = 1.3;
				c4+=(preco*quant);
			}else if(cod==105) {
				preco = 1;
				c5+=(preco*quant);
			}
		}
		calc_total = c+c1+c2+c3+c4+c5;
		System.out.println("Especificação preço unitario:");
		if (c!=0) 
			System.out.printf("Cachorro Quente %10.2f %n",c);
		if (c1!=0) 
			System.out.printf("Bauru Simples %12.2f %n",c1);
		if (c2!=0) 
			System.out.printf("Bauru com ovo %12.2f %n",c2);
		if (c3!=0) 
			System.out.printf("Hambúrguer %15.2f %n",c3);
		if (c4!=0) 
			System.out.printf("Cheeseburguer %12.2f %n",(c4));
		if (c5!=0) 
			System.out.printf("Refrigerante %13.2f %n",(c5));
		System.out.println();
		System.out.printf("valor total:%14.2f",calc_total);
		sc.close();
}}