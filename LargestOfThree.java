import java.util.Scanner;

public class LargestOfThree {

    // Code to find the largest of three integers
    public static int findLargest(int num1, int num2, int num3) {
        int largest;
        if (num1 > num2) {
            if (num1 > num3) {
                largest = num1;
            } else {
                largest = num3;
            }
        } else {
            if (num2 > num3) {
                largest = num2;
            } else {
                largest = num3;
            }
        }
        return largest;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter first integer:");
        int firstInt = scanner.nextInt();
        System.out.println("Enter second integer:");
        int secondInt = scanner.nextInt();
        System.out.println("Enter third integer:");
        int thirdInt = scanner.nextInt();


        int largest = findLargest(firstInt, secondInt, thirdInt);
        System.out.println("Largest integer is: " + largest);

        scanner.close();
    }
}
