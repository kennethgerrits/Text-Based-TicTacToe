public class Square {
	private char symbol;
	private String position;
	
	public Square(String position) {
		symbol = '.';
		this.position = position;
	}
	public char getSymbol() {
		return symbol;
	}
	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}
	public String getPosition() {
		return position;
	}
}
