package org.example.java8quesrevision;

import javax.swing.text.html.Option;
import java.util.Optional;

public class OptionalClassQues {
    public static void main(String[] args) {

       Optional<String> name1 = findNameById1(2);
        System.out.println(name1.orElse(""));

        // Rewrite safely using Optional.
        Optional<String> name2 = getName2();
       name2.ifPresent(n->System.out.println(n.toUpperCase()));

        Usser u = new Usser();
        Address a = new Address();
        a.setCity("Pune");
        u.setAddress(a);
     String city =  Optional.ofNullable(u.getAddress().getCity()).isPresent() ? u.getAddress().getCity().toUpperCase() : new Usser(new Address("unknown")).getAddress().getCity().toUpperCase();
      System.out.println(city);
    }
    public static String getName() {
        return "GUEST";
    }
    public static Optional<String> getName2() {
        return Optional.ofNullable("john");
    }


// Rewrite using Optional properly.
public String findNameById(int id) {
    if (id == 1) return "John";
    return null;
}
    public static Optional<String> findNameById1(int id) {
        return Optional.ofNullable(id==1?"John":null);
    }



}
