/*
LANG: JAVA
TASK: makelake
*/
import java.io.*;
import java.util.*;

public class makelake{
    public static int[][] levels;

    public static void stomp(int R_s, int C_s, int D_s){
        int tallest = levels[R_s][C_s];

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                tallest = Math.max(tallest, levels[R_s+i-1][C_s+j-1]);
            }
        }

        int newtall = tallest - D_s;

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                levels[R_s+i-1][C_s+j-1] = Math.min(newtall, levels[R_s+i-1][C_s+j-1]);
            }
        }
    }

    public static void main (String [] args) throws IOException {
	BufferedReader f = new BufferedReader(new FileReader("makelake.in"));
	PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("makelake.out")));
	String s = f.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        levels = new int[R][C];

	for(int i=0; i<R; i++){
            s=f.readLine();
	    st = new StringTokenizer(s);
            for(int j=0; j<C; j++){
                levels[i][j] = Integer.parseInt(st.nextToken());
            }
	}
        
        for(int i=0; i<N; i++){
            s=f.readLine();
	    st = new StringTokenizer(s);
            int R_s = Integer.parseInt(st.nextToken());
            int C_s = Integer.parseInt(st.nextToken());
            int D_s = Integer.parseInt(st.nextToken());
            stomp(R_s, C_s, D_s);
	}
        
        int c=0;
        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++){
                c+=Math.max(E-levels[i][j],0);
            }
        }

	out.println(c*72*72);                         // output result
	out.close();                                  // close the output file
	System.exit(0);                               // don't omit this!
    }
}
