package trabalho3;
import java.util.Scanner;
public class estatistica {
	public static void main(String[] args) {
		int c_maior=0,c_menor=0,maior=0,menor=0;
		double media_veiculos=0,media_acidentes=0;
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=5;i++) {
			System.out.print("C�digo da cidade:");
			int cod = sc.nextInt();
			System.out.print("N�mero de ve�culos de passeio:");
			int veiculos = sc.nextInt();
			System.out.print("N�mero de acidentes de tr�nsito com v�timas:");
			int indice = sc.nextInt();
			if (i==1) {
				maior = indice;
				menor = indice;
				c_maior = cod;
				c_menor = cod;
				media_veiculos = veiculos;
			}else {
				if (maior<indice) {
					maior = indice;
					c_maior = cod;
				}
				if (menor>indice) {
					menor = indice;
					c_menor = cod;
				}
				media_veiculos = media_veiculos + veiculos;
			}
			if(veiculos<2000) {
				media_acidentes = media_acidentes + indice;
			}
		}
		media_veiculos = media_veiculos/5;
		media_acidentes = media_acidentes/5;
		System.out.println("c�digo da cidade:"+c_maior+" com maior �ndice de acidentes de transito:"+maior);
		System.out.println("c�digo da cidade:"+c_menor+" com menor �ndice de acidentes de transito:"+menor);
		System.out.println("m�dia de ve�culos nas cinco cidades juntas:"+media_veiculos);
		System.out.println("m�dia de acidentes de tr�nsito nas cidades com menos de 2.000 ve�culos de passeio:"+media_acidentes);
		sc.close();
}}