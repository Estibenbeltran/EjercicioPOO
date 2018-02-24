/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;
import java.util.Scanner;

/**
 *
 * @author camil
 */
public class Ej5 {
    Scanner leer = new Scanner(System.in);
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
    public void Abrir(){
        Fibonacci nu = new Fibonacci();
        System.out.println("Ingresa hasta que numero deseas hacer la serie fibonacci");
        nu.num = leer.nextInt();
        while(nu.num<0){
            System.out.println("El numero no puede ser menor a 0");
            nu.num = leer.nextInt();
        }
        for (int i = 0; i <= nu.num; i++){
        System.out.println("la serie fibonaccio de "+nu.num+" es: " + nu.fibo(i));
        }
    }
}
