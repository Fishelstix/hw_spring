import java.io.*;
import java.util.*;

public class LLit<E> implements Iterator<E>{
    private Node<E> t, tSeed;
    public LLit(Node<E> n){
	t=n;
	tSeed=n;
    }

    public boolean hasNext(){
	return t!=null;
    }

    public E next(){
	E retval = t.getData();
	t=t.getNext();
	if(!(tSeed==t || tSeed.getNext() == t)){
	    tSeed=tSeed.getNext();
	}
	return retval;
    }

    public void remove(){
	tSeed.setNext(t);
    }
}
