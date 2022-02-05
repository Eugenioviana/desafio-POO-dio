


import One.Innavation.Digital.Dominio.Bootcamp;
import One.Innavation.Digital.Dominio.Cursos;
import One.Innavation.Digital.Dominio.Dev;
import One.Innavation.Digital.Dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cursos c1 = new Cursos();
        c1.setDescricao("Java");
        c1.setTitulo("POO");
        c1.setCargaHoraria(5);
        System.out.println(c1);
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("JAVA");
        mentoria.setDescricao("POO");
        mentoria.setDate(LocalDate.now());
        System.out.println(mentoria);


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java");
        bootcamp.setDescricao("Bootcam java developer");
        bootcamp.getConteudos().add(c1);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("Eugenio");
        dev.inscreverBootcamp(bootcamp);
        Dev dev1 = new Dev();
        System.out.println("Conteudos inscritos: Eugenio " + dev.getConteudoInscritos());
        dev.proguedir();
        System.out.println("Conteudos Inscritos: Eugenio " + dev.getConteudoInscritos());
        System.out.println("Conteudos Concluidos: Eugenio " + dev.getConteudoConcluidos());
        System.out.println("XP: " + dev.calculaTotalXp());


        dev1.setNome("Bruna");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Bruna: " + dev1.getConteudoInscritos());
        dev1.proguedir();
        System.out.println("Conteudos Incritos Bruna: " + dev1.getConteudoInscritos());
        System.out.println("Conteudos Concluidos Bruna: " + dev1.getConteudoConcluidos());
        System.out.println("XP: " + dev1.calculaTotalXp());
    }

}
