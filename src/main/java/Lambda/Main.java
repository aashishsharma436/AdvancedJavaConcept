package Lambda;

import java.util.*;

public class Main {
    public static void main(String args[]){
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

        //Lambda is like functional Interface without name , which takes the parameters and perform some operation and return to you;

        list.forEach(s -> System.out.println(s));
        list.forEach(s -> System.out.println(s+2*2));

    }
}
