package aula;

import java.util.Scanner;

public class opcao2 {
	
	Scanner s =  new Scanner(System.in);
	
	public void calcular() {
		
		System.out.println("Digite a velocidade do carro: ");
		float velocidade = s.nextFloat();
	System.out.println("Digite a velocidade máxima da rua: ");
		float velocidadeMax = s.nextFloat();
		
		 float carroVelocidade = velocidade - velocidadeMax;
		 
		 if(carroVelocidade<=10 && carroVelocidade>0) {
			 System.out.println("multa de 50 reais");
		 }else
		 if (carroVelocidade>=11 && carroVelocidade<=30) {
			 System.out.println("multa de 100 reais");
		 }else
		 if(carroVelocidade>=31) {
			 System.out.println("multa de 300 reais");
		 }else {
			 System.out.println("velocidade permetida");
		 }
		 
	}

}
