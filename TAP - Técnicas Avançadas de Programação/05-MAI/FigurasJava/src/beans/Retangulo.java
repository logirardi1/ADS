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
public class Retangulo implements Figura2D {
    private Ponto2d p0;
    private double altura;
    private double base;

    public Retangulo(Ponto2d p0, double altura, double base) {
        this.p0 = new Ponto2d(p0.getX(),p0.getY());
        this.altura = altura;
        this.base = base;
    }

  
    public Ponto2d calcP1(){
        return new Ponto2d(p0.getX(),p0.getY());
    }
    
    public Ponto2d calcP2(){
        return new Ponto2d(p0.getX()+ base,p0.getY());
    }
    
    public Ponto2d calcP3(){
        return new Ponto2d(p0.getX(),p0.getY()+ altura);
    }
    
    public Ponto2d getP0() {
        return new Ponto2d(p0.getX(),p0.getY());
    }

    public void setBase(double base) {
        this.base = base;
    }
    
       public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }
   public double getBase() {
        return base;
    }

    @Override
    public String toString() {
        return "Quadrado{" + "p0=" + p0 + ", p1=" + calcP1() + ", p2=" + calcP2()+ ", p3=" + calcP3()+ ", base=" + base + ", altura=" + altura +'}';
    }

    @Override
    public double area() {
       return base*altura;
    }

    @Override
    public double perimetro() {
      return 2*base + 2*altura; 
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
