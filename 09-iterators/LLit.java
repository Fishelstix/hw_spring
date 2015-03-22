import java.io.*;
import java.util.*;

public class LLit<E> implements Iterator<E>{
    private Node<E> t, tSeed;
    public LLit(Node<E> n, Node<E> nSeed){
	t=n;
	tSeed=nSeed;
    }
    
    public boolean hasNext(){
	return t!=null;
    }
    
    public E next(){
	E retval = t.getData();
	t=t.getNext();
	return retval;
    }
    
    public void remove(){
	// to be completed for homework
    }
}
