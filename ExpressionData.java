public class ExpressionData {
	public static void main(String[] args) {
		
	int a=20,b=10;
	b= a-- - --a;
	int c=a--;
	int d=a>>2;
	int e=a&b;
	
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	System.out.println(e);
	}
}