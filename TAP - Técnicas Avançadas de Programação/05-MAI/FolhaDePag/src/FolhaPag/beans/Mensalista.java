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
public class Mensalista extends Funcionario {
    protected String Cargo;

    public Mensalista(String Cargo, String matricula, String departamento, String RG, String nome, String email) {
        super(matricula, departamento, RG, nome, email);
        this.Cargo = Cargo;
    }
    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }
    
    @Override
    public double SalarioBruto() {
       if(Cargo.equalsIgnoreCase("AuxiliarEnsino"))
           return 1500;
       else if(Cargo.equalsIgnoreCase("AuxiliarAdministrativo"))
           return 1800;
       else if(Cargo.equalsIgnoreCase("Secretario"))
           return 2500;
       else if(Cargo.equalsIgnoreCase("Coordenador"))
           return 4500;
       else if(Cargo.equalsIgnoreCase("Diretot"))
           return 5500;
       else return 0;
    }
    
    public String getCargo() {
        return Cargo;
    }

    
    
    
    
}
