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
public class Ponto3D implements Objeto3D {
    private double x;
    private double y;
    private double z;

    public Ponto3D(double x, double y,double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
    

    @Override
    public void moveZ(double dz) {
        z+=dz;
    }

    @Override
    public void moveXZ(double dx, double dz) {
        x+=dx;
        z+=dz;
    }

    @Override
    public void moveYZ(double dy, double dz) {
        y+=dy;
        z+=dz;
    }

    @Override
    public void moveX(double dx) {
        x+=dx;
    }

    @Override
    public void moveY(double dy) {
        y+=dy;
    }

    @Override
    public void moveXY(double dx, double dy) {
        y+=dy;
        x+=dx;
    }

    @Override
    public String toString() {
        return "Ponto3D{" + "x=" + x + ", y=" + y + ", z=" + z + '}';
    }
    
}
