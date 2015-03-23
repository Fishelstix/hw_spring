public class Driver(){
    public static void main(String[] args){
	myStack<String> mS = new myStack<String>();
	System.out.println(mS.empty());
	for(int i = 0; i<10; i++){
	    mS.push("hello"+i);
	}
    }
}
