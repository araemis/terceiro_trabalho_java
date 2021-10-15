package trabalho3;
import java.util.Scanner;
public class meteorologia {
	public static void main(String[] args) {
		float menor=0;
		float maior=0;
		float media=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Diga a quantidade de temperaturas que irá informar ");
		int vezes = sc.nextInt();
		for(int i=1;i<=vezes;i++) {
			System.out.print(i+"º temperatura ");
			float temp = sc.nextFloat();
			if (i==1) {
				menor=temp;
				maior=temp;
			}else if(menor>temp) {
				menor = temp;
			}else if(maior<temp) {
				maior = temp;}
			media+=temp;
		}
		media/=vezes;
		System.out.println("menor temperatura:"+menor);
		System.out.println("maior temperatura:"+maior);
		System.out.printf("média das temperaturas:%.2f %n",(media));
		sc.close();
}}