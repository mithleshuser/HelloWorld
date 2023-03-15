import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class loopListJava8 {
    public static void main(String arg[]) {
      /*  List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add(null);
        list.add("D");
        list.add("E");
        list.stream().filter(Objects::nonNull).forEach(System.out::println);
*/

        Stream<String> s = Stream.of("a", "b", "c", "1", "2", "3");
       /* s.parallel().forEach(x -> System.out.print(x));*/
        // keep order, it is always a,b,c,1,2,3
       s.parallel().forEachOrdered(x -> System.out.print(x));
    }

}
