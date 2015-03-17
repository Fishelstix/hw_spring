public class LList{
    private Node dummy = new Node(null);
    
    public void add(String s){
	Node n = new Node(s);
	n.setNext(dummy.getNext());
	dummy.setNext(n);
    }
    
    public String toString(){
	String s = "";
	for(Node tmp=dummy.getNext(); tmp!=null; tmp=tmp.getNext()){
	    s += tmp.getData() + " --> ";
	}
	s += "null";
	return s;
    }

    public Node get(int n){
	Node tmp = dummy;
	for(int i=-1; i<n; i++){
	    tmp = tmp.getNext();
	}
	return tmp;
    }

    public void add(int n, String s){
	Node ins = new Node(s);
	ins.setNext(get(n));
	get(n-1).setNext(ins);
    }

    public int length(){
	int c=0;
	for(Node tmp=dummy.getNext(); tmp!=null; tmp=tmp.getNext()){
	    c++;
	}
	return c;
    }

    public void remove(int n){
	Node tmp = get(n-1);
	tmp.setNext(tmp.getNext().getNext());
    }
}
