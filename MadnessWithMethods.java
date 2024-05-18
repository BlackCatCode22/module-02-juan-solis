import java.util.Scanner;

public class MadnessWithMethods {

    //Receives an integer and returns it
    public static int getAnIntFromTheUser(int userInput) {
        return userInput;
    }

    //Compares two integers
    public static int compareTwoInts(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    //The sum of two integers and the sum
    public static int sumTwoInts(int a, int b) {
        return a + b;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first integer:");
        int firstInt = getAnIntFromTheUser(scanner.nextInt());

        System.out.println("Enter the second integer:");
        int secondInt = getAnIntFromTheUser(scanner.nextInt());

        int larger = compareTwoInts(firstInt, secondInt);
        System.out.println("The larger integer is: " + larger);

        int sum = sumTwoInts(firstInt, secondInt);
        System.out.println("The sum of the integers is: " + sum);

        scanner.close();
    }
}
