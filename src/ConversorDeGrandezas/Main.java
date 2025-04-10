package ConversorDeGrandezas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		boolean menu = true;
		
		while(menu == true) {
			System.out.println("Tabela de conversões: ");
			System.out.println("1. Distância - quilômetros <-> milhas");
			System.out.println("2. Massa - quilograma <-> onça");
			System.out.println("3. Temperatura - Celsius <-> Fahrenheit");
			System.out.println("4. Área - metro quadrado <-> jarda quadrada");
			System.out.println("Escolha uma opção: ");
			
			int escolha = 0;
            try {
                escolha = scan.nextInt();  // Lê a escolha do menu
                if (escolha < 1 || escolha > 4) {
                    throw new IllegalArgumentException("Número inválido! Digite um número entre 1 e 4.\n");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
                continue; // Continua o loop caso o erro aconteça
            } catch (Exception e) {
                System.out.println("Erro inesperado: " + e.getMessage());
                scan.nextLine(); // Limpa o buffer de entrada para evitar loop infinito
                continue;
            }
			
            int conversao = 0;
			switch(escolha) {
			case 1:
			System.out.println("Distância escolhida!");
			System.out.println("1. Quilômetros para milhas.");
			System.out.println("2. Milhas para quilômetros.");
			System.out.println("Qual conversão você deseja: ");
			conversao = 0;
            try {
                conversao = scan.nextInt();  // Lê a escolha do menu
                if (conversao < 1 || conversao > 2) {
                    throw new IllegalArgumentException("Escolha inválida! Digite 1 ou 2.\n");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
                continue; // Continua o loop caso o erro aconteça
            } catch (Exception e) {
                System.out.println("Erro inesperado: " + e.getMessage());
                scan.nextLine(); // Limpa o buffer de entrada para evitar loop infinito
                continue;
            }
            if(escolha== 1 && conversao== 1) {
            	System.out.println("Digite o valor de quilômetros: ");
            	double valor = scan.nextInt();
            	double resultado = valor * 0.621371;
            	System.out.printf("%.2f km em milhas é igual a %.2f milhas.%n", valor, resultado);
            }
            if(escolha== 1 && conversao== 2) {
            	System.out.println("Digite o valor de milhas: ");
            	double valor = scan.nextInt();
            	double resultado = valor * 1.60934;
            	System.out.printf("%.2f km em milhas é igual a %.2f milhas.%n", valor, resultado);
            }
            break;
				
			case 2:
				System.out.println("Massa escolhida!");
				System.out.println("1. Quilogramas para onças.");
				System.out.println("2. Onças para quilogramas.");
				System.out.println("Qual conversão você deseja: ");
				conversao = 0;
	            try {
	                conversao = scan.nextInt();  // Lê a escolha do menu
	                if (conversao < 1 || conversao > 2) {
	                    throw new IllegalArgumentException("Escolha inválida! Digite 1 ou 2.\n");
	                }
	            } catch (IllegalArgumentException e) {
	                System.out.println("Erro: " + e.getMessage());
	                continue; // Continua o loop caso o erro aconteça
	            } catch (Exception e) {
	                System.out.println("Erro inesperado: " + e.getMessage());
	                scan.nextLine(); // Limpa o buffer de entrada para evitar loop infinito
	                continue;
	            }
	            if(escolha== 1 && conversao== 1) {
	            	System.out.println("Digite o valor de quilogramas: ");
	            	double valor = scan.nextInt();
	            	double resultado = valor * 35.274;
	            	System.out.printf("%.2f kg em onças é igual a %.2f onças.%n", valor, resultado);
	            }
	            if(escolha== 1 && conversao== 2) {
	            	System.out.println("Digite o valor de milhas: ");
	            	double valor = scan.nextInt();
	            	double resultado = valor * 0.0283495;
	            	System.out.printf("%.2f onças em kg é igual a %.2f kg.%n", valor, resultado);
	            }
	            break;
				
			case 3:
				System.out.println("Temperatura escolhida!");
				System.out.println("1. Celsius para Fahrenheit.");
				System.out.println("2. Fahrenheit para Celsius.");
				System.out.println("Qual conversão você deseja: ");
				conversao = 0;
	            try {
	                conversao = scan.nextInt();  // Lê a escolha do menu
	                if (conversao < 1 || conversao > 2) {
	                    throw new IllegalArgumentException("Escolha inválida! Digite 1 ou 2.\n");
	                }
	            } catch (IllegalArgumentException e) {
	                System.out.println("Erro: " + e.getMessage());
	                continue; // Continua o loop caso o erro aconteça
	            } catch (Exception e) {
	                System.out.println("Erro inesperado: " + e.getMessage());
	                scan.nextLine(); // Limpa o buffer de entrada para evitar loop infinito
	                continue;
	            }
	            if(escolha== 1 && conversao== 1) {
	            	System.out.println("Digite o valor de Celsius: ");
	            	double valor = scan.nextInt();
	            	double resultado = (valor * 9/5) + 32;
	            	System.out.printf("%.2f Celsius em Fahrenheit é igual a %.2f F.%n", valor, resultado);
	            }
	            if(escolha== 1 && conversao== 2) {
	            	System.out.println("Digite o valor de Fahrenheit: ");
	            	double valor = scan.nextInt();
	            	double resultado = (valor - 32) * 5/9;
	            	System.out.printf("%.2f Fahrenheit em Celsius é igual a %.2f C.%n", valor, resultado);
	            }
	            break;
				
			case 4:
				System.out.println("Área escolhida!");
				System.out.println("1. Metro quadrado para jarda quadrada.");
				System.out.println("2. Jarda quadrada para metro quadrado.");
				System.out.println("Qual conversão você deseja: ");
				conversao = 0;
	            try {
	                conversao = scan.nextInt();  // Lê a escolha do menu
	                if (conversao < 1 || conversao > 2) {
	                    throw new IllegalArgumentException("Escolha inválida! Digite 1 ou 2.\n");
	                }
	            } catch (IllegalArgumentException e) {
	                System.out.println("Erro: " + e.getMessage());
	                continue; // Continua o loop caso o erro aconteça
	            } catch (Exception e) {
	                System.out.println("Erro inesperado: " + e.getMessage());
	                scan.nextLine(); // Limpa o buffer de entrada para evitar loop infinito
	                continue;
	            }
	            if(escolha== 1 && conversao== 1) {
	            	System.out.println("Digite o valor de quilogramas: ");
	            	double valor = scan.nextInt();
	            	double resultado = valor * 1.19599;
	            	System.out.printf("%.2f m2 em jardas quadradas é igual a %.2f jardas quadradas.%n", valor, resultado);
	            }
	            if(escolha== 1 && conversao== 2) {
	            	System.out.println("Digite o valor de milhas: ");
	            	double valor = scan.nextInt();
	            	double resultado = valor * 0.836127;
	            	System.out.printf("%.2f jardas quadradas em m2 é igual a %.2f m2.%n", valor, resultado);
	            }
	            break;
			}
		}

	}

}
