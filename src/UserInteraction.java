import java.util.Scanner;

public class UserInteraction {
    private final Scanner scanner = new Scanner(System.in);

    public int[] getPlayerMove() {
        System.out.print("Enter your move (row and column): ");
        while (true) {
            try {
                int row = scanner.nextInt();
                int col = scanner.nextInt();
                return new int[]{row, col};
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter numbers.");
                scanner.next();
            }
        }
    }

    public void close() {
        scanner.close();
    }
}
