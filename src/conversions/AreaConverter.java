package conversions;

import java.util.Scanner;

import model.ConversionData;

public class AreaConverter {
    public static void convert(Scanner scan) {
        ConversionData data = new ConversionData();

        System.out.println("Área escolhida!");
        System.out.println("1. Metro quadrado para jarda quadrada.");
        System.out.println("2. Jarda quadrada para metro quadrado.");

        while (true) {
            System.out.print("Qual conversão você deseja (1 ou 2): ");
            try {
                int conversao = scan.nextInt();
                scan.nextLine();

                data.setConversao(conversao);

                if (data.getConversao() == 1) {
                    double valor = Values.solicitarValor(scan, "m²", data);
                    double resultado = valor * 1.19599;
                    data.setResultado(resultado);
                    System.out.printf("%.2f m² em jardas² é igual a %.2f jardas².%n", data.getValor(), data.getResultado());
                    break;

                } else if (data.getConversao() == 2) {
                    double valor = Values.solicitarValor(scan, "jarda²", data);
                    double resultado = valor * 0.836127;
                    data.setResultado(resultado);
                    System.out.printf("%.2f jardas² em m² é igual a %.2f m².%n", data.getValor(), data.getResultado());
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