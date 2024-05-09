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
public class SegmentoReta implements Objeto2d{
    private Ponto2d p0;
    private Ponto2d p1;

    public SegmentoReta(Ponto2d p0, Ponto2d p1) {
        this.p0 = new Ponto2d(p0.getX(),p0.getY());
        this.p1 = new Ponto2d(p1.getX(),p1.getY());
    }
     

    @Override
    public void moveX(double dx) {
        p0.moveX(dx);
        p1.moveX(dx);
    }
    @Override
    public void moveY(double dy) {
        p0.moveY(dy);
        p1.moveY(dy);
    }
    @Override
    public void moveXY(double dx, double dy) {
        p0.moveXY(dx,dy);
        p1.moveXY(dx,dy);  
     
    }

    public Ponto2d getP0() {
        return p0;
    }

    public Ponto2d getP1() {
        return p1;
                
    }

    @Override
    public String toString() {
        return "SegmentoReta{" + "p0=" + p0.toString() + ", p1=" + p1.toString() + '}';
    }

  
    
}
