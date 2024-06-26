import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class App {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setCargaHoraria(8);
        curso1.setDescricao("Curso Java DIO");
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso2 Java");
        curso2.setCargaHoraria(8);
        curso2.setDescricao("Curso2 Java DIO");
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria1 de Java");
        mentoria1.setDescricao("Mentoria1 de Java DIO");
        mentoria1.setData(LocalDate.now());
        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria2 de Java");
        mentoria2.setDescricao("Mentoria2 de Java DIO");
        mentoria2.setData(LocalDate.now());


        // System.out.println(curso);
        // System.out.println(mentoria);

         Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
        bootcamp.getConteudos().add(mentoria2);

        Dev devRamon = new Dev();
        devRamon.setNome("Ramon");
        devRamon.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Ramon:" + devRamon.getConteudosInscritos());
        devRamon.progredir();
        devRamon.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Ramon:" + devRamon.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Ramon:" + devRamon.getConteudosConcluidos());
        System.out.println("XP:" + devRamon.calcularTotalXp());

        System.out.println("<---------->");

        Dev devFatima = new Dev();
        devFatima.setNome("Fatima");
        devFatima.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Fátima:" + devFatima.getConteudosInscritos());
        devFatima.progredir();
        devFatima.progredir();
        devFatima.progredir();
        devFatima.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Fátima:" + devFatima.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Fátima:" + devFatima.getConteudosConcluidos());
        System.out.println("XP:" + devFatima.calcularTotalXp());


    }
}
