package hw34;

import java.util.ArrayList;
import java.util.Random;

public class Mainb {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            numbers.add(i, random.nextInt(100));
        }
        System.out.println(numbers);

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0){
                evenNumbers.add(numbers.get(i));
            }
            else oddNumbers.add(numbers.get(i));
        }
        System.out.println("Even numbers array: " + evenNumbers);
        System.out.println("Odd numbers array: " + oddNumbers);
    }
}
