package ArraysExamples;

class Point{
	private int x,y;

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Point(int x,int y)
	{
		
		this.x=x;
		this.y=y;
	}
	public String toString()
	{
		
		return "["+ this.x+","+this.y + "]";
	}
	}

public class objArray {

	public void createArray() {
		 Point[] p;

		 p = new Point[10];
		 for ( int i=0; i<10; i++ ) {
		 p[i] = new Point(i, i+1); //p[0]=[x=0 ,y=1 ]
		 System.out.println(p[i]);

		 }

	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		objArray obj=new objArray();
		obj.createArray();
		
	}

}
