import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
public class TestTransient {
	public static void main(String args[]) {

		Book book1 = new Book(1109, "Java", "Balaguruswamy", 8);
		System.out.println("Before Serialization: " + book1); 
		try {FileOutputStream fos = new FileOutputStream("book1.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos); 
		oos.writeObject(book1);
		System.out.println("Book is successfully Serialized ");
		FileInputStream fis = new FileInputStream("book1.ser");
		ObjectInputStream ois = new ObjectInputStream(fis); 
		Book oldBook1 = (Book) ois.readObject();
		System.out.println("Book successfully created from Serialized data");
		System.out.println("Book after seriazliation : " + oldBook1 );
		//System.out.println(new StaticBlockExample());
		}
		catch (Exception e){
			e.printStackTrace();}}}
		
class Book implements Serializable{
			
		private int ISBN; 
		private String title; 
		private String author; 
		private transient int edition = 1; 

		//transient variable not serialized
		public Book(int ISBN, String title, String author, int edition) 
		{ this.ISBN = ISBN; 
		this.title = title; 
		this.author = author; 
		this.edition = edition;}
		
		@Override
		public String toString() {
		return "Book{" + "ISBN=" + ISBN + ", "
				+ "title=" + title + ", "
				+ "author=" + author + 
				", edition=" + edition + "}";}}
