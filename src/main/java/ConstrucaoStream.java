import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConstrucaoStream {

    public static void main(String[] args) {
        Number[] numerosArray = {5,6,3,1,8,0};

        Stream.of(numerosArray).forEach(System.out::println);

        System.out.println("----------------------------");

        Stream<Number> numerosStream = Stream.of(10,4,6,3,9,12,0);
        numerosStream.forEach(System.out::println);

        System.out.println("----------------------------");

        List<Number> numerosLista = Arrays.asList(1,20,4,5,3,7);
        Stream.of(numerosLista).forEach(System.out::println);
    }

}
