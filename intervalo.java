package trabalho3;
import java.util.Scanner;
public class intervalo {
	public static void main(String[] args) {
		int contador=0;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i>-1;i++) {
			System.out.print("Digite um n�mero positivo ");
			int num = sc.nextInt();
			if (num<0) 
				i=-2;			
			if (num>0 && num<25 || num>26 && num<50 || num>51 && num<75 || num>76 && num<100) 
				contador++;			
		}
		System.out.println(contador+" n�meros est�o no intervalo");
		sc.close();
}}
//34. Fa�a um programa que leia uma quantidade indeterminada de n�meros positivos e conte
//quantos deles est�o nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100]. A entrada
//de dados dever� terminar quando for lido um n�mero negativo.