package trabalho3;
import java.util.Scanner;
public class juros {
	public static void main(String[] args) {
		int parcela=1;
		double divida,juros=0.1,vjuros=0,vparcela;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor da Dívida ");
		divida = sc.nextDouble();
		System.out.printf("%1s",("Valor da Dívida"));
		System.out.printf("%20s",("Valor dos Juros"));
		System.out.printf("%25s",("Quantidade de Parcelas"));
		System.out.printf("%24s%n",("Valor da Parcela"));
		for(int i=1;i<=5;i++) {
			divida = divida+vjuros;
			vparcela = divida/parcela;
			System.out.printf("R$ %1.2f",(divida));
			System.out.printf("%20.2f ",(vjuros));
			System.out.printf("%19d",(parcela));
			System.out.printf("%20.2s %2.2f%n","R$",(vparcela));
			divida = divida-vjuros;
			vjuros = divida*juros;
			juros = juros+0.05;
			parcela = i*3;
		}sc.close();
}}