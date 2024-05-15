package folhapag.beans;

public class ProfessorHorista extends Horista {
    private String Titulo;
    private String Nivel;

    public ProfessorHorista(String Titulo, String Nivel, double ValorHora, double NumHoras, String matricula, String departamento, String RG, String nome, String email) {
        super(ValorHora, NumHoras, matricula, departamento, RG, nome, email);
        this.Titulo = Titulo;
        this.Nivel = Nivel;
        this.ValorHora = calcValorHora();
    }

    private double calcValorHora() {
        double valorHora = 30; // Initialize to default value
        if (Titulo.equalsIgnoreCase("Especialista"))
            valorHora += 10;
        else if (Titulo.equalsIgnoreCase("Mestre"))
            valorHora += 20;
        else if (Titulo.equalsIgnoreCase("Doutor"))
            valorHora += 30;

        if (Nivel.equalsIgnoreCase("A"))
            valorHora += valorHora * 0.1;
        else if (Nivel.equalsIgnoreCase("B"))
            valorHora += valorHora * 0.2;
        else if (Nivel.equalsIgnoreCase("C"))
            valorHora += valorHora * 0.3;

        return valorHora;
    }

    // Getters and setters for Titulo and Nivel
    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getNivel() {
        return Nivel;
    }

    public void setNivel(String Nivel) {
        this.Nivel = Nivel;
    }
}
