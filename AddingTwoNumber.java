public class AddingTwoNumber{
    public static void main(String args[]) {
       System.out.println(" Sum of 1000 add 2000 is : " + add(1000, 2000));
       System.out.println(" Sum of 0 and 0 is : " + add(0, 0));
       System.out.println(" Sum of -1220 and +1000 is : " + add(-1220, 1000));
       System.out.println(" Sum of -10 + 200 is : " + add(-10, 200));
       System.out.println(" Sum of 0 + 200 is : " + add(0, 200));
    }


	public static int add(int a, int b){
	    if(b == 0) return a;
	    int sum = a ^ b; //SUM of two integer is A XOR B
	    int carry = (a & b) << 1;  //CARRY of two integer is A AND B
	    return add(sum, carry);
	}
}