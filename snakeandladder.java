public class snakeandladder{
public static void main(String[] args) {
   int position=0;
   int roll; 
   roll =(int)( Math.floor(Math.random() * 10) % 6);
   int n = position + roll;

   System.out.println("Number on dice:" + n);
}
	}