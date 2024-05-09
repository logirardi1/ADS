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
public class Circulo implements Figura2D{
    private Ponto2d centro;
    private double raio;

    public Circulo(Ponto2d centro, double raio) {
        this.centro = new Ponto2d(centro.getX(),centro.getY());
        this.raio = raio;
    }
    
   public Ponto2d GetCentro(){
       return centro;
   }
   
    public double GetRaio(){
       return raio;
   }
   
          
    @Override
    public double area() {
        return Math.PI*raio*raio;
    }

    @Override
    public double perimetro() {
        return 2*Math.PI*raio;
    }

    @Override
    public void moveX(double dx) {
       centro.moveX(dx);
      
    }

    @Override
    public void moveY(double dy) {
        centro.moveY(dy);
    }

    @Override
    public void moveXY(double dx, double dy) {
       centro.moveXY(dx,dy);
    }

    @Override
    public String toString() {
        return "Circulo{" + "centro=" + centro + ", raio=" + raio + ",area=" + area() + ",perimetro=" + perimetro()+ '}';
        
    }
        
}
