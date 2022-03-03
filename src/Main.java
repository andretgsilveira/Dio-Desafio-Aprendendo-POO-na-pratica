import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Java POO");
        curso1.setCargaHoraria(30);
        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("VBA");
        curso2.setDescricao("Automatizando planilhas com VBA");
        curso2.setCargaHoraria(25);
        System.out.println(curso2);

        //--------------------------//

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Mentoria para curso Java POO");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria VBA");
        mentoria2.setDescricao("Mentoria para curso de VBA");
        mentoria2.setData(LocalDate.now());
    }
}
