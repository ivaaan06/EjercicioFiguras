/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicundi.iyepitia.logica;

import com.unicundi.iyepitia.logica.Circulo;
import com.unicundi.iyepitia.logica.Cuadrado;
import com.unicundi.iyepitia.logica.Figura;
import com.unicundi.iyepitia.logica.Rectangulo;
import com.unicundi.iyepitia.logica.Triangulo;

import java.util.Scanner;

/**
 *@author Ivan Espitia
 * @author caren rodriguez
 */
public class menu {
    
    public void menudatos(){
          
        Scanner scan = new Scanner(System.in);
        String respuesta = " ";
        //polimorfismo
        Figura[] vector = new Figura[6]; 
        int opc =0;
        int contador=0;
        do{
            System.out.println("--figuras geometricas--");
            System.out.println("1. Cuadrado");
            System.out.println("2. Triangulo");
            System.out.println("3. Rectangulo");
            System.out.println("4. Circulo");
            System.out.println("Seleccione la figura para calcular area y perimetro");
            opc = scan.nextInt();
            switch (opc){
                case 1:
                    Cuadrado cua1 = new Cuadrado(0);
                    System.out.println("Cuadrado");
                    System.out.println("Ingrese el valor del lado");
                    cua1.setLado(scan.nextDouble());
                    cua1.imprimir();
                    vector[contador]=cua1;
                    contador++;
                    break;
                case 2:
                    Triangulo tri = new Triangulo(0, 0);
                    System.out.print("Triangulo");
                    System.err.println("ingrese la altura");
                    tri.setAltura(scan.nextDouble());
                    System.err.println("Ingrese la base");
                    tri.setBase(scan.nextDouble());
                    tri.imprimir();
                    vector[contador]=tri;
                    contador++;
                    break;
                case 3:
                    Rectangulo rec1 = new Rectangulo(0, 0);
                    System.out.println("Rectangulo");
                    System.out.println("Ingrese la altura");
                    rec1.setAltura(scan.nextDouble());
                    System.out.println("Ingrese la base");
                    rec1.setBase(scan.nextDouble());
                    rec1.imprimir();
                    vector[contador]=rec1;
                    contador++;
                    break;
                case 4:
                    Circulo cir1 = new Circulo(0);
                    System.out.println("Circulo");
                    System.out.println("Ingrese el radio");
                    cir1.setRadio(scan.nextDouble());
                    cir1.imprimir();
                    vector[contador]=cir1;
                    contador++;
                    break;
                default:
                    
            }
            System.out.println("Desea ingresar una nueva figura S/N"); 
            respuesta=scan.next();
            
        }while(respuesta.equals("S") || respuesta.equals("s"));  
        //datos guardados en el vector
        
        for (Figura fig : vector){
            if(fig instanceof Cuadrado){
                System.out.println("Cuadrado");
                ((Cuadrado)fig).imprimir();
            }else if (fig instanceof Triangulo){
                System.err.println("Triangulo");
                ((Triangulo)fig).imprimir();
            }else if (fig instanceof Rectangulo){
                System.out.println("Rectangulo");
                ((Rectangulo)fig).imprimir();
            }else if (fig instanceof Circulo){
                System.out.println("Circulo");
                ((Circulo)fig).imprimir();
            }
        }
    }
    
    
    
    
    
    
}
