/*
LANG: JAVA
TASK: ctravel
*/
import java.io.*;
import java.util.*;

public class ctravel{
    public static void main (String [] args) throws IOException {
	BufferedReader f = new BufferedReader(new FileReader("ctravel.in"));
	PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ctravel.out")));
	
	String s = f.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
	ArrayList<Integer[]> trees = new ArrayList<Integer[]>();
	
	for(int i=0; i<N; i++){
            s=f.readLine();
	    for(int j=0; j<M; j++){
		if(f.charAt(j)=='*'){
		    int[] coors = new int[2];
		    coors[0]=i;
		    coors[1]=j;
		    a.add(coors);
		}
	    }
	}
	
	/*int c=0;
	String s = f.readLine();
	while(s!=null){
	    StringTokenizer st = new StringTokenizer(s);
	    int i1 = Integer.parseInt(st.nextToken());    // first integer
	    int i2 = Integer.parseInt(st.nextToken());    // second integer
	    c+=i1+i2;
	    s=f.readLine();
	}

	out.println(c);                               // output result
	*/
	
	out.close();                                  // close the output file
	System.exit(0);                               // don't omit this!
    }
}
