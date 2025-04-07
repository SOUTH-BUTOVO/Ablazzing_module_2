package org.javaacademy.homework2.customs;

import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static org.javaacademy.homework2.customs.Weight.*;

public class CustomsInBulgaria {
    private static final String DELIMITER = ";";
    private static final int INDEX_WEIGHT = 1;
    Map<String, Integer> luggageWeight = new HashMap<>();
    Scanner scanner;

    {
        try {
            scanner = new Scanner(Path.of("resources/luggage.csv").toFile());
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public Map<String, Integer> statisticOfWeight() {
        scanner.nextLine();
        while (scanner.hasNext()) {
            String[] luggage = scanner.nextLine().split(DELIMITER);
            int weight = Integer.parseInt(luggage[INDEX_WEIGHT]);
            if (weight >= HEAVY.getWeightLimit()) {
                luggageWeight.put(HEAVY.getName(), luggageWeight.getOrDefault(HEAVY.getName(), 0) + weight);
            } else if (weight >= Weight.AVERAGE.getWeightLimit()) {
                luggageWeight.put(AVERAGE.getName(), luggageWeight.getOrDefault(AVERAGE.getName(), 0) + weight);
            } else {
                luggageWeight.merge(LIGHT.getName(), weight, Integer::sum);
            }
        }
        scanner.close();
        return luggageWeight;
    }
}
