package CollectionExamples.comparator;

public class Product {

	int id;
	String prname;
	public Product(int i,String name)
	{
		this.id=i;
		this.prname=name;
	}
	public String toString()
	{
		return id + " " + prname;
	}
}
