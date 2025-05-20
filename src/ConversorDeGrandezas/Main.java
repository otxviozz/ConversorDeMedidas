package ConversorDeGrandezas;

import java.util.Scanner;
import conversions.*;

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
                escolha = scan.nextInt();
                if (escolha < 1 || escolha > 4) {
                    throw new IllegalArgumentException("Número inválido! Digite um número entre 1 e 4.\n");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
                continue;
            } catch (Exception e) {
                System.out.println("Erro inesperado: " + e.getMessage());
                scan.nextLine();
                continue;
            }
			
            switch (escolha) {
            case 1:
            	DistanceConverter.convert(scan);
                break;

            case 2:
                MassConverter.convert(scan);
                break;

            case 3:
                TemperatureConverter.convert(scan);
                break;

            case 4:
                AreaConverter.convert(scan);
                break;

            default:
                System.out.println("Categoria inválida!");
        }
		}
	}

}
