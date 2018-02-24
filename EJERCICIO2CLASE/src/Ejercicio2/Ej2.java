/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;
import java.util.Scanner;
/**
 *
 * @author Camilo Andres D'isidoro Flechas y Dairo Estiben Beltran Martinez
 * Ejercicio 2: Desarrolle un programa que me permita hacer n cantidad de consultas
 * sobre la estacion de año de cada mes ingresado (1-3 Invierno / 4-6 verano / 7-9 otoño / 10-12 primavera)
 */
public class Ej2 {
    Scanner leer = new Scanner(System.in);
    int estacion;
    /**
     * Ejecuta el código, invocado por Main
     */
    public void Abrir(){
        estacion = 13;
        while(estacion!=0){
            System.out.println("Digite el numero del mes, si quiere finalizar digite cero");//peticion de datos
            estacion = leer.nextInt();
            while(estacion<0 || estacion>12){//se valida cada estacion
                System.out.println("Mes no valido");
                estacion = leer.nextInt();
            }
            if(estacion>=1 && estacion<=3){//se valida cada estacion
                System.out.println("Es Invierno");
            }
            if(estacion>=4 && estacion<=6){//se valida cada estacion
                System.out.println("Es Verano");
            }
            if(estacion>=7 && estacion<=9){//se valida cada estacion
                System.out.println("Es Otoño");
            }
            if(estacion>=10 && estacion<=12){//se valida cada estacion
                System.out.println("Es Primavera");
            }
        }
    }
}
