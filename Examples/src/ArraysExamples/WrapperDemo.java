package ArraysExamples;




public class WrapperDemo {
	static Character c;
	Integer i;
	Double d;
	Float f;
	Boolean b;
	Byte b1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//c=new Character(c);
		int x=67;
		int y=3;
		Integer i=new Integer(x);
		Integer j=new Integer(y);
		Integer k = x;//autoboxing;
		int newVal= k;//autounboxing
    System.out.println(i+j);
    System.out.println(i.SIZE);
    int z=i.intValue();
    System.out.println(z);
    String x1= "34";
    String x2= "35";
    System.out.println(x1+x2);

    int va1=Integer.parseInt(x1);
    int val2=Integer.parseInt(x2);
    System.out.println(va1+val2);
    
    
	
	}

}
