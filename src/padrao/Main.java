package padrao;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        cursos.sort(Comparator.comparingInt(c -> c.getAlunos()));
        cursos.stream().filter(c -> c.getAlunos() >= 100).map(Curso::getAlunos).forEach(System.out::println);
        Stream<String> nomeDoCurso = cursos.stream().map(Curso::getNome);

        cursos.stream()
                .filter(c -> c.getAlunos() > 50)
                .map(c -> c.getAlunos())
                .forEach(System.out::println);

        OptionalDouble optionalCurso = cursos.stream().
                mapToInt(c -> c.getAlunos()).
                average();
        System.out.println(optionalCurso);

        cursos.stream().
                mapToInt(c -> c.getAlunos()).
                average();

        List<Curso> cursosFiltrados = cursos.stream()
                .filter(c -> c.getAlunos() > 50)
                .collect(Collectors.toList());
    }
}
