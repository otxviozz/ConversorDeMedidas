package historic;

import model.ConversionData;
import java.util.ArrayList;

public class Historico {
    private ConversionData data;

    public Historico(ConversionData data) {
        this.data = data;
    }

    public void exibirInfo() {
        System.out.println(
            "\nOperação realizada:"
            + "\n- Categoria escolhida: " + categoriaDescricao(data.getChoice())
            + "\n- Tipo de conversão: " + conversaoDescricao(data.getConversao(), data.getChoice())
            + "\n- Valor informado: " + data.getValor()
            + "\n- Resultado da conversão: " + data.getResultado()
        );
    }

    // Exibe todas as operações
    public static void operacoesRealizadas(ArrayList<Historico> historicos) {
        if (historicos == null || historicos.isEmpty()) {
            System.out.println("\nNenhuma operação válida foi realizada.");
            return;
        }
        System.out.println("\n===== Histórico de Operações =====");
        for (Historico h : historicos) {
            h.exibirInfo();
        }
    }

    private String categoriaDescricao(int choice) {
        return switch (choice) {
            case 1 -> "Distância";
            case 2 -> "Massa";
            case 3 -> "Temperatura";
            case 4 -> "Área";
            default -> "Desconhecida";
        };
    }

    private String conversaoDescricao(int conversao, int choice) {
        return switch (choice) {
            case 1 -> conversao == 1 ? "Quilômetros para Milhas" : "Milhas para Quilômetros";
            case 2 -> conversao == 1 ? "Quilogramas para Onças" : "Onças para Quilogramas";
            case 3 -> conversao == 1 ? "Celsius para Fahrenheit" : "Fahrenheit para Celsius";
            case 4 -> conversao == 1 ? "m² para jardas²" : "jardas² para m²";
            default -> "Tipo desconhecido";
        };
    }
}
