package aula;

import java.util.Random;
import java.util.Scanner;

public class MAIN {

	public static void main(String[] args) {
		
		
		Scanner s =  new Scanner(System.in);
		System.out.println("Digite o número de uma opção: "
				+ "\n 0 - Digite 0 para poder sair \n"
				+ " 1 - Ver se o primeiro número é maior "
				+ "\n 2 - calcular multa \n "
				+ "3 -  Calculadora basica \n "
				+ "4 - Listar números de 1000 há 1999 cuja a divisao por 11 dê resto 5"
				+ "\n 5 - Acertar numero sortiado");
		int n = s.nextInt();
		
		while(n!=0){
			
			
			if(n==1) {
					opcao1 Opcao1 = new opcao1();
					Opcao1.calcular();
					System.out.println("Digite o número de uma opção: "
							+ "\n 0 - Digite 0 para poder sair \n"
							+ " 1 - Ver se o primeiro número é maior "
							+ "\n 2 - calcular multa \n "
							+ "3 -  Calculadora basica \n "
							+ "4 - Listar números de 1000 há 1999 cuja a divisao por 11 dê resto 5"
							+ "\n 5 - Acertar numero sortiado");
					n = s.nextInt();
					System.out.println(n);
			}

			if(n==2) {
				
					opcao2 Opcao2 = new opcao2();
					Opcao2.calcular();
					System.out.println("Digite o número de uma opção: "
							+ "\n 0 - Digite 0 para poder sair \n"
							+ " 1 - Ver se o primeiro número é maior "
							+ "\n 2 - calcular multa \n "
							+ "3 -  Calculadora basica \n "
							+ "4 - Listar números de 1000 há 1999 cuja a divisao por 11 dê resto 5"
							+ "\n 5 - Acertar numero sortiado");
					n = s.nextInt();
			}
					 
 
					if(n==3) {
					opcao3 Opcao3 = new opcao3();
					Opcao3.calcular();
				
					System.out.println("Digite o número de uma opção: "
							+ "\n 0 - Digite 0 para poder sair \n"
							+ " 1 - Ver se o primeiro número é maior "
							+ "\n 2 - calcular multa \n "
							+ "3 -  Calculadora basica \n "
							+ "4 - Listar números de 1000 há 1999 cuja a divisao por 11 dê resto 5"
							+ "\n 5 - Acertar numero sortiado");
					n = s.nextInt();
					}
				
 
					if(n==4) {
				opcao4 Opcao4 = new opcao4();
				Opcao4.calcular();
				
				System.out.println("Digite o número de uma opção: "
						+ "\n 0 - Digite 0 para poder sair \n"
						+ " 1 - Ver se o primeiro número é maior "
						+ "\n 2 - calcular multa \n "
						+ "3 -  Calculadora basica \n "
						+ "4 - Listar números de 1000 há 1999 cuja a divisao por 11 dê resto 5"
						+ "\n 5 - Acertar numero sortiado");
				n = s.nextInt();
					}

					if(n==5) {
				opcao5 Opcao5 = new opcao5();
				Opcao5.calcular();
				
				System.out.println("Digite o número de uma opção: "
						+ "\n 0 - Digite 0 para poder sair \n"
						+ " 1 - Ver se o primeiro número é maior "
						+ "\n 2 - calcular multa \n "
						+ "3 -  Calculadora basica \n "
						+ "4 - Listar números de 1000 há 1999 cuja a divisao por 11 dê resto 5"
						+ "\n 5 - Acertar numero sortiado");
				n = s.nextInt();
					}
				
			
	}
		System.out.println("saindo...");

	}}
