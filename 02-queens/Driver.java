import java.util.Scanner;
public class Driver{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int i;
	System.out.println("Choose the dimensions of the board");
	i=sc.nextInt();
	while(i>14){
	    System.out.println("Please choose board dimensions smaller than 15 for the sake of time.");
	    i=sc.nextInt();
	}
	Board b = new Board(i);
	b.findboards();
    }
}
