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
	
	public Cell(int x, int y) {
		pos = new Position(x, y);
	}
	
	public boolean isEmpty() {
		return empty;
	}
}
