//creates an algorithm to navigate a 2d grid. Currently constrained to squares and rectangular shapes
public class FlightAlgortithm2D {
	public static void main(String[] args){
		int x = 4;
		int y = 7;
		
		int[][] grid = createArray(x,y);
		printGrid(grid);
		System.out.println();
		
		navigate(grid);
		System.out.println();
		
		printGrid(grid);
	}
	
	//this simply takes an in put of an x and y boundary and creates an array
	//currently this is an array of ints filled with 0's
	//if a cell is zero it means it hasn't been entered
	public static int[][] createArray(int x, int y){
		//this flips the x and y in the actual grid so that it appears like an x and y grid
		int[][] grid = new int[y][x];
		
		return grid;
	}
	
	//this goes up and down the grid changing 0's to 1's indicating it has been visited
	public static void navigate(int[][] grid){
		boolean forward = true;
		for (int i = 0; i < grid.length; i++){
			if (forward){
				for (int j = 0; j < grid[i].length; j++){
					grid[i][j] = 1;
					printGrid(grid);
					System.out.println();
				}
				forward = false;
			}
			else if (!forward){
				for (int j = grid[i].length -1; j >= 0; j--){
					grid[i][j] = 1;
					printGrid(grid);
					System.out.println();
				}
				forward = true;
			}
		}
	}
	
	public static void printGrid(int[][] grid){
		for (int i = 0; i < grid.length; i++){
			for (int j = 0; j < grid[i].length; j++){
				System.out.print(grid[i][j]+" ");
			}
			System.out.println();
		}
	}
}
