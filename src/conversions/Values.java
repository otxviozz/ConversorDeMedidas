package conversions;

import java.util.Scanner;

import model.ConversionData;

public class Values {

    public static double solicitarValor(Scanner scan, String mensagem, ConversionData data) {
        while (true) {
            System.out.print("Digite o valor em " + mensagem + ": ");
            String entrada = scan.nextLine().replace(",", ".");
            data.setEntrada(entrada);

            try {
                double valor = Double.parseDouble(data.getEntrada());
                data.setValor(valor);
                return valor;
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido! Use apenas números (com ponto como separador decimal).");
            }
        }
    }
}
