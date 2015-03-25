import java.io.*;
import java.util.*;

public class myQueue<E>{
    private Node<E> top,bottom;
    
    public myQueue(){
	bottom = new Node<E>();
	top = bottom;
    }

    public void enqueue(E data){
	if(empty()){
	    bottom.setData(data);
	}else{
	    Node<E> tmp = new Node<E>(data);
	    tmp.setPrev(top);
	    top.setNext(tmp);
	    top=tmp;
	}
    }
    
    public E dequeue(){
	Node<E> tmp = bottom;
	bottom=tmp.getNext();
	bottom.setPrev(null);
	return tmp.getData();
    }

    public boolean empty(){
	return (top==bottom)&&(bottom.getData()==null);
    }

    public E head(){
	return bottom.getData();
    }

    public String toString(){
	String s = "FRONT: " + bottom;
	for (Node<E> tmp = bottom.getNext(); tmp!=null; tmp=tmp.getNext()){
	    s += " --> " + tmp;
	}
	return s;
    }
}
