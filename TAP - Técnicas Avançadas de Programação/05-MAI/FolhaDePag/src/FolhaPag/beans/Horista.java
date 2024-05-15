/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folhapag.beans;

/**
 *
 * @author aluno
 */
public class Horista extends Funcionario{
    protected double ValorHora;
    protected double NumHoras;

    public Horista(double ValorHora, double NumHoras, String matricula, String departamento, String RG, String nome, String email) {
        super(matricula, departamento, RG, nome, email);
        this.ValorHora = ValorHora;
        this.NumHoras = NumHoras;
    }

    public double getValorHora() {
        return ValorHora;
    }

    public void setValorHora(double ValorHora) {
        this.ValorHora = ValorHora;
    }

    public double getNumHoras() {
        return NumHoras;
    }

    public void setNumHoras(double NumHoras) {
        this.NumHoras = NumHoras;
    }
    
    @Override
    public double SalarioBruto() {
        return ValorHora*NumHoras*4;
    }
    
   @Override
    public String toString() {
        return "Horista{"
                + "RG=" + RG 
                + ", nome=" + nome 
                + ", email=" + email 
                + ", matricula=" + matricula 
                + ", departamento=" + departamento 
                + ", ValorHora=" + ValorHora 
                + ", NumHoras=" + NumHoras 
                + ", Salario Bruto=" + SalarioBruto() 
                + ", Salario Liquido=" + SalarioLiquido() 
                + '}';
    }
    
    
    
    
}
