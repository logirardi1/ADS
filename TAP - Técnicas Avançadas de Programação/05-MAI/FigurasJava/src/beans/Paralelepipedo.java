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
public class Paralelepipedo implements Figura3D{
    private Ponto3D p0;
    private double altura;
    private double base;
    private double profundidade;

    public Paralelepipedo(Ponto3D p0, double altura, double base, double profundidade) {
        this.p0 = new Ponto3D(p0.getX(),p0.getY(),p0.getZ());
        this.altura = altura;
        this.base = base;
        this.profundidade = profundidade;
    }

    public Ponto3D getP0() {
        return p0;
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    public double getProfundidade() {
        return profundidade;
    }
    
    
public Ponto3D calP1(){
        return new Ponto3D(p0.getX()+base,p0.getY(),p0.getZ());
    }
    
     public Ponto3D calP2(){
        return new Ponto3D(p0.getX(),p0.getY()+altura,p0.getZ());
    }
       public Ponto3D calP3(){
        return new Ponto3D(p0.getX()+base,p0.getY()+altura,p0.getZ());
    }
     public Ponto3D calP4(){
        return new Ponto3D(p0.getX(),p0.getY(),p0.getZ()+profundidade);
    }
    
     public Ponto3D calP5(){
        return new Ponto3D(p0.getX()+ base,p0.getY(),p0.getZ()+profundidade);
    }
       public Ponto3D calP6(){
        return new Ponto3D(p0.getX(),p0.getY()+altura,p0.getZ()+profundidade);
    }
       public Ponto3D calP7(){
        return new Ponto3D(p0.getX()+base,p0.getY()+altura,p0.getZ()+profundidade);
    }
   
    
    
    
    @Override
    public double volume() {
        return base*altura*profundidade;
    }

    @Override
    public void moveZ(double dz) {
        p0.moveZ(dz);
    }

    @Override
    public void moveXZ(double dx, double dz) {
        p0.moveXZ(dx, dz);
    }

    @Override
    public void moveYZ(double dy, double dz) {
       p0.moveYZ(dy, dz);
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

    @Override
    public String toString() {
        return "Bloco{" + "p0=" + getP0()+ "p1= " + calP1() + "p2= " + calP2() + "p3= " + calP3() + "p4= " + calP4() +"p5= " + calP5() +"p6= " + calP6() + "p7= " + calP7() + "p0=" + p0 + ", altura=" + getAltura() + ", base=" + getBase() + ", profundidade=" + getProfundidade() + '}';
    }   
}
