import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.BiFunction;

/**
 * @author boyang.lby
 * @date 3/6/17
 * @description
 */

public class Java8MainLearn {
    public static void main(String[]args){
        List<Integer> list = new ArrayList<Integer>();
        list.sort(Integer::compare);
        list.stream().map(x -> x);
        list.sort(Integer::compareTo
        );
        Comparator<Integer> comparator = Integer::compareTo;
        BiFunction<String, String, Integer> comp
                = (first, second) -> Integer.compare(first.length(), second.length());
        //list.sort(comp);
        Callable<String> callable = () -> "aa";

    }
}
