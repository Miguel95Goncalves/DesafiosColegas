package nivel3;

import java.util.Random;

public class Exercicio3 {

	public Exercicio3() {
		// TODO Auto-generated constructor stub
		
		int[] vetor = new int[20];
		int[] contadores = new int[9];
		
		Random rand = new Random();
		int numAleatorio = rand.nextInt(8)+1;
		
		for(int i=0;i<20;i++)
		{
			numAleatorio = rand.nextInt(8)+1;
			
			if(numAleatorio==1) contadores[0]++;
			if(numAleatorio==2) contadores[1]++;
			if(numAleatorio==3) contadores[2]++;
			if(numAleatorio==4) contadores[3]++;
			if(numAleatorio==5) contadores[4]++;
			if(numAleatorio==6) contadores[5]++;
			if(numAleatorio==7) contadores[6]++;
			if(numAleatorio==8) contadores[7]++;
			if(numAleatorio==9) contadores[8]++;
			
			vetor[i] = numAleatorio;
		}
		
		
		for(int i=0;i<9;i++)
		{
			System.out.println("Repetições de "+(i+1)+": "+contadores[i]+"x");
		}
		
	}

}
