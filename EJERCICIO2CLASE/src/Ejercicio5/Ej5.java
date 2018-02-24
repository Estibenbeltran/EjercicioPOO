package Ejercicio5;
import java.util.Scanner;
/**
 *
 * @author Camilo Andres D'isidoro Flechas y Dairo Estiben Beltran Martinez
 */
public class Ej5 {
    Scanner leer = new Scanner(System.in);
    /**
     * Clase Fibonacci en la cual se guarda la serie a calcular
     */
    class Fibonacci{
        int num;
        int fibo(int num){
        if(num<=1){
            return num;
        }else{
            return fibo(num-1) + fibo(num-2);
        }
    }
 }
    /**
     * Ejecuta el código, invocado por Main
     */
    public void Abrir(){
        Fibonacci nu = new Fibonacci();
        System.out.println("Ingresa hasta que numero deseas hacer la serie fibonacci");
        nu.num = leer.nextInt();
        while(nu.num<0){
            System.out.println("El numero no puede ser menor a 0");
            nu.num = leer.nextInt();
        }
        for (int i = 0; i <= nu.num; i++){
        System.out.println("la serie fibonaccio de "+nu.num+" en la seccion: "+(i)+" es: " + nu.fibo(i));
        }
    }
}
