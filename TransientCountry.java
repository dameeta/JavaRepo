import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TransientCountry {

	
		 public static void main(String[] args) throws ClassNotFoundException {
			 
			  Country india = new Country();
			 india.setName("India");
			 india.setPopulation(49089898877l);
			  try
			  {
			   FileOutputStream fileOut = new FileOutputStream("country.ser");
			   ObjectOutputStream outStream = new ObjectOutputStream(fileOut);
			   outStream.writeObject(india);
			   outStream.close();
			   fileOut.close();
			  }catch(IOException i)
			  {
			   i.printStackTrace();
			  }
			  try
			  {
			   FileOutputStream fileOut = new FileOutputStream("country.ser");
			   ObjectOutputStream outStream = new ObjectOutputStream(fileOut);
			   outStream.writeObject(india);
			   outStream.close();
			   fileOut.close();
			  }catch(IOException i)
			  {
			   i.printStackTrace();
			  }
			  
			  
			  System.out.println("serialized");
			  
			  
			  try
			  {
			   FileInputStream filein = new FileInputStream("country.ser");
			   ObjectInputStream outStream = new ObjectInputStream(filein);
			   
			   
			   Country c1=(Country)outStream.readObject();
			   outStream.close();
			   filein.close();
			   System.out.println(c1.name);
			   System.out.println(c1.population);
			  }catch(IOException i)
			  {
			   i.printStackTrace();
			  }
			  
			 }
		 
		 
		 
			}
			 