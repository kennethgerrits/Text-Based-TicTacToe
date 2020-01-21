
public class Board {
	Square[] squares;

	public Board() {
		squares = new Square[9];

		squares[0] = new Square("A1");
		squares[1] = new Square("B1");
		squares[2] = new Square("C1");
		squares[3] = new Square("A2");
		squares[4] = new Square("B2");
		squares[5] = new Square("C2");
		squares[6] = new Square("A3");
		squares[7] = new Square("B3");
		squares[8] = new Square("C3");
	}

	public void printBoard() {
		System.out.println("  A B C");
		for (int row = 0; row < 3; row++) {
			System.out.print("" + (row + 1));
			for (int col = 0; col < 3; col++) {
				int index = row * 3 + col;
				System.out.print(" " + squares[index].getSymbol());
			}
			System.out.println("");
		}
	}

	public void setSymbol(char symbol, String place) {
		place = place.toUpperCase();
		for (int j = 0; j < squares.length; j++) {
			if (squares[j].getPosition().equals(place) && squares[j].getSymbol() == '.') {
				squares[j].setSymbol(symbol);
			}
		}
	}

	public boolean getSquare(String place) {
		place = place.toUpperCase();
		for (int i = 0; i < squares.length; i++) {
			if (squares[i].getSymbol() != '.' && squares[i].getPosition().equals(place)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean notValidSquare(String place) {
		place = place.toUpperCase();
		for (int j = 0; j < squares.length; j++) {
			if (squares[j].getPosition().equals(place)) {
				return false;
			}
		}
		return true;
	}
		
	public char getWinnaar() {
		//checks a1 --> c1
		if(squares[0].getSymbol() == squares[1].getSymbol() && squares[0].getSymbol() == squares[2].getSymbol() 
				&& squares[0].getSymbol() != '.') {
			return squares[0].getSymbol();
		}
		
		//checks a2 --> c
		
		if(squares[3].getSymbol() == squares[4].getSymbol() && squares[3].getSymbol() == squares[5].getSymbol() 
				&& squares[3].getSymbol() != '.') {
			return squares[3].getSymbol();
		}
		//checks a3 --> c3
		if(squares[6].getSymbol() == squares[7].getSymbol() && squares[7].getSymbol() == squares[8].getSymbol() 
				&& squares[6].getSymbol() != '.') {
			return squares[6].getSymbol();
		}
		
		//checks a1 --> a3
		if(squares[0].getSymbol() == squares[3].getSymbol() && squares[0].getSymbol() == squares[6].getSymbol() 
				&& squares[0].getSymbol() != '.') {
			return squares[0].getSymbol();
		}
		
		//checks b1 --> b3
		if(squares[1].getSymbol() == squares[4].getSymbol() && squares[1].getSymbol() == squares[5].getSymbol() 
				&& squares[1].getSymbol() != '.') {
			return squares[1].getSymbol();
		}
		
		//checks c1 --> c3
		if(squares[2].getSymbol() == squares[5].getSymbol() && squares[2].getSymbol() == squares[6].getSymbol() 
				&& squares[2].getSymbol() != '.') {
			return squares[2].getSymbol();
		}
		
		//checks a1 --> c3
		if(squares[0].getSymbol() == squares[4].getSymbol() && squares[0].getSymbol() == squares[8].getSymbol() 
				&& squares[0].getSymbol() != '.') {
			return squares[0].getSymbol();
		}
		
		//checks c1 --> a3
		if(squares[2].getSymbol() == squares[4].getSymbol() && squares[2].getSymbol() == squares[6].getSymbol() 
				&& squares[2].getSymbol() != '.') {
			System.out.println(squares[2].getSymbol() + " heeft gewonnen!");
			return squares[2].getSymbol();
		}
		
		return '.';
	}
}