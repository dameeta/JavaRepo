package ArraysExamples;

public class EmpObjArray {

	public void DispEmployee()
	{
		
		Employee [] e1= new Employee[4];
		e1[0]=new Employee(101,"Suma","Developer");
	    e1[1]=new Employee(102,"Sudhir","data Analyst");
		e1[2]=new Employee(103,"Suma","Scala developer");
		e1[3]=new Employee(104,"Suma","Java Engineer");
		for (int i=0;i<4;i++)
		{
			System.out.println(e1[i]);
			
		}
		System.out.println(e1[0]);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmpObjArray eobj=new EmpObjArray();
		eobj.DispEmployee();
		
		
	}

}
