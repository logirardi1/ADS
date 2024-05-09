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
public class Ponto2d implements Objeto2d{
    private double x;
    private double y;

    public Ponto2d(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
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
        x+=dx;
        y+=dy;
    }

    @Override
    public String toString() {
        return "Ponto2d{" + x + "," + y + '}';
    }
 
}
