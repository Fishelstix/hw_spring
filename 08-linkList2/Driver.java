public class Driver{
    public static void main(String[] args) {
	LList l = new LList();
	System.out.println(l);
	System.out.println(l.length());
	l.add("hello");
	l.add("world");
	for (int i=0;i<5;i++){
	    l.add(""+i);
	}
	System.out.println(l);
	System.out.println(l.get(3));
	l.add(3, "insert this");
	System.out.println(l);
	System.out.println(l.get(3));
	System.out.println(l.length());
	l.remove(4);
	System.out.println(l);
	System.out.println(l.length());
    }
}
