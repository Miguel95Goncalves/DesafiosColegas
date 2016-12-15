package nivel2;

import java.util.Scanner;

public class Exercicio6 {

	public Exercicio6() {
		// TODO Auto-generated constructor stub
		
		int num1, num2;
		
		do
		{
			System.out.println("Introduza o primeiro número");
			num1 = (new Scanner(System.in)).nextInt();
			
			System.out.println("Introduza o segundo número");
			num2 = (new Scanner(System.in)).nextInt();
		}while(num1==num2);
		
		if(num1<num2)
		{
			for(int i=num1;i<=num2;i++)
			{
				if (i%2==0)
				{
					System.out.println(i);
				}
			}
		}
		else
		{
			for(int i=num1;i>=num2;i--)
			{
				if (i%2==0)
				{
					System.out.println(i);
				}
			}
		}
		
	}

}
