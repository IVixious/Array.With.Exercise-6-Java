import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        int[] num = new int[10];
        Scanner sc = new Scanner(System.in);

        try {
            for (int i = 0; i < 10; i++) {
                System.out.print("Enter number ");
                num[i] = sc.nextInt();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index entered");
        }

        // Finding the largest number based on user input (10)
        int largest = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > largest) {
                largest = num[i];
            }
        }

        System.out.println("The largest number is: " + largest);

    }
}

