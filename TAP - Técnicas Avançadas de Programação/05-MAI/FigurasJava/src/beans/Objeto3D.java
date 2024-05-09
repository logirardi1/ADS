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
public interface Objeto3D extends Objeto2d {
    void moveZ(double dz);
    void moveXZ(double dx, double dz);
    void moveYZ(double dy, double dz);
}
