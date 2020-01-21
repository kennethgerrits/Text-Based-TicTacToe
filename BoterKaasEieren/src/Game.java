import java.util.Scanner;

public class Game {
	Board b = new Board();
	Scanner sc = new Scanner(System.in);

	public void doMove(int player) {
		b.printBoard();
		System.out.println("Player " + player + " enter your move here:");
		String str1 = sc.nextLine();
		while (b.getSquare(str1) || b.notValidSquare(str1)) {
			System.out.println("Invalid move, please enter another.");
			str1 = sc.nextLine();
		}
		if (player == 1) {
			b.setSymbol('X', str1);
		} else {
			b.setSymbol('O', str1);
		}
	}

	public void play() {
		int moves = 0;
		int i = 1;
		while (moves < 9 && (!((b.getWinnaar()) != '.'))) {
			if (i == 3) {
				i = 1;
			}
			doMove((moves % 2) + i);
			i++;
		}
		if (b.getWinnaar() == '.') {
			System.out.println("Gelijkspel!");
		} else if (b.getWinnaar() == 'X') {
			System.out.println("X heeft gewonnen!");
		} else if (b.getWinnaar() == 'O') {
			System.out.println("O heeft gewonnen!");
		}
	}
}
