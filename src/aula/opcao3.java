package aula;

import java.util.Scanner;

public class opcao3 {

	Scanner s =  new Scanner(System.in);
	
	public void calcular() {
		System.out.println("Digite o primeiro número: ");
		float valor1 = s.nextFloat();
	System.out.println("Digite o segundo número: ");
		float valor2 = s.nextFloat();
	System.out.println("Digite qual opereção queira fazer: \n  1 - soma \n  2 - subtracao \n  3 - divisão \n  4 - multiplicação");
		int opcao = s.nextInt();
	
	switch(opcao) {
	
		case 1:
			float soma = valor1+valor2;
			System.out.println("a soma deu: "+soma);
			break;
				
		case 2:
			float subtracao = valor1-valor2;
			System.out.println("a subtracao deu: "+subtracao);
			break;
			
		case 3:
			float divisao = valor1/valor2;
			System.out.println("a subtracao deu: "+divisao);
			break;
			
		case 4:
			float multiplicao = valor1*valor2;
			System.out.println("a subtracao deu: "+multiplicao);
			break;
			
		}
	}
	
}
