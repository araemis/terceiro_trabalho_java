package trabalho3;
import java.util.Scanner;
public class panificadora {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("quantidade de p�es:");
		int pao = sc.nextInt();
		while(pao<1 || pao>50) {
			System.out.print("quantidade de p�es:");
			pao = sc.nextInt();
		}
		System.out.print("pre�o de cada pao:");
		float preco = sc.nextFloat();
		while(preco<=0) {
			System.out.print("pre�o de cada pao:");
			preco = sc.nextFloat();
		}
		for(int i=1;i<=pao;i++) {
			float valor=preco; 
			valor*=i;
			System.out.printf(i+" - R$ %.2f %n",(valor));
		}sc.close();
}}
//26. O Sr. Manoel Joaquim acabou de adquirir uma panificadora e pretende implantar a
//metodologia da tabelinha, que j� � um sucesso na sua loja de 1,99. Voc� foi contratado para
//desenvolver o programa que monta a tabela de pre�os dos p�es, de 1 at� 50 p�es, a partir do
//pre�o do p�o informado pelo usu�rio, conforme o exemplo abaixo:
//Pre�o do p�o: R$ 0.18
//Panificadora P�o de Ontem - Tabela de pre�os
//1 - R$ 0.18
//2 - R$ 0.36
//...
//50 - R$ 9.00