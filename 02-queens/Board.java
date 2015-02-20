import java.util.Arrays;
public class Board{
    private int[] spots;
    private int dimens;
    private int c = 0;
    private String line = new String();
    
    public Board(int dimens){
	this.dimens=dimens;
	spots = new int[dimens];
	for(int i=0; i<dimens; i++){
	    line+="-";
	}
    }
    
    private void printboard(){
	if(c<500){
	    for(int i=0; i<dimens; i++){
		System.out.println(line.substring(0,spots[i])+"X"+line.substring(spots[i]+1));
	    }
	    System.out.println("\n");
	}else if(c==500){
	    System.out.println("First 500 boards printed, still tallying total solutions");
	}
    }
	
    private boolean checkvalid(int n, int i){
	for(int j=0; j<n; j++){
	    if((spots[j]==i)||(spots[j]-j==i-n)||(spots[j]+j==i+n)){
		return false;
	    }
	}
	return true;
    }
    
    private void placespot(int n){
	for(int i=0; i<dimens; i++){
	    if(checkvalid(n,i)){
		spots[n]=i;
		if(n==dimens-1){
		    printboard();
		    c++;
		}else{
		    placespot(n+1);
		}
	    }
	}
    }
    
    public void findboards(){
	placespot(0);
	System.out.println("Total number of solutions: " + c);
    }
}
