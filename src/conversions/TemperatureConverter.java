package conversions;

import java.util.Scanner;

public class TemperatureConverter {
    public static void convert(Scanner scan) {
    	System.out.println("Temperatura escolhida!");
        System.out.println("1. Celsius para Fahrenheit.");
        System.out.println("2. Fahrenheit para Celsius.");

        int conversao = 0;
        while (true) {
            System.out.print("Qual conversão você deseja (1 ou 2): ");
            try {
                conversao = scan.nextInt();
                scan.nextLine();

                if (conversao == 1) {
                    double valor = Values.solicitarValor(scan, "Celsius");
                    double resultado = (valor * 9 / 5) + 32;
                    System.out.printf("%.2f °C em Fahrenheit é igual a %.2f °F.%n", valor, resultado);
                    break;

                } else if (conversao == 2) {
                    double valor = Values.solicitarValor(scan, "Fahrenheit");
                    double resultado = (valor - 32) * 5 / 9;
                    System.out.printf("%.2f °F em Celsius é igual a %.2f °C.%n", valor, resultado);
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