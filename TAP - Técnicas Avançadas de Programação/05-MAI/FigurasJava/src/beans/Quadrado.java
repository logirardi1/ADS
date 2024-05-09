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
public class Quadrado implements Figura2D{
    private Ponto2d p0;
    private double lado;

    public Quadrado(Ponto2d p0, double lado) {
        this.p0 = new Ponto2d(p0.getX(), p0.getY());//p0;
        this.lado = lado;
    }

    public Ponto2d calcP1(){
        return new Ponto2d(p0.getX()+ lado,p0.getY());
    }
    
    public Ponto2d calcP2(){
        return new Ponto2d(p0.getX(),p0.getY()+ lado);
    }
    
    public Ponto2d calcP3(){
        return new Ponto2d(p0.getX()+ lado,p0.getY()+lado);
    }
    
    public Ponto2d getP0() {
        return new Ponto2d(p0.getX(), p0.getY());
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public String toString() {
        return "Quadrado{" + "p0=" + p0 + ", p1=" + calcP1() + ", p2=" + calcP2()+ ", p3=" + calcP3()+ ", lado=" + lado + '}';
    }

    @Override
    public double area() {
       return lado*lado;
    }

    @Override
    public double perimetro() {
      return 4*lado; 
    }

    @Override
    public void moveX(double dx) {
        p0.moveX(dx);
   
    }

    @Override
    public void moveY(double dy) {
       p0.moveY(dy);
    }

    @Override
    public void moveXY(double dx, double dy) {
        p0.moveXY(dx, dy);
    }
 
}
