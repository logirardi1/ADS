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
public class Pessoa {
    protected String RG;
    protected String nome;
    protected String email;

    public Pessoa(String RG, String nome, String email) {
        this.RG = RG;
        this.nome = nome;
        this.email = email;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRG() {
        return RG;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "RG=" + RG + ", nome=" + nome + ", email=" + email + '}';
    }

    
    
}
