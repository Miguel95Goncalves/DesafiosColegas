package nivel3;

import java.util.Random;
import java.util.Scanner;

public class Exercicio8 {

	public Exercicio8() {
		// TODO Auto-generated constructor stub
		int num,aux,cont=0;
		
		Random rand = new Random();
		int numAleatorio = rand.nextInt(20);
		
		do
		{
			System.out.println("Número aleatório: "+numAleatorio);
			System.out.println("Intorduza '1' para apostar num número acima e '2' para apostar num número abaixo");
			num = (new Scanner(System.in)).nextInt();
			
			aux=numAleatorio;
			
			numAleatorio = rand.nextInt(20);
			
			if (num==1 && numAleatorio>aux || num==2 && numAleatorio<aux) cont++;
			
		}while(num==1 && numAleatorio>aux || num==2 && numAleatorio<aux);
		
		System.out.println("Número aleatório: "+numAleatorio);
		
		System.out.println("Acertou "+cont+" vezes!");
	}

}
