public class Driver{
    public static void main(String[] args){
	myQueue<String> mQ = new myQueue<String>();
	System.out.println("Empty? : "+mQ.empty());
	mQ.enqueue("Al");
	System.out.println("Al enqueues");
	mQ.enqueue("Betty");
	System.out.println("Betty enqueues");
	mQ.enqueue("Carl");
	System.out.println("Carl enqueues");
	mQ.enqueue("Daisy");
	System.out.println("Daisy enqueues");
	System.out.println(""+mQ);
	System.out.println("Dequeueing " + mQ.dequeue());
	System.out.println(""+mQ);
	System.out.println(""+mQ.head()+" is now the head");
	mQ.enqueue("Eddy");
	System.out.println("Eddy enqueues");
	System.out.println(""+mQ);
	System.out.println("Empty? : "+mQ.empty());
    }
}
