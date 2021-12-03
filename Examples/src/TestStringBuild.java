
public class TestStringBuild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*StringBuilder strBuilder = new StringBuilder("Hello");
				strBuilder.append("Tinky");
				System.out.println(strBuilder);
				strBuilder.append(101);
				System.out.println(strBuilder);
				StringBuilder  str=new StringBuilder("Hello");  
						str.insert(1,"Java");
						System.out.println(str)*/;

						/*StringBuilder strBuilder=new StringBuilder();  
						System.out.println(strBuilder.capacity());
						strBuilder.append("1234");
						System.out.println(strBuilder.capacity());
						strBuilder.append("123456789112");
						System.out.println(strBuilder.capacity());
						strBuilder.append("1");
						System.out.println(strBuilder.capacity()); //(oldcapacity*2)+2  
						StringBuilder strBuilder2=new StringBuilder("1234");  
						System.out.println(strBuilder2.capacity());*/
						
						StringBuilder strBuilder=new StringBuilder("Core_capacity");  
						System.out.println(strBuilder.capacity());
						strBuilder.append(true);
						strBuilder.append("Of String builder");
						//strBuilder.ensureCapacity(10);
						System.out.println(strBuilder.capacity());

						//StringBuilder strBuilder2=new StringBuilder("Core_capacity");  
						//strBuilder2.ensureCapacity(30);
						//System.out.println(strBuilder2.capacity());
						
						

						

	}

}
