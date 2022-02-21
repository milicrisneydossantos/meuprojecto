import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        BootCamp bootcamp = new BootCamp() ;
        bootcamp.setNome("BootCamp java developer");
        bootcamp.setDescricao("BootCamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devcamila = new Dev();
        devcamila.setNome("Camila");
        devcamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devcamila.getConteudosInscritos());
        devcamila.progredir();
        devcamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devcamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devcamila.getConteudosConcluidos());
        System.out.println("XP:" + devcamila.calcularTotalxp());

        Dev devjoao = new Dev();
        devjoao.setNome("João");
        devjoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devjoao.getConteudosInscritos());
        devjoao.progredir();
        devjoao.progredir();
        devjoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devjoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos João:" + devjoao.getConteudosConcluidos());
        System.out.println("XP:" + devjoao.calcularTotalxp());
    }
}
