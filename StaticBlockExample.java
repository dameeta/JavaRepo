
public class StaticBlockExample {
    

	static {
      //static block
    	 final int count=10;
       System.out.println("Hi, Inside the Static Block!"+ count);
      }
      public StaticBlockExample() {
      System.out.println("Constructor 1....");
      }
      public StaticBlockExample(int c) {
       System.out.println("Constructor 2...."+ c);
      }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ctr=1;
StaticBlockExample sb1=new StaticBlockExample();
StaticBlockExample sb2=new StaticBlockExample();
StaticBlockExample sb3=new StaticBlockExample(ctr);
StaticBlockExample sb4=new StaticBlockExample();
StaticBlockExample sb5=new StaticBlockExample(ctr);
		
		
	}

}
