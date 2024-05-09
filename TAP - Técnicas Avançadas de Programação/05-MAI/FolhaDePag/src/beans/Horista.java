/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author aluno
 */
public class Horista extends Funcionario {
    protected double numHoras;
    protected double valorHoras;

    public Horista(double numHoras, double valorHoras, String matricula, String departamento) {
        super(matricula, departamento);
        this.numHoras = numHoras;
        this.valorHoras = valorHoras;
    
        @Override
         public double salarioBruto() (
            return valorHoras*numHoras*4;
            )
    }
    
    
}
