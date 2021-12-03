
public class TestStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//string buffer first way declaration
		StringBuffer sb1=new StringBuffer("This is sample string buffer");
		System.out.println(sb1);
		
		//second way of declaration
		StringBuffer sb2=new StringBuffer(0);
		System.out.println(sb2.capacity());
		sb2.insert(0,"Hello");
		sb2.append(sb1);
		System.out.println(sb2);
		int n=sb2.indexOf("is");
		System.out.println(n);
	int no=sb2.lastIndexOf("is");
	System.out.println(no);
	System.out.println(sb2.reverse());
	}

}
