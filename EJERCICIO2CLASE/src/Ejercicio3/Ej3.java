/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;
import java.util.Scanner;
/**
 *
 * @author Camilo Andres D'isidoro Flechas y Dairo Estiben Beltran Martinez
 * Desarrollar un programa que identifique en que categoría
 * debo registrarme según estos datos. 
 * 0-6: preinfantil
 * 7-17: infantil
 * 18-25: juvenil
 * 26-45: mayores
 * 60+: veteranos
 */
public class Ej3 {
    Scanner leer = new Scanner(System.in);
    int anios;
    /**
     * Ejecuta el código, invocado por Main
     */
    public void Abrir(){
        System.out.println("Ingrese su edad");//peticion de datos
        anios = leer.nextInt();
        while(anios<0){//validacion para que la edad no sea negativa
            System.out.println("Edad invalida");
            anios = leer.nextInt();
        }
        if(anios>=0 && anios<=6){//se valida cada categoria
            System.out.println("Debe registrarse en pre-infantil");
        }
        if(anios>=7 && anios<=17){//se valida cada categoria
            System.out.println("Debe registrarse en infantil");
        }
        if(anios>=18 && anios<=25){//se valida cada categoria
            System.out.println("Debe registrarse en juvenil");
        }
        if(anios>=26 && anios<=45){//se valida cada categoria
            System.out.println("Debe registrarse en mayores");
        }
        if(anios>=60){//se valida cada categoria
            System.out.println("Debe registrarse en veteranos");
        }
    }
}
