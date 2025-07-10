package ui;

import java.util.Scanner;
import conversions.*;

public class OperationChoose {

    public void executeOperation(int choice, Scanner scan) {
        switch (choice) {
            case 1:
                DistanceConverter.convert(scan);
                break;
            case 2:
                MassConverter.convert(scan);
                break;
            case 3:
                TemperatureConverter.convert(scan);
                break;
            case 4:
                AreaConverter.convert(scan);
                break;
            default:
                System.out.println("Categoria inválida!");
                break;
        }
    }
}