package conversions;

import java.util.Scanner;

import model.ConversionData;

public class TemperatureConverter {
    public static void convert(Scanner scan) {
    	ConversionData data = new ConversionData();
    	
    	System.out.println("Temperatura escolhida!");
        System.out.println("1. Celsius para Fahrenheit.");
        System.out.println("2. Fahrenheit para Celsius.");

        int conversao = 0;
        while (true) {
            System.out.print("Qual conversão você deseja (1 ou 2): ");
            try {
                conversao = scan.nextInt();
                scan.nextLine();
                
                data.setConversao(conversao);

                if (data.getConversao() == 1) {
                    double valor = Values.solicitarValor(scan, "Celsius", data);
                    double resultado = (valor * 9 / 5) + 32;
                    data.setResultado(resultado);
                    System.out.printf("%.2f °C em Fahrenheit é igual a %.2f °F.%n", data.getValor(), data.getResultado());
                    break;

                } else if (data.getConversao() == 2) {
                    double valor = Values.solicitarValor(scan, "Fahrenheit", data);
                    double resultado = (valor - 32) * 5 / 9;
                    data.setResultado(resultado);
                    System.out.printf("%.2f °F em Celsius é igual a %.2f °C.%n", data.getValor(), data.getResultado());
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