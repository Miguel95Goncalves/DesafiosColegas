package nivel2;

import java.util.Scanner;

public class Exercicio7 {

	public Exercicio7() {
		// TODO Auto-generated constructor stub
		double[] pilotos = new double[3];
		
		double maior=0.0, menor=200.0;
		int maior_p=0, menor_p=0;
		
		for(int i=0;i<3;i++)
		{
			System.out.println("Introduza o tempo do piloto "+(i+1));
			pilotos[i] = (new Scanner(System.in)).nextDouble();
			if (pilotos[i]>maior)
			{
				maior=pilotos[i];
				maior_p=i+1;
			}
			if(pilotos[i]<menor)
			{
				menor=pilotos[i];
				menor_p=i+1;
			}
		}
		
		
		System.out.println("O piloto mais rápido foi o "+menor_p+" com o tempo de "+menor+"!");
		System.out.println("O piloto desclassificado foi o "+maior_p+" com o tempo de "+maior+"!");
	}

}
