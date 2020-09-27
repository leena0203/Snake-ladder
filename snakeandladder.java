public class snakeandladder{
public static void main(String[] args) {
   final        int no_play = 0;
		final int snake = 1;
		final int ladder = 2;
                final int max=100;
                final int min= 0;
		 
		int position = 0;
                int dice_rolls = 0;
                while (position != max){

		int roll = (int)Math.floor(Math.random() * 10) % 6 + 1 ;
		System.out.println("Number on dice : "+roll);
                dice_rolls++;
		int option = (int)Math.floor(Math.random() * 10) % 3;
                switch(option){
                  case 0:
                  position = position;
                  break;
                  case 1:
                  if(roll + position <=100) ;
                      position -= roll;
                  
                  break;
                  case 2:
                  if(position - roll >=0) ;
                      position += roll;
                  
                   break;
                  }
                   if(position < min) {
				position = min;
			}
			//if goes above 100 then initial position
			if(position > max) {
				position -= roll;
                        }
                  
                  System.out.println("Current Position: " + position);
                }
      System.out.println("Number of time dice rolls:" +dice_rolls);

}
}