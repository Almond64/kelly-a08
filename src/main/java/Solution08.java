import java.util.Scanner;

public class Solution08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many people? ");
        int numPeople = input.nextInt();
        System.out.println("How many pizzas do you have? ");
        int numPizzas = input.nextInt();
        System.out.println("How many slices pre pizza? ");
        int numSlices = input.nextInt();
        System.out.printf("%d people with %d pizzas (%d slices)\n", numPeople, numPizzas, numSlices*numPizzas);
        //Divide the number of slices by the number of people
        int slices_per_person = (numSlices*numPizzas) / numPeople;
        System.out.printf("Each person gets %d pieces of pizza.\n", slices_per_person);
        //Number of leftover slices equals numSlices mod numPeople
        int leftover_slices = (numSlices*numPizzas) % numPeople;
        System.out.printf("There are %d leftover pieces.\n", leftover_slices);
    }
}
