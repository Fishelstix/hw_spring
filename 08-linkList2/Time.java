import java.io.*;
import java.util.*;

public class Time {
    public static void main(String[] args) {
        Random r = new Random();
        long aStart, aEnd, myStart, myEnd, lStart, lEnd;

	ArrayList<Integer> aL = new ArrayList<Integer>();
        LList myL = new LList();
        List<Integer> lL = new LinkedList<Integer>();

        for(int i = 0; i < 100000; i++){
	    aL.add(r.nextInt(1000));
            myL.add(r.nextInt(1000));
            lL.add(r.nextInt(1000));
        }
	
	aStart = System.currentTimeMillis();

        int aSum = 0;
        for (int i = 0; i < 10000; i++){
            aSum += aL.get(i);
        }

        aEnd = System.currentTimeMillis();

        myStart = System.currentTimeMillis();

        int mySum = 0;
        for (int i = 0; i < 10000; i++) {
            mySum += myL.get(i);
        }

        myEnd = System.currentTimeMillis();
        
        lStart = System.currentTimeMillis();

        int lSum = 0;
        for (int i = 0; i < 10000; i++) {
            lSum += lL.get(i);
        }

        lEnd = System.currentTimeMillis();

	System.out.println("java ArrayList: " + (aEnd - aStart));
        System.out.println("myLinkedList: " + (myEnd - myStart));
        System.out.println("javaLinkedList: " + (lEnd - lStart));

	System.out.println("\nThe ArrayList get sum method is significantly faster than the other two, and my Linked List is slightly faster than the java built-in Linked List");
    }
}
