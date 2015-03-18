public class LList{
    private Node dummy = new Node(0);
    
    public void add(int i){
	Node n = new Node(i);
	n.setNext(dummy.getNext());
	dummy.setNext(n);
    }
    
    public String toString(){
	String s = "";
	for(Node tmp=dummy.getNext(); tmp!=null; tmp=tmp.getNext()){
	    s += "" + tmp + " --> ";
	}
	s += "null";
	return s;
    }

    public int get(int n){
	Node tmp = dummy;
	for(int i=-1; i<n; i++){
	    tmp = tmp.getNext();
	}
	return tmp.getData();
    }

    public void add(int n, int in){
	Node ins = new Node(in);
	Node tmp = dummy;
	for(int i=-1; i<n-1; i++){
	    tmp = tmp.getNext();
	}
	ins.setNext(tmp.getNext());
	tmp.setNext(ins);
    }

    public int length(){
	int c=0;
	for(Node tmp=dummy.getNext(); tmp!=null; tmp=tmp.getNext()){
	    c++;
	}
	return c;
    }

    public boolean remove(int n){
	for(Node tmp=dummy; tmp.getNext()!=null; tmp=tmp.getNext()){
	    if(tmp.getNext().getData()==n){
		tmp.setNext(tmp.getNext().getNext());
		return true;
	    }
	}
	return false;
    }
}
