package principal;
import java.util.Scanner;
import Ejercicio1.Ej1;
import Ejercicio2.Ej2;
import Ejercicio3.Ej3;
import Ejercicio4.Ej4;
import Ejercicio5.Ej5;
/**
 * Ejercicio en clase 1 Programacion 2 20/2/2018
 * @version 1.0
 * @author Camilo Andres D'isidoro Flechas y Dairo Estiben Beltran Martinez
 */
public class Main {
    public static void main(String[] args) {
        int opc = 5;
        Scanner leer = new Scanner(System.in);
        //Declaracion de Objetos
        /**
         * Ejercicio 1: Software por consola que ingrese el nombre el alumno
         * y n cantidad de notas y al final me indique el promedio o nota final del alumno
         */
        Ej1 Ejer1 = new Ej1();
        /**
         * Ejercicio 2: Desarrolle un programa que me permita hacer n cantidad de consultas
         * sobre la estacion de año de cada mes ingresado (1-3 Invierno / 4-6 verano / 7-9 otoño / 10-12 primavera)
         */
        Ej2 Ejer2 = new Ej2();
        /**
         * Desarrollar un programa que identifique en que categoría
         * debo registrarme según estos datos. 
         * 0-6: preinfantil
         * 7-17: infantil
         * 18-25: juvenil
         * 26-45: mayores
         * 60+: veteranos
         */
        Ej3 Ejer3 = new Ej3();
        /**
         * Desarrolle un programa que dado un número total de
         * segundos, devuelve el número de minutos, horas, semanas y
         * días.
         */
        Ej4 Ejer4 = new Ej4();
        /**
         * Desarrolle la Serie Fibonacci
         */
        Ej5 Ejer5 = new Ej5();
        while(opc!=0){
            //segun la opcion se ejecuta el ejercicio que desee el usuario
            System.out.println("Que ejercicio desea ejecutar?");
            System.out.println("1)Notas de alumnos");
            System.out.println("2)Estaciones");
            System.out.println("3)Registro por edad");
            System.out.println("4)Conversion de tiempo");
            System.out.println("5)Numeros Fibonacci");
            System.out.println("0)Salir");
            opc = leer.nextInt();//se reciben los datos
            while(opc<0 || opc>5){//validacion de que sea la opcion que se desea no mayor ni menor
                System.out.println("Opcion no valida");
                opc = leer.nextInt();//se vuelven a pedir los datos
            }
            switch(opc){
                case 0:
                    System.out.println("Ha salido del programa");
                    break;
                case 1:
                    Ejer1.Abrir();
                    break;
                case 2:
                    Ejer2.Abrir();
                    break;
                case 3:
                    Ejer3.Abrir();
                    break;
                case 4:
                    Ejer4.Abrir();
                    break;
                case 5:
                    Ejer5.Abrir();
                    break;
            }
        }
    }
}