package org.example.java8quesrevision;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FuncProgQues3 {
    public static void main(String[] args) {
        // Exercise - 1
        // Out of the below list print only those which consist of word sping
        List<String> liOfwords = List.of("Spring","Not"," some" ,"word","spring");

        liOfwords.stream().filter(s->s.toLowerCase().contains("spring")).forEach(System.out::println);
        // Exercise - 2
        // print elements which has atleast 4 characters
        liOfwords.stream().filter(s->s.length()>=4).forEach(System.out::println);

        // Exercise - 3
        // given the below list of numbers print cube of odd numbers
        List<Integer> liOfInt = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(liOfInt.stream().filter(s->s%2!=0).map(s->s*s*s).collect(Collectors.toList()));

        //Exercise -4
        //print all the nos in the list
        List<Integer> li = List.of(12,9,8,3,2,1);
        li.stream().forEach(System.out::println);

        // Exercise -5
        //print all even nos in the list
        li.stream().filter(s->s%2==0).forEach(System.out::println);

        //reverse whole string as well as each Word of String
        String line = "program to reverse each word using functional programming";
        Stream.of(line).map(s->new StringBuffer(s).reverse()).forEach(System.out::println);

        //reverse the words of String and not the whole String

        Arrays.stream(line.split(" ")).map(s->new StringBuffer(s).reverse()).forEach(System.out::println);


         //reverse the whole string but not the words
        //java 7
        String[] str = line.split(" ");
        StringBuffer sb = new StringBuffer(str.length);
        for(int i=str.length-1;i>=0;i--) {
            sb.append(str[i]+" ");
        }
        System.out.println(sb);

        //java 8
        System.out.println(Arrays.stream(line.split(" ")).reduce( (w1,w2) -> w2 + " " +w1).get());
        //   checkIfStringContainsOnlyDigits

        String digit = "1242232443452";
        System.out.println(digit.chars().allMatch(c->Character.isDigit(c)));
        //convert IntStream to char using mapToObj
        System.out.println(digit.chars().mapToObj(c->(char)c).allMatch(s->Character.isDigit(s)));

        //countCharacterOccurence

        String s = "aacccssfefffsaasccs";
        System.out.println(Arrays.stream(s.split("")).collect(Collectors.groupingBy(c->c,Collectors.counting())));

        //checkIfStringIsPalindrome

        String input = "madam";
        System.out.println(IntStream.range(0,input.length()).allMatch(i->input.charAt(i) == input.charAt(input.length()-i-1)));

        //getFirstNonRepeatingCharacter
        String input1 = "aacbsaabccdde";
        System.out.println(Arrays.stream(input1.split("")).collect(Collectors.groupingBy(c->c, LinkedHashMap::new,Collectors.counting())).entrySet().stream().filter(c->c.getValue()==1).map(c->c.getKey()).findFirst().get());

        //code to check prime no via java 8 streams
        int number = 2;
        boolean isPrime = number>1 && IntStream.rangeClosed(2,(int) Math.sqrt(number)).noneMatch(i-> number % i==0);
        System.out.println(isPrime);

        //java 7 version
        boolean flag =true;
       if(number<=1) flag = false;
        for(int i=2;i<=Math.sqrt(number);i++) {
            if(number%i==0) {
                flag = false;
                break;
            }
        }
        System.out.println(flag);

        //factorial of number using java8 streams
        int n =5;
        System.out.println(IntStream.rangeClosed(1,n).reduce(1, (x1,x2)->x1*x2));

        //fibonacci series using java8 streams
        int num =10;
        int a=0, b=1;
        for(int i=1;i<=num;i++) {
            int c=a+b;
            a=b;
            b=c;
        }
        //java 8  //{a,b}-->a=b and b=c -->a=f[1], b= f[0]+f[1]
       Stream.iterate(new int[]{0,1},f-> new int[]{f[1],f[0]+f[1]}).limit(num).map(f->f[0]).forEach(System.out::println);
    }
}
