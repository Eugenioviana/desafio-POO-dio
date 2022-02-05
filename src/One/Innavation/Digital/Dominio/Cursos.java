package One.Innavation.Digital.Dominio;

public class Cursos extends Conteudo {

    private int cargaHoraria;

    public Cursos() {
    }


    @Override
    public String toString() {
        return "Cursos{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public void setCargaHoraria(int i) {
    }
}
