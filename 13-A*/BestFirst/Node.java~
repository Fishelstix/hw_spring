public class Node<E>{
    private E data;
    private int priority;
    private Node<E> next, prev, seed;
    
    public Node(E s, int p){
        seed = null;
	data = s;
	priority = p;
	next = null;
	prev = null;
    }
    public Node(Node<E> s, E d, int p){
        seed = s;
	data = d;
	priority = p;
	next = null;
	prev = null;
    }
    public void setData(E s){
	data = s;
    }
    public E getData(){
	return data;
    }
    public void setNext(Node<E> n){
	next = n;
    }
    public Node<E> getNext(){
	return next;
    }
    public void setPrev(Node<E> n){
	prev = n;
    }
    public Node<E> getPrev(){
	return prev;
    }
    public Node<E> getSeed(){
        return seed;
    }
    public void setPriority(int i){
	priority = i;
    }
    public int getPriority(){
	return priority;
    }
    public String toString(){
	return ""+data;
    }
}
