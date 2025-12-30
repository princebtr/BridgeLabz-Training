import java.util.Scanner;
public class SnakeAndLadder {

//	use case 2
	public static int rollDice() {
		int move = 1 + (int) (Math.random() * 6);
		return move;
	}
	
//	use case 3
	public static int[] snakeOrLadder() {
		int[] sol = new int[2];
		//checking for snake or ladder or no play 
		sol[0] = 1 + (int) (Math.random() * 3);
		//checking for positions to move
		sol[1] = 1 + (int) (Math.random() * 10);
		return sol;
	}
	
//	use case 4
	public static int checkSum(int points, int dice) {
		if(points+dice > 100) return points;
		if(points+dice < 0) return 0;
		return points+dice;
	}
	
//	use case 5
	public static boolean winCheck(int points) {
		if(points == 100) {
			System.out.println("Player Wins!!!");
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Ladder Game...");
		
//		use case 1
		int points = 0;
		boolean win = false;
		
		while(!win) {
//			use case 2
			int numOnDice = rollDice();
			System.out.println("Number you got is " + numOnDice);
			
//			use case 3
			points = checkSum(points,numOnDice);
			int[] arr = snakeOrLadder();
			if(arr[0] == 1) {
				System.out.println("You got NO PLAY");
			} else if(arr[0] == 2) {
				System.out.println("Yayy you got LADDER...move ahead "+arr[1]+" steps");
			} else {
				System.out.println("Oops you got SNAKE...move behind "+arr[1]+" steps");
			}
			win = winCheck(points);
		}

	}

}
