package StaticImport;
import static java.lang.Math.*;
import staticPack.StaticClass;
public class TestStat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("unused")
		int [] myScores [];
		//System.out.println(Math.random());
		System.out.println(sqrt(5));
		StaticClass.showData();
		StaticClass.x=6;
		System.out.println(StaticClass.x++);
	}

}
