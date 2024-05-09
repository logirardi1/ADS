/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AulaPoo;

//import aula02poo.ayrton.beans.Circulo;

import beans.Cubo;
import beans.Esfera;
import beans.Paralelepipedo;
import beans.Ponto2d;
import beans.Ponto3D;
import beans.Quadrado;
import beans.SegmentoReta;



/**
 *
 * @author aluno
 */
public class Aula05POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //TODO code application logic here
      /* Ponto2d p0 = new Ponto2d(2,3.5);
        Ponto2d p1 = new Ponto2d(7,1.5);
        p0.moveX(1.5);
        SegmentoReta segreta= new SegmentoReta(p0,p1);
        System.out.println(p0.toString());
        System.out.println(p1.toString());
        System.out.println(segreta.toString());
        segreta.moveXY(2, 2);
        System.out.println(segreta.toString());
        Quadrado quad = new Quadrado(p0,5);
        System.out.println(quad.toString());
        Circulo circ = new Circulo(p0,3);
        System.out.println(circ.toString());
        Retangulo ret = new Retangulo(p0,2,3);
        System.out.println(ret.toString());
       */  
      
//      Ponto3D p3d = new Ponto3D(0,0,0); ;;;
//      Ponto3D p3d1 = new Ponto3D(2,0,0);  
//      SegmentoReta3D sg3d = new SegmentoReta3D(p3d,p3d1);
//      System.out.println(sg3d.toString());
//      Cubo cb = new Cubo(p3d,2);
//      System.out.println(cb.toString());
//      Paralelepipedo bloco = new Paralelepipedo(p3d1,2,3,4);
//      System.out.println("paralelepipedo: " + bloco.toString());


        Ponto3D p4 = new Ponto3D(3,3,3);
        Esfera esfera = new Esfera(p4, 3);
        System.out.println(esfera.toString());
        
        
        
      
      
      
      
    }
    
}
    