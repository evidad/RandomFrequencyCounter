/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package randomfrequencycounter;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 *
 * @author errol
 */
public class RandomFrequencyCounter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        SecureRandom randomNumbers = new SecureRandom();

        int[] dataSet = {100, 1000, 100000, 1000000};

        for (int size : dataSet) {
            System.out.println("Data set size: " + size);
            Integer[] randomArray = randomNumbers.ints(size, 1, 11)
                    .boxed()
                    .toArray(Integer[]::new);

            IntStream.rangeClosed(1, 10).forEach(num -> {
                long count = Arrays.stream(randomArray)
                        .filter(value -> value == num)
                        .count();

                System.out.println("Frequency of " + num + ": " + count);
            });
        }
    }
}
