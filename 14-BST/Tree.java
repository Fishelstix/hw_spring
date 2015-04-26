public class Tree{
    private Node start;
    public Node search(Integer i){
	Node T = start;
	while(T != null){
	    int ph = T.getData().compareTo(i);
	    if (ph == 0){
		return T;
	    } else if (ph < 0){
		T = T.getLeft();
	    } else {
		T = T.getRight();
	    }   
	}
	return null;
    }

    public void insert(Integer i){
	Node T = start;
	Node t2 = T;
	while (T != null){
	    t2 = T;
	    int ph = T.getData().compareTo(i);
	    if (ph == 0){
		break;
	    } else if (ph < 0){
		T = T.getLeft();
	    } else {
		T = T.getRight();
	    }   
	}
	int ph = t2.getData().compareTo(i);
	if (ph < 0){
	    t2.setLeft(new Node(i));
	} else {
	    t2.setRight(new Node(i));
	}  
	
    }
    
    public Node rsearch(Integer i){
	return searchhelp(i,start);
    }
    private Node searchhelp(Integer i, Node t){
	if(t == null){
	    return null;
	}
	int ph = t.getData().compareTo(i);
	if(ph == 0){
	    return t;
	} else if (ph < 0){
	    return searchhelp(i, t.getLeft());
	} else {
	    return searchhelp(i, t.getRight());
	}
    }

    public void rinsert(Integer i){
	if(start == null){
	    start = new Node(i);
	    return;
	}
	inserthelp(i,start);
    }
    private void inserthelp(Integer i, Node t){
	int ph = t.getData().compareTo(i);
	if(ph < 0){
	    if (t.getLeft() != null){
		inserthelp(i, t.getLeft());
	    } else {
		t.setLeft(new Node(i));
	    }
	} else {
	    if ( t.getRight() != null){
		inserthelp(i, t.getRight());
	    } else {
		t.setRight(new Node(i));
	    }
	}
    }

    public String toString(){
	String ret = "";
	return toStringHelper(start,ret);
    }
    private String toStringHelper(Node t, String ret){
	if(t == null){
	    return;
	}
	ret += String.parseInt(t.getData());
	ret += toStringHelper(t.getLeft, ret);
	ret += toStringHelper(t.getRight, ret);
	return ret;
    }
    
}
