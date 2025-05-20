package conversions;

import java.util.Scanner;

public class AreaConverter {
    public static void convert(Scanner scan) {
    	System.out.println("Área escolhida!");
        System.out.println("1. Metro quadrado para jarda quadrada.");
        System.out.println("2. Jarda quadrada para metro quadrado.");

        int conversao = 0;
        while (true) {
            System.out.print("Qual conversão você deseja (1 ou 2): ");
            try {
                conversao = scan.nextInt();
                scan.nextLine();

                if (conversao == 1) {
                    double valor = Values.solicitarValor(scan, "m²");
                    double resultado = valor * 1.19599;
                    System.out.printf("%.2f m² em jardas² é igual a %.2f jardas².%n", valor, resultado);
                    break;

                } else if (conversao == 2) {
                    double valor = Values.solicitarValor(scan, "jarda²");
                    double resultado = valor * 0.836127;
                    System.out.printf("%.2f jardas² em m² é igual a %.2f m².%n", valor, resultado);
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
