import java.io.*;
import java.util.*;

public class myStack<E>{
    //implements Iterable<E>{
    private Node<E> top;
    
    public myStack(){
	top = new Node<E>();
    }
    
    /*public ListIterator<E> iterator(){
	LLit<E> i = new LLit<E>(l.getNext());
	return i;
	}*/
    
    public void push(E s){
	Node<E> tmp = new Node<E>(s);
	tmp.setPrev(top);
	top.setNext(tmp);
	top=tmp;
    }
    
    public E pop(){
	Node<E> tmp = top;
	top=tmp.getPrev();
	top.setNext(null);
	return tmp;
    }

    public boolean empty(){
	return (top.getPrev()==null)&&(top.getData()==null)&&(top.getNext()==null);
    }

    public E top(){
	return top.getData();
    }

    public String toString(){
	String s = top.toString();
	for (Node<E> tmp = top.getPrev(); tmp!=null ; tmp=tmp.getPrev()){
	    s = tmp + " --> " + s;
	}
	return s;
    }
}
