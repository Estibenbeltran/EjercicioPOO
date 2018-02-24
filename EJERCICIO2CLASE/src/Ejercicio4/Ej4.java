/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;
import java.util.Scanner;
/**
 *
 * @author camil
 * Desarrolle un programa que dado un número total de
 * segundos, devuelve el número de minutos, horas, semanas y
 * días.
 */
public class Ej4 {
    Scanner leer = new Scanner(System.in);
    int horas;
    int dias;
    int semanas;
    int min;
    //setSemanas permitirá guardar el dato de las semanas totales según los cálculos en la función principal
    void setSemanas (int a){
        semanas = a;
    }
    //setDias permitirá, al igual que setSemanas, guardar el dato correspondiente según los cálculos correspondientes
    void setDias(int a){
        dias = a;
    }
    //setHoras guardará las horas residuales después de haber realizado los demás cálculos
    void setHoras(int a){
        horas = a;
    }
    void setMin(int a){
        min = a;
    }
    public void Abrir(){
        //iniciacion de variables
        int a,d = 0;
        int s = 0;
        System.out.println("Digite el total de segundos");//peticion del dato principal
        a= leer.nextInt();
        while(a<=0){//validacion de que no sean segundos negativos ni 0
            System.out.println("Segundos invalidos");
            a= leer.nextInt();
        }   
        while(a>=604800){//se valida la semana
            a=a-604800;
            semanas++;
        }
        while(a>=86400){//se valian los dias
            a=a-86400;
            dias++;
        }
        while(a>=3600){//se validan las horas
            a=a-3600;
            horas++;
        }
        while(a>=60){//se validan los minutos
            a=a-60;
            min++;
        }
        //se muestran los datos 
        System.out.println("Los segundos digitados son: ");
        System.out.println(semanas+" Semana(s)");
        System.out.println(dias+" Dia(s)");
        System.out.println(horas+" Hora(s)");
        System.out.println(min+" Minuto(s)");
        System.out.println(a+" Segundo(s)");
        }
}
