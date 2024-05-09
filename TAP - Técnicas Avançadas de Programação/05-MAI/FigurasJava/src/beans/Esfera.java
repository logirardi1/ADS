/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;


/**
 *
 * @author vitor
 */
public class Esfera implements Figura3D {
    private Ponto3D p0;
    private double raio;

    public Esfera(Ponto3D p0, double raio) {
        this.p0 = new Ponto3D(p0.getX(), p0.getY(), p0.getZ());
        this.raio = raio;
    }

    public Ponto3D getP0() {
        return p0;
    }

    public double getRaio() {
        return raio;
    }
    
    @Override
    public double volume() {
        return (4/3) * Math.PI * Math.pow(raio, 2);
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
        return "Esfera{" + "p0=" + getP0() + ", raio=" + raio + '}';
    }
    
    
    
}
