package aula;

import java.util.Scanner;

public class opcao1 {
	
	Scanner s =  new Scanner(System.in);
	
	public void calcular() {
		
		System.out.println("Digite o primeiro número: ");
		float n1 = s.nextFloat();
	System.out.println("Digite o segundo número: ");
		float n2 = s.nextFloat();
	System.out.println("Digite o terceiro número: ");
		float n3 = s.nextFloat();
	
	if(n1 > n2+n3) {
		System.out.println("O primeiro número é o maior que a soma do segundo e terceiro");
	}else if (n1 == n2+n3) {
		System.out.println("O primeiro número é igual a soma do segundo e terceiro");
	}else {
		System.out.println("O primeiro número é o menor que a soma do segundo e terceiro");
	}
	}
}
