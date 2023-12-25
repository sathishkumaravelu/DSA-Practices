package BrushUpTopics;

import org.testng.annotations.Test;

import java.util.ArrayList;

public class ArrayListLearning {

    @Test
    public void testArray() {

        int[] ar = new int[5];
        for (int num : ar) {
            System.out.print(num + " ");
        }

        int[] num1 = ar;

        ar[1] = 10;
        System.out.println();
        System.out.println("**********");
        for (int num : ar) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("**********");
        for (int num : num1) {
            System.out.print(num + " ");
        }
    }

    int size;

    @Test
    public void testArrayList() {
        ArrayList<Integer> list = new ArrayList<>();
        size = list.size();
        System.out.println(size);
        boolean add = list.add(10);
        size = list.size();
        System.out.println(size);

        list.add(10011);
        list.add(1000);
        Integer i = list.get(2);
        System.out.println(i);

        //list.stream().sorted().forEach(System.out::println);
/*
       List<Integer> filtered = list.stream().filter(value -> value > 100).collect(Collectors.toList());
        System.out.println(filtered);
        */
        while (list.iterator().hasNext()) {

        }
    }


}
