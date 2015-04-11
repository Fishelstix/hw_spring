import java.io.*;
import java.util.*;

public class myQueue<E>{
    private Node<E> top, bottom;
    
    public myQueue(){
        bottom = new Node<E>(null);
    }

    public void enqueue(Node<E> data){
	if(bottom.getData()==null){
	    bottom = data;
            top = bottom;
	}else{
	    data.setPrev(top);
	    top.setNext(data);
	    top=data;
	}
    }
    
    public Node<E> dequeue(){
	Node<E> tmp = bottom;
        if(top==bottom){
            bottom = new Node<E>(null);
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
