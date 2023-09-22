import java.util.Scanner;

public class trainingSoma {
    public static String calcSumWithExpression(int number) {
        int Sum = 0;
        StringBuilder expressao = new StringBuilder();

        for (int i = 1; i <= number; i++) {
            Sum += i;
            if (i > 1) {
                expressao.append(" + ");
            }
            expressao.append(i);
        }

        return Sum + " (" + expressao.toString() + ")";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        do {
            System.out.print("Write a positive number: ");
            number = scanner.nextInt();

            if (number <= 0) {
                System.out.println("The number need be positive");
            }
        } while (number <= 0);

        String result = calcSumWithExpression(number);
        System.out.println("The sum of 1 to " + number + " is: " + result);

        scanner.close();
    }
}