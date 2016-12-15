package nivel3;

import java.util.Scanner;

public class Exercicio15 {

	public Exercicio15() {
		// TODO Auto-generated constructor stub
		int [] pasteis= new int[7];
		int [] dias= {1,2,3,4,5,6,7};
		int soma=0,media=0,aux=0,aux2=0;
		
		for(int i=0;i<pasteis.length;i++)
		{
			System.out.println("Insira os pasteis vendidos no dia "+(i+1));
			pasteis[i] = (new Scanner(System.in)).nextInt();
			soma+=pasteis[i];
		}
		
		media=soma/pasteis.length;
		
		for(int i=0;i<pasteis.length;i++)
		{
			for(int j=0;j<pasteis.length;j++)
			{
				if(pasteis[i]>pasteis[j])
				{
					aux=pasteis[i];
					pasteis[i]=pasteis[j];
					pasteis[j]=aux;
					
					aux2=dias[i];
					dias[i]=dias[j];
					dias[j]=aux2;
				}
			}
		}
		
		System.out.println("Em media vende-se "+media+" por dia!");
		
		for(int i=0;i<pasteis.length;i++)
		{
			System.out.println("Dia "+(dias[i])+": "+pasteis[i]);
		}
	}

}
