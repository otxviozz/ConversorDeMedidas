package conversions;

import java.util.Scanner;

import model.ConversionData;

public class MassConverter {
    public static void convert(Scanner scan) {
    	ConversionData data = new ConversionData();
    	
    	System.out.println("Massa escolhida!");
        System.out.println("1. Quilogramas para onças.");
        System.out.println("2. Onças para quilogramas.");

        int conversao = 0;
        while (true) {
            System.out.print("Qual conversão você deseja (1 ou 2): ");
            try {
                conversao = scan.nextInt();
                scan.nextLine();
                
                data.setConversao(conversao);

                if (data.getConversao() == 1) {
                    double valor = Values.solicitarValor(scan, "quilogramas", data);
                    double resultado = valor * 35.274;
                    System.out.printf("%.2f kg em onças é igual a %.2f onças.%n", valor, resultado);
                    break;

                } else if (data.getConversao() == 2) {
                    double valor = Values.solicitarValor(scan, "onças", data);
                    double resultado = valor * 0.0283495;
                    System.out.printf("%.2f onças em kg é igual a %.2f kg.%n", valor, resultado);
                    break;

                } else {
                    System.out.println("Escolha inválida! Digite 1 ou 2.");
                }

            } catch (Exception e) {
                System.out.println("Entrada inválida! Tente novamente.");
                scan.nextLine();
            }
        }
    }
}