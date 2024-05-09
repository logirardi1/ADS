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
public class Mensalista extends Funcionario{
    protected String cargo;

    public Mensalista(String cargo, String matricula, String departamento) {
        super(matricula, departamento);
        this.cargo = cargo;
    }
    
    
}
