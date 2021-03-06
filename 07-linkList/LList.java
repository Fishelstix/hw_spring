public class LList{
    private Node l=null;
    
    public void add(String s){
	Node tmp = new Node(s);
	tmp.setNext(l);
	l = tmp;
    }
    
    public String toString(){
	String s = "";
	Node tmp;
	for (tmp=l ; tmp!=null ; tmp=tmp.getNext()){
	    s = s + tmp + " --> ";
	}
	s = s + "null";
	return s;
    }

    public String find(int n){
	Node tmp = l;
	for(int i=0; i<n; i++){
	    tmp = tmp.getNext();
	}
	return tmp.getData();
    }

    public void insert(int n, String s){
	if(n==0){
	    add(s);
	}else{
	    Node ins = new Node(s);
	    Node low = l;
	    for(int i=0; i<n-1; i++){
		low = low.getNext();
	    }
	    Node high = low.getNext();
	    low.setNext(ins);
	    ins.setNext(high);
	}
    }
}
