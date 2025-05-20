package conversions;

import java.util.Scanner;

public class DistanceConverter {
    public static void convert(Scanner scan) {
        System.out.println("Distância escolhida!");
        System.out.println("1. Quilômetros para milhas.");
        System.out.println("2. Milhas para quilômetros.");

        int conversao = 0;
        while (true) {
            System.out.print("Qual conversão você deseja (1 ou 2): ");
            try {
                conversao = scan.nextInt();
                scan.nextLine();

                if (conversao == 1) {
                    double valor = Values.solicitarValor(scan, "quilômetros");
                    double resultado = valor * 0.621371;
                    System.out.printf("%.2f km em milhas é igual a %.2f milhas.%n", valor, resultado);
                    break;

                } else if (conversao == 2) {
                    double valor = Values.solicitarValor(scan, "milhas");
                    double resultado = valor * 1.60934;
                    System.out.printf("%.2f milhas em km é igual a %.2f km.%n", valor, resultado);
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
