public class snakeandladder {
	
	//GLOBAL VARIABLES
	static final int no_play = 0;
	static final int snake = 1;
	static final int ladder = 2;
	static final int max_position = 100;
	static final int min_position = 0;
	static int total_dice_roll = 0;
	
	//function to find new position
	public static int dice_throw(int position) {
		total_dice_roll++;												//counting overall dice rolls
		int dice_num = (int)Math.floor(Math.random() * 10) % 6 + 1 ;
		System.out.println("Number on dice : "+dice_num);
		
		//checking which option we got
		int option_check = (int)Math.floor(Math.random() * 10) % 3;
		
		switch(option_check) {
		case snake:
			System.out.println("You got snake.");
			position -= dice_num;
			break;
		case 2:
			System.out.println("You got ladder.");
			position += dice_num;
			position = dice_throw(position);							//If player gets ladder, plays again
			break;
		default:
			System.out.println("Be on a same position");
			break;
		}
		//reseting position if becomes less than min_position
		if(position < min_position) {
			position = min_position;
		}
		//if goes above 100 then initial position
		if(position > max_position) {
			position -= dice_num;
		}
		
		return position;
	}	
	
	public static void main(String[] args) {
		//constants
		int player1_num = 0;
		int player2_num = 1;
		 
		//variables
		int player1_position = 0;
		int player2_position = 0;
		
		int roll = (int)Math.floor(Math.random() * 10) % 2;
		//throwing a dice
		while(player1_position != max_position && player2_position != max_position) {
			if(roll%2 == player1_num) {
				System.out.println("Player 1 playing.....");
				player1_position = dice_throw(player1_position);
			}
			
			if(roll%2 == player2_num) {
				System.out.println("Player 2 playing.....");
				player2_position = dice_throw(player2_position);
			}
			
			System.out.println("Player 1 position : "+player1_position);
			System.out.println("Player 2 position : "+player2_position);
			System.out.println();
			System.out.println();
			roll++;
		}
		if(player1_position == max_position)	System.out.println("PLAYER 1 WON THE GAME");
		else	System.out.println("PLAYER 2 WON THE GAME");
		System.out.println("Number of dice rolls required to win the game : "+total_dice_roll);
	}
}