/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FolhaPag;

import folhapag.beans.Funcionario;
import folhapag.beans.Horista;
import folhapag.beans.Mensalista;
import folhapag.beans.ProfessorHorista;

/**
 *
 * @author aluno
 */
public class FolhaPag {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Horista = double ValorHora, double NumHoras, String matricula, String departamento, String RG, String nome, String email
        //Mensalista = String Cargo, String matricula, String departamento, String RG, String nome, String email
        //public ProfessorHorista(String Titulo, String Nivel, double ValorHora, double NumHoras, String matricula, String departamento, String RG, String nome, String email) {
        //super(ValorHora, NumHoras, matricula, departamento, RG, nome, email);
    Funcionario func01 = new Horista(20, 40, "12345", "vendas", "123456789", "Jose Silva", "josesilva@fatec.sp.gov.br");
    System.out.println(func01);
    Funcionario func02 = new Mensalista("Secretario","12345", "vendas", "12.345.678-90", "Jose Sarney", "josesarney@gmail.com");
    System.out.println(func02);
    Funcionario func03 = new ProfessorHorista("Especialista", "A", 20, 40, "12345", "vendas", "12.345.678-90", "Jose Sarney", "josesarney@gmail.com");
    System.out.println(func03);
    Funcionario func04 = new ProfessorHorista("Doutor", "C", 20, 40, "12345", "vendas", "12.345.678-90", "Jose Sarney", "josesarney@gmail.com");
    System.out.println(func04);
}

}
