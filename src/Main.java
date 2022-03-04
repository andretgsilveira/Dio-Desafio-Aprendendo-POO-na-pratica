import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Java POO");
        curso1.setCargaHoraria(8);
        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("VBA");
        curso2.setDescricao("Automatizando planilhas com VBA");
        curso2.setCargaHoraria(4);
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

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java", "Descrição Bootcamp Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
        bootcamp.getConteudos().add(mentoria2);

        Dev aTelles = new Dev("Andre");
        Dev babiOliveira = new Dev("Babi");

        aTelles.increverBootcamp(bootcamp);
        babiOliveira.increverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos " + aTelles.getNome() + ": " + aTelles.getConteudosInscritos());
        System.out.println("Conteudos inscritos " +  babiOliveira.getNome() + " : " + babiOliveira.getConteudosInscritos());

        System.out.println("------------------------------");

        babiOliveira.progredir();
        babiOliveira.progredir();

        System.out.println("Conteudos inscritos " +  babiOliveira.getNome() + " : " + babiOliveira.getConteudosInscritos());
        System.out.println("Conteudos concluidos " +  babiOliveira.getNome() + " : " + babiOliveira.getConteudosConcluidos());

        System.out.println("XP " + aTelles.getNome() + " : " + aTelles.calcularTotalXP());
        System.out.println("XP " + babiOliveira.getNome() + " : " + aTelles.calcularTotalXP());




    }
}
