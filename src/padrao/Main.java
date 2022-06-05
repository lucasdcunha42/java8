package padrao;

import padrao.Curso;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
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

        Optional<Curso> optionalCurso = cursos.stream()
                .filter(c -> c.getAlunos() > 50)
                .findFirst();

    }
}
