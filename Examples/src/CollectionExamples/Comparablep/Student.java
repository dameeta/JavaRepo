package CollectionExamples.Comparablep;

import java.util.ArrayList;
import java.util.Collections;

public class Student implements Comparable<Student> {

	int rollno;
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", coursename=" + coursename + ", stname=" + stname + "]";
	}

	String coursename;
	String stname;
	
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.rollno-o.rollno;
	}	
	public Student(int rollno, String coursename, String stname) {
		super();
		this.rollno = rollno;
		this.coursename = coursename;
		this.stname = stname;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ArrayList<Student> al =new ArrayList<Student>();
	al.add(new Student(3, "Php", "Suhail"));
	al.add(new Student(17, "Cpp", "Nihar"));
	al.add(new Student(18, "Csharp", "zara"));
	al.add(new Student(01, "Pyton", "Punit"));
	al.add(new Student(11, "Java", "Sunil"));
	
	
	for(int i=0;i<al.size();i++)
	{
		
		System.out.println(al.get(i));
		
	}
	Collections.sort(al);
	
	System.out.println("displaying after sorting..");
	for(int i=0;i<al.size();i++)
	{
		
		System.out.println(al.get(i));
		
	}
	}

	

}
