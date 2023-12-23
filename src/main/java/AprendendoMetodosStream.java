import java.util.stream.Stream;

public class AprendendoMetodosStream {

    public static void main(String[] args) {
        //map - mapeia uma strem de dados para outro strem de dados de mesma quantidade
        Double[] notas = {5.5,5.5,7.3,7.2};
        Stream.of(notas)
                .map(nota -> nota + 2)
                .map(nota -> nota - 1)
                .forEach(System.out::println);

        //filter - retorna um strem filtrado
        Stream.of(notas)
                .filter(nota -> nota >= 7)
                .map(nota -> "Você foi aprovado com nota: " + nota)
                .forEach(System.out::println);

        //reduce
        var aprovado = Stream.of(notas).reduce((acumulador, nota) -> acumulador + nota)
                .map(somaNotas -> somaNotas/4).filter(nota -> nota > 7).isPresent();

        System.out.println("Aprovado? " + aprovado);

        //match
        //todos itens atendem a condição?
        var aprovadoMatch = Stream.of(notas).allMatch(nota -> nota >= 7);
        System.out.println(aprovadoMatch);
        //algum item atende a condição?
        aprovadoMatch = Stream.of(notas).anyMatch(nota -> nota >= 7);
        System.out.println(aprovadoMatch);
        //nenhum item atende a condição?
        aprovadoMatch = Stream.of(notas).noneMatch(nota -> nota >= 7);
        System.out.println(aprovadoMatch);
    }

}
