package nivel3;

import java.util.Scanner;

public class Exercicio10 {

	public Exercicio10() {
		// TODO Auto-generated constructor stub
		
		int num1,num2;
		char opc;
		
		do
		{
			System.out.println("Intorduza o primeiro valor");
			num1 = (new Scanner(System.in)).nextInt();
			
			System.out.println("Insira uma operação ('+','-','*','/' ou '0' para sair)");
			opc = (new Scanner(System.in)).next().charAt(0);
			
			System.out.println("Intorduza o segundo valor");
			num2 = (new Scanner(System.in)).nextInt();
			
			switch(opc)
			{
				case '+':
					System.out.println("Resultado="+(num1+num2));
			    break;
				case '-':
					System.out.println("Resultado="+(num1-num2));
			    break;
				case '*':
					System.out.println("Resultado="+(num1*num2));
			    break;
				case '/':
					System.out.println("Resultado="+(num1/num2));
			    break;
				case '0':
					System.out.println("Sair!");
			    break;
			}
		}while(opc!='0');
		
	}

}
