import java.util.ArrayList;
import java.util.List;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentCopyOnWrite {
	public static void main(String args[]) {
		List<String> list1 = new CopyOnWriteArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();

		list1.add("First element in concurrent list");
		list2.add("First element in classic list");

		Iterator<String> itor1 = list1.iterator();
		Iterator<String> itor2 = list2.iterator();
		list1.add("New element in concurrent list");
		list2.add("New element in classic list");

		printAll(itor1);

		printAll(itor2);
		itor1 = list1.iterator();
		printAll(itor1);
		itor2 = list2.iterator();
		printAll(itor2);
	}

	private static void printAll(Iterator<?> itor) {
		try {
		while (itor.hasNext()) {
			System.out.println(itor.next());
		}
		} catch (Exception e) {
			System.out.println("Exception occurred: " + e.toString());
		}
	}
}