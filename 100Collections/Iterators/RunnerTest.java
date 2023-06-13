package Iterators;
import java.util.*;

public class RunnerTest {
    public static void main(String[] args) {
        Prog1OurGenericList<Integer> list = new Prog1OurGenericList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
