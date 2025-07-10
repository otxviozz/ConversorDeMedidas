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

            System.out.println("\nDeseja realizar outra conversão? (s/n)");
            String resposta = scan.next();

            if (!resposta.equalsIgnoreCase("s")) {
                break;
            }
        }

        System.out.println("Programa encerrado!");
    }
}