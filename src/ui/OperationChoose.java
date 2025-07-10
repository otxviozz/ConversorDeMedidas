package ui;

import java.util.Scanner;

import conversions.AreaConverter;
import conversions.DistanceConverter;
import conversions.MassConverter;
import conversions.TemperatureConverter;
import model.ConversionData;

public class OperationChoose {

    public void executeOperation(ConversionData data, Scanner scan) {
        switch (data.getChoice()) {
            case 1:
                DistanceConverter.convert(scan, data);
                break;
            case 2:
                MassConverter.convert(scan, data);
                break;
            case 3:
                TemperatureConverter.convert(scan, data);
                break;
            case 4:
                AreaConverter.convert(scan, data);
                break;
            default:
                System.out.println("Categoria inválida!");
                break;
        }
    }
}