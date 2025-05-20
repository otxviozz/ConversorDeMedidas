package conversions;

import java.util.Scanner;

public class Values {
	public static double solicitarValor(Scanner scan, String mensagem) {
        double valor = 0;
        while (true) {
        	System.out.print("Digite o valor em " + mensagem + ": ");
            String entrada = scan.nextLine().replace(",", ".");
            try {
                valor = Double.parseDouble(entrada);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido! Use apenas números (com ponto como separador decimal).");
            }
        }
        return valor;
    }
}
