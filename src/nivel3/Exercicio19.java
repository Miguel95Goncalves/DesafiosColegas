package nivel3;

import java.util.Scanner;

public class Exercicio19 {
	public Exercicio19(){
		int num=5;
	
		for(int i=num;i>1;i--) num*=(i-1);
		
		System.out.println("Factorial:"+num);
	}
}
