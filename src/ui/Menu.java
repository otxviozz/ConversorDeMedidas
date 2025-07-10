package ui;

import java.util.Scanner;

public class Menu {

    public static void showMenu() {
        System.out.println("Tabela de conversões: ");
        System.out.println("1. Distância - quilômetros <-> milhas");
        System.out.println("2. Massa - quilograma <-> onça");
        System.out.println("3. Temperatura - Celsius <-> Fahrenheit");
        System.out.println("4. Área - metro quadrado <-> jarda quadrada");
        System.out.print("Escolha uma opção: ");
    }

    public static int readUserChoice(Scanner scanner) {
        int choice = 0;
        try {
            choice = scanner.nextInt();
            if (choice < 1 || choice > 4) {
                throw new IllegalArgumentException("Número inválido! Digite um número entre 1 e 4.\n");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
            return -1;
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
            scanner.nextLine(); // limpa o buffer
            return -1;
        }
        return choice;
    }
}