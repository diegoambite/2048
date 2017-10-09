/**
 * 
 */
package pr1;

/**
 * @author Pablo Vazquez & Diego Ambite
 *
 */
public class Cell {
	
	private Position pos;
	private int value = 0;
	private boolean empty = true;
	private boolean merges = false;
	
	/**
	 * Constructor of the class Cell
	 * 
	 * @param x, reperesents the X position of the cell.
	 * @param y, reperesents the Y position of the cell.
	 */
	public Cell(int x, int y) {
		pos = new Position(x, y);
	}
	
	/**
	 * Checks whether or not a cell is empty
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return empty;
	}
	
	/**
	 * Checks whether a merge is allowed betweena cell and the neighbour cell provided as argumet 
	 * if it result to merge, implements the merges returning a boolean value to indicate if the merge took place succesfully. 
	 * 
	 * @param neighbour
	 * @return
	 */
	public boolean doMerge(Cell neighbour){
		
		return merges;
	}
}
