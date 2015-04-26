public class Node{
    private Integer Data;
    private Node right,left;
    public Node(Integer n){
	Data = n;
    }
    public Integer getData(){
	return Data;
    }
    public Node getRight(){
	return right;
    }
    public Node getLeft(){
	return left;
    }
    public void setRight(Node n){
	right = n;
    }
    public void setLeft(Node n){
	left = n;
    }
    public void setData(Integer i){
	Data = i;
    }
}
