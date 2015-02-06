public class Driver{

    public static int factorial(int x){
	if(x==0) return 1;
	return x*factorial(x-1);
    }

    public static int fib(int x){
	if(x==0||x==1) return 1;
	return fib(x-1)+fib(x-2);
    }

    public static int len(String s){
	if(s.equals("")) return 0;
	return 1+len(s.substring(1));
    }

    public static int count(String s, char c){
	if(s.equals("")) return 0;
	if(s.charAt(0)==c){
	    return 1 + count(s.substring(1),c);
	}else{
	    return count(s.substring(1),c);
	}
    }

    public static int fibonacci(int x){
	if(x==0) return 0;
	if(x==1) return 1;
	return fibonacci(x-1)+fibonacci(x-2);
    }

    public static int bunnyEars2(int x){
	if(x==0) return 0;
	if(x%2==0){
	    return 3+bunnyEars2(x-1);
	}else{
	    return 2+bunnyEars2(x-1);
	}
    }

    public static int strCount(String str, String sub){
	if(str.length()<sub.length()) return 0;
	if(str.substring(0,sub.length()).equals(sub)){
	    return 1+strCount(str.substring(sub.length()),sub);
	}else{
	    return strCount(str.substring(1),sub);
	}
    }
    
    public static int sumDigits(int n){
	if(n==0) return 0;
	return (n%10)+sumDigits(n/10);
    }

    public static String allStar(String str){
	if(str.length()<=1) return str;
	return str.substring(0,1)+"*"+allStar(str.substring(1));
    }

    public static void main(String[] args){
	System.out.println(factorial(7));
	System.out.println(fib(11));
	System.out.println(len("abcdefghijklmnopqrstuvwxyz"));
	System.out.println(count("mississippi",'s'));
	System.out.println(fibonacci(11));
	System.out.println(bunnyEars2(3));
	System.out.println(strCount("cacatcowcat","cat"));
	System.out.println(sumDigits(235));
	System.out.println(allStar("abcdefghijklmnopqrstuvwxyz"));
    }
}
