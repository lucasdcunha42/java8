package padrao;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate future = LocalDate.of(2099,1,25);
        System.out.println(future);

        Period periodo = Period.between(hoje, future);
        System.out.println(periodo);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = formatter.format(hoje);
        System.out.println(dataFormatada);


    }
}
