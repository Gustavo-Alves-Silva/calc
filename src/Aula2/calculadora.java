package Aula2;

import java.util.Scanner;

public class calculadora {
	
	Scanner s = new Scanner(System.in);

	public void init() {
		
		System.out.println("informe o calculo que deseja executar");
		
		String calculo = s.nextLine();
		String operacao[] = new String[3];
		
		operacao = calculo.split(" ");
		float valor1 = Float.parseFloat(operacao[0]);
		float valor2 = Float.parseFloat(operacao[2]);
		
		 while ("sair" != calculo) {
		
		switch (operacao[1]) {
		
		case "+": 
			System.out.println(calculo+" = "+this.adicao(valor1, valor2));
			break;
		
		
		case "-": 
			System.out.println(calculo+" = "+this.subtracao(valor1, valor2));
			break;
		
		
		case "*": 
			System.out.println(calculo+" = "+this.multiplicacao(valor1, valor2));
			break;
		
		
		case "/": 
			System.out.println(calculo+" = "+this.divisao(valor1, valor2));
			break;
		}
		
		System.out.println("informe o calculo que deseja executar");
		
		calculo = s.nextLine();
		
		operacao = calculo.split(" ");
		valor1 = Float.parseFloat(operacao[0]);
		valor2 = Float.parseFloat(operacao[2]);
		}
		
	}
	
	public float adicao (float v1, float v2) {
		return v1+v2;
	}
	
	public float subtracao (float v1, float v2) {
		return v1-v2;
	}
	
	public float multiplicacao (float v1, float v2) {
		return v1*v2;
	}
	
	public float divisao (float v1, float v2) {
		return v1/v2;
	}
	
}
