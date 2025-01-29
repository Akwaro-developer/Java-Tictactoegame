
//


//

import java.util.Scanner;

class HumanPlayer extends Player {
    private final Scanner scanner = new Scanner(System.in);

    public HumanPlayer(String representation) {
        super(representation);
    }

    @Override
    public int[] getMove(int size, Cell[] board) {
        int row,col;
        while(true) {
            try{
                System.out.print("Enter your move (row and column): ");

            //This is to read the user input
                row = scanner.nextInt();

                col = scanner.nextInt();
                //To validate the user input
                if(row >= 0 && row < size && col >= 0 && col < size) {
                    int index = row * size + col;
                    if (board[index] != null) {
                        return new int[]{row, col};
                    } else {
                        System.out.println("That's not a valid move");
                    }
                }else{
             System.out.println("That's not a valid move");
                }
            }catch(Exception e){
                System.out.println("That's not a valid move");
                scanner.next();
            }

        }

    }

    @Override
    public int[] getMove(TicTacToe game) {
        return new int[0];
    }
    public void closeScanner() {
        scanner.close();
    }
}

