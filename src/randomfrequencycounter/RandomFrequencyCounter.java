/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package randomfrequencycounter;

import java.security.SecureRandom;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RandomFrequencyCounter {

    public static void main(String[] args) {

        SecureRandom randomNumbers = new SecureRandom();
        int[] dataSet = {100, 1000, 100000, 1000000};

        for (int size : dataSet) {
            System.out.println("Data set size: " + size);
            System.out.printf("%-10s%-10s%n", "Number", "Frequency");

            randomNumbers.ints(size, 1, 11)
                    .boxed()
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                    .forEach((number, frequency) -> System.out.printf("%-10d%-10d%n", number, frequency));
            
            System.out.println();
        }
    }
}

