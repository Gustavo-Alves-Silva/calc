package aula;

import java.util.Random;
import java.util.Scanner;

public class opcao5 {
	
	Scanner s =  new Scanner(System.in);
	
	public void calcular() {
		Random rnd = new Random();
		int sortiado = rnd.nextInt(100);
		
		System.out.println("Digite o número sortiado: ");
		int escolhido = s.nextInt();
		
		while (sortiado != escolhido) {

			if(escolhido > sortiado) {
				System.out.println("O número digitado é maior que o sortiado!");
			}else if(escolhido<sortiado) {
				System.out.println("O número digitado é menor que o sortiado!");
			}
			
			System.out.println("Digite o número sortiado: ");
			escolhido = s.nextInt();
			
		}
		
		System.out.println("Parabéns acertou o número");
		
	}

}
