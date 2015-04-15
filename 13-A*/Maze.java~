import java.io.*;
import java.util.*;

public class Maze {
    private char[][] board;
    private int maxX;
    private int maxY;
    private myQueue<int[]> frontier;
    
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
        try {
            Scanner sc = new Scanner(new File("maze.dat"));
            int j=0;
            while (sc.hasNext()){
                String line = sc.nextLine();
                for (int i=0;i<maxX;i++){
                    board[i][j] = line.charAt(i);
                }
                j++;
            }
        }catch (Exception e){}
        frontier = new myQueue<int[]>();
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

    public void solve(){
        while(!solved){
            Node<int[]> n = frontier.dequeue();
            int[] coors = n.getData();
            int x = coors[0];
            int y = coors[1];

            if (board[x][y]==exit){
                Node<int[]> X = n;
                while(X!=null){
                    int[] Xcoors = X.getData();
                    int Xx = Xcoors[0];
                    int Xy = Xcoors[1];
                    board[Xx][Xy] = way;
                    X = X.getSeed();
                }
                solved = true;
            }
            
            if (board[x+1][y]==path || board[x+1][y]==exit){
                if(board[x+1][y]==path) board[x+1][y]=me;
                int[] data = {x+1,y};
                Node<int[]> add = new Node<int[]>(n,data);
                frontier.enqueue(add);
            }
            if (board[x-1][y]==path || board[x-1][y]==exit){
                if(board[x-1][y]==path) board[x-1][y]=me;
                int[] data = {x-1,y};
                Node<int[]> add = new Node<int[]>(n,data);
                frontier.enqueue(add);
            }
            if (board[x][y+1]==path || board[x][y+1]==exit){
                if(board[x][y+1]==path) board[x][y+1]=me;
                int[] data = {x,y+1};
                Node<int[]> add = new Node<int[]>(n,data);
                frontier.enqueue(add);
            }
            if (board[x][y-1]==path || board[x][y-1]==exit){
                if(board[x][y-1]==path) board[x][y-1]=me;
                int[] data = {x,y-1};
                Node<int[]> add = new Node<int[]>(n,data);
                frontier.enqueue(add);
            }
            
            delay(50);
            if(board[x][y]!=way) board[x][y]=visited;
            System.out.println(this);
        }
    }
    
    public void start(){
        int[] st = {1,1};
        board[1][1]=me;
        Node<int[]> n = new Node<int[]>(st);
        frontier.enqueue(n);
        solve();
    }
}
