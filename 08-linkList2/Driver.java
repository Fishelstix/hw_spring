public class Driver{
    public static void main(String[] args) {
	LList l = new LList();
	System.out.println(l);
	System.out.println(l.length());
	l.add(37);
	l.add(13);
	for (int i=0;i<5;i++){
	    l.add(i);
	}
	System.out.println(l);
	System.out.println(l.get(3));
	l.add(3, 12345);
	System.out.println(l);
	System.out.println(l.get(3));
	System.out.println(l.length());
	System.out.println(l.remove(13));
	System.out.println(l);
	System.out.println(l.length());
	System.out.println(l.remove(10000));
	System.out.println(l);
    }
}
