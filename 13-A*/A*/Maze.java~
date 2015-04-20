import java.io.*;
import java.util.*;

public class Maze {
    private char[][] board;
    private int[] endCoors;
    private int maxX;
    private int maxY;
    private myQueue<coors> frontier;
    
    private char path='#';
    private char wall=' ';
    private char me='m';
    private char exit='$';
    private char visited = '.';
    private char way='X';
    private boolean solved = false;
    
    public void delay(int n){
        try{
            Thread.sleep(n);
        } catch (Exception e) {}
    }
    
    public Maze(){
        maxX=40;
        maxY=20;
        board = new char[maxX][maxY];
        endCoors = new int[2];
        try {
            Scanner sc = new Scanner(new File("maze.dat"));
            int j=0;
            while (sc.hasNext()){
                String line = sc.nextLine();
                for (int i=0;i<maxX;i++){
                    board[i][j] = line.charAt(i);
		    if(line.charAt(i)=='$'){
			endCoors[0] = i;
			endCoors[1] = j;
                        System.out.println("WOOOO");
		    }
                }
                j++;
            }
        }catch (Exception e){}
        frontier = new myQueue<coors>();
    }
    
    public String toString(){
        String s = "[2J\n";
        for (int y=0;y<maxY;y++){
            for (int x=0;x<maxX;x++){
                s = s +board[x][y];
            }
            s=s+"\n";
        }
        return s;
    }

    public int getPriority(coors c){
	return Math.abs(endCoors[0]-c.getX())+Math.abs(endCoors[1]-c.getY());
    }

    public void solve(){
        while(!solved){
            Node<coors> n = frontier.dequeue();
            coors c = n.getData();
            int x = c.getX();
            int y = c.getY();

            if (board[x][y]==exit){
                Node<coors> X = n;
                while(X!=null){
                    coors Xcoors = X.getData();
                    int Xx = Xcoors.getX();
                    int Xy = Xcoors.getY();
                    board[Xx][Xy] = way;
                    X = X.getSeed();
                }
                solved = true;
            }
            
            if (board[x+1][y]==path || board[x+1][y]==exit){
                if(board[x+1][y]==path) board[x+1][y]=me;
                coors data = new coors(x+1,y);
		int p = getPriority(data);
                Node<coors> add = new Node<coors>(n,data,p);
                frontier.enqueue(add);
            }
            if (board[x-1][y]==path || board[x-1][y]==exit){
                if(board[x-1][y]==path) board[x-1][y]=me;
                coors data = new coors(x-1,y);
		int p = getPriority(data);
                Node<coors> add = new Node<coors>(n,data,p);
                frontier.enqueue(add);
            }
            if (board[x][y+1]==path || board[x][y+1]==exit){
                if(board[x][y+1]==path) board[x][y+1]=me;
                coors data = new coors(x,y+1);
		int p = getPriority(data);
                Node<coors> add = new Node<coors>(n,data,p);
                frontier.enqueue(add);
            }
            if (board[x][y-1]==path || board[x][y-1]==exit){
                if(board[x][y-1]==path) board[x][y-1]=me;
                coors data = new coors(x,y-1);
		int p = getPriority(data);
                Node<coors> add = new Node<coors>(n,data,p);
                frontier.enqueue(add);
            }
            
            delay(50);
            if(board[x][y]!=way) board[x][y]=visited;
            System.out.println(this);
        }
    }
    
    public void start(){
        coors st = new coors(1,1);
        board[1][1]=me;
        System.out.println(endCoors[0]);
        Node<coors> n = new Node<coors>(st,getPriority(st));
        frontier.enqueue(n);
        solve();
    }
}
