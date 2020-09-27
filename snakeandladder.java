public class snakeandladder{
public static void main(String[] args) {
   final        int no_play = 0;
		final int snake = 1;
		final int ladder = 2;
		 
		int position = 0;
                
                
		int roll = (int)Math.floor(Math.random() * 10) % 6 + 1 ;
		System.out.println("Number on dice : "+roll);
		int option = (int)Math.floor(Math.random() * 10) % 3;
                
		if(option == no_play)
			System.out.println("Stay on same position");
		else if(option == ladder)
                        
			System.out.println(" Climb ladder, New position: "+roll);
		else 
                         
			System.out.println("Snake, New Position "+roll);
}
	}