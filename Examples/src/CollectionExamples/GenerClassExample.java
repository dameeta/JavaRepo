package CollectionExamples;

public class GenerClassExample <T>{
	T gc1;
	public T getGc1() {
		return gc1;
	}


	public void setGc1(T gc1) {
		this.gc1 = gc1;
	}


	public GenerClassExample(T to1)
	{
		this.gc1=to1;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenerClassExample<Integer> gg1=new GenerClassExample<Integer>(10078);
		System.out.println(gg1.getGc1());
		System.out.println(gg1.gc1.getClass().getName());
		GenerClassExample<Boolean> gg2=new GenerClassExample<Boolean>(false);
		System.out.println(gg2.getGc1());
		System.out.println(gg2.gc1.getClass().getName());

	}

}
