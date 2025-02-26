import java.util.Scanner;

public class OppsBoolean3no {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter Second Number:");
        int num2 = scanner.nextInt();

        System.out.println("Enter Third Number:");
        int num3 = scanner.nextInt();

        boolean result = (num1 >= num2 + num3) || (num2 >= num1 + num3) || (num3 >= num1 + num2);

        System.out.println(result);
        scanner.close();
    }
}
