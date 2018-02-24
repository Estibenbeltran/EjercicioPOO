/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;
import java.util.Scanner;
/**
 * @author Camilo Andres D'isidoro Flechas y Dairo Estiben Beltran Martinez
 * Ejercicio 1: Software por consola que ingrese el nombre el alumno
 * y n cantidad de notas y al final me indique el promedio o nota final del alumno
 */
public class Ej1 {
    Scanner leer = new Scanner(System.in);
    /**
     * Ejecuta el código, invocado por Main
     */
    public void Abrir(){
        int notas;
        String alumno;
        float promedio;
        int acN = 0,tA,tN;
        System.out.println("Cuantos alumnos desea evaluar?");//alumnos a evaluar
        tA = leer.nextInt();//se reciben los datos
        while(tA<0){//validacion de no negativos
            System.out.println("Numero no valido");
            tA = leer.nextInt();
        }
        System.out.println("Cuantas notas se han sacado?");
        tN = leer.nextInt();
        while(tN<0){
            System.out.println("Numero no valido");
            tN = leer.nextInt();
        }
        for(int a=0;a<tA;a++){//peticion de datos
            System.out.println("Digite el nombre del alumno "+(a+1));
            alumno = leer.next();
            for(int n=0;n<tN;n++){
                System.out.println("Digite la nota "+(n+1)+" Que logro el estudiante (1-5)");
                notas = leer.nextInt();
                while(notas<1 || notas>5){
                    System.out.println("Nota no valida");
                    notas = leer.nextInt();
                }
                acN+=notas;//operacion
            }
            promedio = acN/tN;
            System.out.println("El promedio del estudiante "+alumno+" es de: "+promedio);
            promedio = 0;
            acN = 0;
        }
        System.out.println("EL EJERCICIO 1 HA FINALIZADO");
    }
}
