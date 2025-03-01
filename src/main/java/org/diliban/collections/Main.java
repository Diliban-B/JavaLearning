package org.diliban.collections;

import org.diliban.entities.Product;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.stream.Collectors;

public class Main {

    private static final String alphabet = "abcdefghijklmnopqrstuvwxyz";



    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        Random random = new Random();
        Stack<Character> openBrackets = new Stack<>();

        String s = "H";

        s.chars().boxed().collect(Collectors.toCollection(HashSet::new));



        for(int i = 0; i < 100; i++){
            StringBuilder nameBuilder = new StringBuilder();
            for(int j = 0; j < 8; j++){

                int index = random.nextInt(alphabet.length());
                nameBuilder.append(alphabet.charAt(index));
            }

            products.add(new Product(nameBuilder.toString(), random.nextInt(10000)));


        }

        int[] arr = new int[]{1,2,3,4};
        int[] arr2 = new int[]{1,2,3,4};

        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toCollection(ArrayList::new));



        List<Integer> list = Arrays.asList(1,2,3,4,5);

        List<List<Integer>> list2= new ArrayList<>();

        list2.add(Arrays.asList(1,2,3,4,5));
        list2.add(Arrays.asList(7,8,9));

        list2.sort((l1, l2) -> l1.get(0) - l2.get(0));

        System.out.println(list2);






        System.out.println(Arrays.stream(arr).max());





    }
}
