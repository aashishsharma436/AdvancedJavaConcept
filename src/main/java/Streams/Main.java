package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    /*
        Why do we need Streams over for each loops in Java:
        A) With for each loops it is hard to write parallel external iterations.
        B) It sometimes needs a lot of boilerplate code.
        C) Sometimes it is diffiult to read or time consuming.
        Streams were introduced in Java-8. It uses internal loops instead of external loops.
    */
    public static void main(String args[]){

        List<Employee> company = company();
        //For Each using Stream
        company.stream().forEach(System.out::println);

        //apply filter

        company.stream().filter(desg -> {
            return desg.getDesignation().startsWith("J");
        }).forEach(System.out::println);

        // we can collect it into list also
        System.out.println(
                company.stream().filter(desg->{
                    return desg.getDesignation().startsWith("S");
                }
            ).collect(Collectors.toList()));

        /* filter() is a passive method and there can be infinite passive methods whereas
         there can only be one eager method like the forEach method.*/


        // Parallel iteration using stream
    }

    private static List<Employee> company(){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(20262690,"ABC","Junior Software Engineer","Wipro"));
        employees.add(new Employee(231967,"ABC","Software Engineer","Flipkart"));
        employees.add(new Employee(23167,"ABC","Senior Software Engineer","Morningstar"));
        return employees;
    }
}
