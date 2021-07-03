import java.util.ArrayList;
import java.util.List;

public class NumberParallel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("without parallel...");

        List<String> alphabet = getData();
        alphabet.stream().forEach(System.out::println);

        System.out.println("with Parallel stream...");

        List<String> alpha2 = getData();
        alpha2.parallelStream().forEach(System.out::println);
        
    }

    private static List<String> getData() {

        List<String> alphabet = new ArrayList<>();

        int n = 97;  // 97 = a , 122 = z
        while (n <= 122) {
            char c = (char) n;
            alphabet.add(String.valueOf(c));
            n++;
        }

        return alphabet;

    }

}
