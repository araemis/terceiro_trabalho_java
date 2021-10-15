package trabalho3;
import java.util.Scanner;
public class panificadora {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("quantidade de pães:");
		int pao = sc.nextInt();
		while(pao<1 || pao>50) {
			System.out.print("quantidade de pães:");
			pao = sc.nextInt();
		}
		System.out.print("preço de cada pao:");
		float preco = sc.nextFloat();
		while(preco<=0) {
			System.out.print("preço de cada pao:");
			preco = sc.nextFloat();
		}
		for(int i=1;i<=pao;i++) {
			float valor=preco; 
			valor*=i;
			System.out.printf(i+" - R$ %.2f %n",(valor));
		}sc.close();
}}
//26. O Sr. Manoel Joaquim acabou de adquirir uma panificadora e pretende implantar a
//metodologia da tabelinha, que já é um sucesso na sua loja de 1,99. Você foi contratado para
//desenvolver o programa que monta a tabela de preços dos pães, de 1 até 50 pães, a partir do
//preço do pão informado pelo usuário, conforme o exemplo abaixo:
//Preço do pão: R$ 0.18
//Panificadora Pão de Ontem - Tabela de preços
//1 - R$ 0.18
//2 - R$ 0.36
//...
//50 - R$ 9.00