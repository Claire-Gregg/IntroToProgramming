import java.util.Scanner;

public class IntegerMultiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inputInteger;
        do {
            System.out.print("Supply a positive integer: ");
            inputInteger = input.nextInt();
            if (inputInteger <= 0) {
                System.out.print("That is not a positive integer.");
            }
        } while (inputInteger <= 0);
        if (inputInteger > 0) {
            System.out.print("Supply a limit: ");
            int inputLimit = input.nextInt();
            int multiple = 0;
            System.out.printf("The multiples of %d (up to %d) are ", inputInteger, inputLimit);
            int count = 0;
            while (multiple <= inputLimit){
                if (count == 0)
                    System.out.print(multiple);
                else
                    System.out.print(", " + multiple);

                count++;
                multiple += inputInteger;
            }
            System.out.print(".");
        }
    }
}
