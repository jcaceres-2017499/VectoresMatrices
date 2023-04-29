/*
 Nombre: Juan Pablo Caceres Enriquez
 Carne: 2017499
 Codigo Tecnico: IN5AV
 Fecha de creacion: 27/03/2022
 Fecha de modificacion:
 */
package org.juancaceres.system;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Principal {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int cont;
        int result = 0;
        int [] vector1 = new int [10];
        int [] vector2 = new int [10];
        int [] sumaVector = new int [10];
        int [] restaVector = new int [10];
        int [][] matriz1 = new int [3][3];
        int [][] matriz2 = new int [3][3];
        int [][] sumaMatriz = new int [3][3];
        int [][] restaMatriz = new int [3][3];
        
        for(cont=0; cont<10; cont++){
                    System.out.println("Introdusca los valores del primer vector en posicion "+ String.valueOf(cont));
                    vector1[cont]= sc.nextInt();
                    }
        
        for(cont=0; cont<10; cont++){
                    System.out.println("Introdusca los valores del segundo vector en posicion "+ String.valueOf(cont));
                    vector2[cont]= sc.nextInt();
                    }
        
        sumaVector[0]= vector1[0]+vector2[0];
        sumaVector[1]= vector1[1]+vector2[1];
        sumaVector[2]= vector1[2]+vector2[2];
        sumaVector[3]= vector1[3]+vector2[3];
        sumaVector[4]= vector1[4]+vector2[4];
        sumaVector[5]= vector1[5]+vector2[5];
        sumaVector[6]= vector1[6]+vector2[6];
        sumaVector[7]= vector1[7]+vector2[7];
        sumaVector[8]= vector1[8]+vector2[8];
        sumaVector[9]= vector1[9]+vector2[9];
                    
        System.out.println("vector1[0]+vector2[0]= "+sumaVector[0]);
        System.out.println("vector1[1]+vector2[1]= "+sumaVector[1]);
        System.out.println("vector1[2]+vector2[2]= "+sumaVector[2]);
        System.out.println("vector1[3]+vector2[3]= "+sumaVector[3]);
        System.out.println("vector1[4]+vector2[4]= "+sumaVector[4]);
        System.out.println("vector1[5]+vector2[5]= "+sumaVector[5]);
        System.out.println("vector1[6]+vector2[6]= "+sumaVector[6]);
        System.out.println("vector1[7]+vector2[7]= "+sumaVector[7]);
        System.out.println("vector1[8]+vector2[8]= "+sumaVector[8]);
        System.out.println("vector1[9]+vector2[9]= "+sumaVector[9]);
        System.out.println(" ");
        
        restaVector[0]= vector1[0]-vector2[0];
        restaVector[1]= vector1[1]-vector2[1];
        restaVector[2]= vector1[2]-vector2[2];
        restaVector[3]= vector1[3]-vector2[3];
        restaVector[4]= vector1[4]-vector2[4];
        restaVector[5]= vector1[5]-vector2[5];
        restaVector[6]= vector1[6]-vector2[6];
        restaVector[7]= vector1[7]-vector2[7];
        restaVector[8]= vector1[8]-vector2[8];
        restaVector[9]= vector1[9]-vector2[9];
                    
        System.out.println("vector1[0]-vector2[0]= "+restaVector[0]);
        System.out.println("vector1[1]-vector2[1]= "+restaVector[1]);
        System.out.println("vector1[2]-vector2[2]= "+restaVector[2]);
        System.out.println("vector1[3]-vector2[3]= "+restaVector[3]);
        System.out.println("vector1[4]-vector2[4]= "+restaVector[4]);
        System.out.println("vector1[5]-vector2[5]= "+restaVector[5]);
        System.out.println("vector1[6]-vector2[6]= "+restaVector[6]);
        System.out.println("vector1[7]-vector2[7]= "+restaVector[7]);
        System.out.println("vector1[8]-vector2[8]= "+restaVector[8]);
        System.out.println("vector1[9]-vector2[9]= "+restaVector[9]);
        System.out.println(" ");
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3;j++){
                System.out.println("Introdusca los valores de la primera matriz");
                matriz1[i][j]= sc.nextInt(); 
                }
        }
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.println("Introdisca los valores de la segunda matriz");
                matriz2[i][j]=sc.nextInt();
            }
        }
        sumaMatriz[0][0]= matriz1[0][0]+matriz2[0][0];
        sumaMatriz[0][1]= matriz1[0][1]+matriz2[0][1];
        sumaMatriz[0][2]= matriz1[0][2]+matriz2[0][2];
        sumaMatriz[1][0]= matriz1[1][0]+matriz2[1][0];
        sumaMatriz[1][1]= matriz1[1][1]+matriz2[1][1];
        sumaMatriz[1][2]= matriz1[1][2]+matriz2[1][2];
        sumaMatriz[2][0]= matriz1[2][0]+matriz2[2][0];
        sumaMatriz[2][1]= matriz1[2][1]+matriz2[2][1];
        sumaMatriz[2][2]= matriz1[2][2]+matriz2[2][2];
        
        System.out.println("La suma de matriz 1 + matriz 2= "+sumaMatriz[0][0]);
        System.out.println("La suma de matriz 1 + matriz 2= "+sumaMatriz[0][1]);
        System.out.println("La suma de matriz 1 + matriz 2= "+sumaMatriz[0][2]);
        System.out.println("La suma de matriz 1 + matriz 2= "+sumaMatriz[1][0]);
        System.out.println("La suma de matriz 1 + matriz 2= "+sumaMatriz[1][1]);
        System.out.println("La suma de matriz 1 + matriz 2= "+sumaMatriz[1][2]);
        System.out.println("La suma de matriz 1 + matriz 2= "+sumaMatriz[2][0]);
        System.out.println("La suma de matriz 1 + matriz 2= "+sumaMatriz[2][1]);
        System.out.println("La suma de matriz 1 + matriz 2= "+sumaMatriz[2][2]);
        System.out.println(" ");
        
        restaMatriz[0][0]= matriz1[0][0]-matriz2[0][0];
        restaMatriz[0][1]= matriz1[0][1]-matriz2[0][1];
        restaMatriz[0][2]= matriz1[0][2]-matriz2[0][2];
        restaMatriz[1][0]= matriz1[1][0]-matriz2[1][0];
        restaMatriz[1][1]= matriz1[1][1]-matriz2[1][1];
        restaMatriz[1][2]= matriz1[1][2]-matriz2[1][2];
        restaMatriz[2][0]= matriz1[2][0]-matriz2[2][0];
        restaMatriz[2][1]= matriz1[2][1]-matriz2[2][1];
        restaMatriz[2][2]= matriz1[2][2]-matriz2[2][2];
        
        System.out.println("La resta de matriz 1 + matriz 2= "+restaMatriz[0][0]);
        System.out.println("La resta de matriz 1 + matriz 2= "+restaMatriz[0][1]);
        System.out.println("La resta de matriz 1 + matriz 2= "+restaMatriz[0][2]);
        System.out.println("La resta de matriz 1 + matriz 2= "+restaMatriz[1][0]);
        System.out.println("La resta de matriz 1 + matriz 2= "+restaMatriz[1][1]);
        System.out.println("La resta de matriz 1 + matriz 2= "+restaMatriz[1][2]);
        System.out.println("La resta de matriz 1 + matriz 2= "+restaMatriz[2][0]);
        System.out.println("La resta de matriz 1 + matriz 2= "+restaMatriz[2][1]);
        System.out.println("La resta de matriz 1 + matriz 2= "+restaMatriz[2][2]);
                              
    }    
} 

       