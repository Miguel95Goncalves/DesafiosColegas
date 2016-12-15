package nivel1;
import java.util.Scanner;

public class Exercicio1 {

	public Exercicio1() {
		// TODO Auto-generated constructor stub
		
		int[] vetor = new int[5];
		int maior=0, menor=200;
		
		for(int i=0;i<5;i++)
		{
			do
			{
				System.out.println("Insira o valor "+i+" (entre 1 e 100)");
				vetor[i] = (new Scanner(System.in)).nextInt();
			}while(vetor[i]<1 || vetor[i]>100);
			
			if(vetor[i]>maior)
			{
				maior=vetor[i];
			}
			if(vetor[i]<menor)
			{
				menor=vetor[i];
			}
		}
		
		System.out.println("Maior valor: "+maior);
		System.out.println("Menor valor: "+menor);
		
	}

}
