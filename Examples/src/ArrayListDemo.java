import java.util.*;
import java.util.stream.Collectors;



public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList <String> data=new ArrayList<>();
        data.add("Kamal");
        data.add("Niti");
        data.add("Roshan");
        data.add(3,"Radha");
        data.add("Aman");
        data.add("Niti");
        data.add("Anita");
        //int x= print(67);
        List<String> result = data.stream()
                .filter(u -> u.startsWith("R"))
                .collect(Collectors.toList());
        System.out.println(result);
        List<Integer> lengths = data.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(lengths);

       /* for (int i = 0; i < data.size(); i++) {
            String str = data.get(i);
            System.out.println(str);*/
        String name="Narayan";
        System.out.println(name.length());
        List<String> flatmapresult = data.stream()
                .flatMap(s -> Arrays.stream(s.split("")))
                .collect(Collectors.toList());
        System.out.println(flatmapresult);
        List<String> unique = data.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(unique);
        List<String> sortedList = data.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedList);
        List<String> sortedListcomparator = data.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(sortedListcomparator);
        System.out.println(data.stream()
                .peek(System.out::println)
                .collect(Collectors.toList()));
        List<String> limitedList = data.stream()
                .limit(5)

                .collect(Collectors.toList());
        System.out.println(limitedList);
        List<String> skippedList = data.stream()
                .skip(3)
                .collect(Collectors.toList());
        System.out.println(skippedList);
//Terminal operations
        List<String> list = data.stream()
                .collect(Collectors.toList());
        System.out.println(list);
        data.stream()
                .forEach(System.out::println);
        data.stream().forEachOrdered(System.out::println);
        Object[] array = data.stream().toArray();
        System.out.println("printing the arraylist in object array form");
        for(Object s: array)
        {
            System.out.print(s + " ");
        }
        System.out.println("\n Optional with concatenated..");
        Optional<String> concatenated;
        concatenated = data.stream().reduce(String::concat);
            System.out.println(concatenated);
       String concatenatedwithspace = data.stream().reduce("", String::concat);
        System.out.println(concatenatedwithspace);
        System.out.println();
List <Integer>list1=new ArrayList<>();
list1.add(34);list1.add(3);list1.add(4);list1.add(84);
        int sum = list1.stream().reduce(0, Integer::sum, Integer::sum);
        System.out.println(sum);
        boolean hasMatch = data.stream().anyMatch(s -> s.startsWith("A"));
        System.out.println(hasMatch);
        boolean allMatch = data.stream().allMatch(s -> s.length() > 0);
        System.out.println(allMatch);
        boolean noneMatch = data.stream().noneMatch(s -> s.isEmpty());
        System.out.println(noneMatch);
        Optional<String> first = data.stream().findFirst();
        System.out.println(first);
        Optional<String> any = data.stream().findAny();
        System.out.println(any);
        long count = data.stream().count();
        System.out.println(count);



    }


    }

