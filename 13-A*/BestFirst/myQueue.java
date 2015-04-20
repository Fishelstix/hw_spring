import java.io.*;
import java.util.*;

public class myQueue<E>{
    private Node<E> top, bottom;
    
    public myQueue(){
        bottom = new Node<E>(null,0);
    }

    public void enqueue(Node<E> data){
	if(bottom.getData()==null){
	    bottom = data;
            top = bottom;
	} else if (bottom.getPriority()>data.getPriority()) {
	    data.setNext(bottom);
	    bottom.setPrev(data);
	    bottom=data;
	} else if (top.getPriority()<=data.getPriority()) {
	    data.setPrev(top);
	    top.setNext(data);
	    top=data;
	} else {
	    Node<E> tmp = bottom;
	    while(tmp.getNext().getPriority()<=data.getPriority()){
		tmp = tmp.getNext();
	    }
	    data.setNext(tmp.getNext());
	    tmp.getNext().setPrev(data);
	    data.setPrev(tmp);
	    tmp.setNext(data);
	}
    }
    
    public Node<E> dequeue(){
	Node<E> tmp = bottom;
        if(top==bottom){
            bottom = new Node<E>(null,0);
            top=bottom;
        }else{
            bottom=tmp.getNext();
        }
	return tmp;
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
