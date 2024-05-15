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
public abstract class Funcionario extends Pessoa implements Empregado{
    protected String matricula;
    protected String departamento;

    public Funcionario(String matricula, String departamento, String RG, String nome, String email) {
        super(RG, nome, email);
        this.matricula = matricula;
        this.departamento = departamento;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public double IRRF() {
        double Salario = SalarioBruto();
        if(Salario >= 1000 && Salario < 2000)
            return Salario*0.1;
        else if(Salario >= 2000 && Salario <= 3000)
            return Salario*0.2;
        else if(Salario > 3000)
            return Salario*0.3;
        else return 0;
    }

    @Override
    public double INSS() {
        double salario = SalarioBruto() - IRRF();
     if (salario>1302.00)
         return salario*0.075;
     else if(salario >=1302.01 && salario <2571.29)
         return salario*0.09;
     else if(salario >= 2571.30 && salario <=7507.49)
         return salario*14;
     else if(salario >= 7507.49)
         return 7507.49*0.14;
     else return 0;
    }

    @Override
    public double SalarioLiquido() {
        return SalarioBruto() - INSS() - IRRF();
    }

    @Override
    public String toString() {
        return "Funcionario{" 
                + "RG=" + RG 
                + ", nome=" + nome 
                + ", email=" + email 
                + ", matricula=" + matricula 
                + ", departamento=" + departamento 
                + ", Salario Bruto=" + SalarioBruto() 
                + ", Salario Liquido=" + SalarioLiquido()
                + '}';
    }
    
    
    
    

    
}
