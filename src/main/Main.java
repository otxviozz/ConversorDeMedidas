package main;

import java.util.Scanner;

import ui.Menu;
import ui.OperationChoose;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        OperationChoose operationChoose = new OperationChoose();

        while (true) {
            Menu.showMenu();
            int userChoice = Menu.readUserChoice(scan);

            if (userChoice == -1) {
                continue;
            }

            operationChoose.executeOperation(userChoice, scan);

            String resposta;

            while (true) {
                System.out.println("\nDeseja realizar outra conversão? (s/n)");
                resposta = scan.next().trim().toLowerCase();

                if (resposta.equals("s") || resposta.equals("n")) {
                    break;
                } else {
                    System.out.println("Entrada inválida! Digite apenas 's' para sim ou 'n' para não.");
                }
            }

            if (resposta.equals("n")) {
                break;
            }
        }

        System.out.println("Programa encerrado!");
    }
}