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
public class Funcionario extends Pessoa implements Empregado{
    protected String matricula;
    protected String departamento;

    public Funcionario(String matricula, String departamento) {
        this.matricula = matricula;
        this.departamento = departamento;
    }
    
    
            
    
}
