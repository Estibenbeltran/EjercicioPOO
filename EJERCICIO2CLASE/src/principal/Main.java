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
        Ej1 Ejer1 = new Ej1();
        Ej2 Ejer2 = new Ej2();
        Ej3 Ejer3 = new Ej3();
        Ej4 Ejer4 = new Ej4();
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