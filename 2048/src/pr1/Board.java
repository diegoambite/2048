package pr1;

/**
 * 
 * @author Pablo y Diego
 * 
 * Clas which instance store the current state of a 2048 board and provides the methods to manipulate that state
 *
 */
public class Board {

	private Cell[][] board;
	private int boardSize;
	MoveResult move = new MoveResult() ;
	
	
	/**
	 * Constructr of the class Board.
	 * 
	 * @param size saves the dimension of the board
	 */
	
	public Board(int size){
		boardSize = size;
	}
	
	/**
	 * Sets the value of the cell at a given position on the board
	 * 
	 * @param pos position of the cell 
	 * @param value value which will be settled in the cell on the position pos
	 */
	public void setCell(Position pos, int value){
		
	}
	
	/**
	 * executes the displacing and merging of a move in the direction dir
	 * 
	 * @param dir
	 * @return returns the bject containing the results
	 */
	public MoveResult executeMove(Direction dir){
		
		return move;
	}
}
