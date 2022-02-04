


import One.Innavation.Digital.Dominio.Cursos;
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

    }
}
