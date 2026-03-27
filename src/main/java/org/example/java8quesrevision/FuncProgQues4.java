package org.example.java8quesrevision;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FuncProgQues4 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Modern", "Java", "In", "Action");

        // find all the unique characters from given list ['m','o','d']
        System.out.println(words.stream().map(word-> word.split("")).map(Arrays::stream).map(Stream::findAny).collect(Collectors.toList()));
        //using flatmap
        System.out.println(words.stream().map(word->word.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList()));

      //  using map and reduce
        System.out.println(words.stream().map(word-> Arrays.asList(word.split(""))).reduce(new ArrayList<>(), (l1, l2) ->  {
            l1.addAll(l2);
            return l1;
        }).stream().distinct().collect(Collectors.toList())
        );

        //  Find the Sum of Squares of a List of Numbers
        List<Integer> list= Arrays.asList(1,2,3,4,5);  //25+16+9+4+1
        System.out.println(list.stream().map(x->x*x).reduce(Integer::sum).get());

        // Count the number of characters in the whole list.

        List<String> strings = Arrays.asList("Java", "Stream", "Reduce");
        System.out.println(strings.stream().map(str->str.split("")).flatMap(Arrays::stream).count());

        // Find the first longest string in the array.
        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "date");
        System.out.println(fruits.stream().reduce( (s1,s2) -> {
            if (s1.length() > s2.length()) return s1;
            else if (s1.length() == s2.length()) return s1;
            else return s2;
        }).get());

        //    Given a list of lists, flatten it and compute the sum of all elements.

        List<List<Integer>> nestedLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );
        System.out.println(nestedLists.stream().flatMap(Collection::stream).reduce(Integer::sum).orElseGet(()->0));

        Optional<String> name = findNameById(2);
        System.out.println(name.orElse(""));
        Optional<String> name2 = getName();
        System.out.println(name2.orElseGet(() ->"John"));
    }
    static Optional<String> findNameById(int id) {
       return Optional.of(id==1 ? "John":null);
    }
    static  Optional<String> getName() {
        return Optional.empty();
    }

}
