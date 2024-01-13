package ejercicio2_level1;

import java.util.Scanner;

public class Viaje {
    
    
    Scanner sc = new Scanner(System.in);
    
    public void menu(){
        
        System.out.println("AGENCIA DE VIAJES");
        System.out.println("Indique la fecha de viaje: ");
        System.out.println("1. Invierno");
        System.out.println("2. Otoño");
        System.out.println("3. Primavera");
        System.out.println("4. Verano");
        int opcionTemporada = sc.nextInt();
        
        System.out.println("Indique su presupuesto: ");
        double presupuesto = sc.nextDouble();
        
        switch(opcionTemporada){
            case 1:
                if(presupuesto>=100){
                   invierno();
                   break;
                }
                else{
                    System.out.println("Su presupuesto no es suficiente");
                    menu();
                }
            case 2:
                if(presupuesto>=200){
                   otono();
                   break;
                }
                else{
                    System.out.println("Su presupuesto no es suficiente");
                    menu();                    
                }                
            case 3:
                if(presupuesto>300){
                   primavera();
                   break;
                }
                else{
                    System.out.println("Su presupuesto no es suficiente");
                    menu();                    
                }                
            case 4:
                if(presupuesto>400){
                   verano();
                   break;
                }
                else{
                    System.out.println("Su presupuesto no es suficiente");
                    menu();                    
                }                
            default:
                break; 
        }        
    }
    
    public void invierno(){
        
        System.out.println("Indique lo que quiere realizar");
        System.out.println("1. Esqui");
        System.out.println("2. Realizar recorrido por Alpes Suizos");
       
        int opcionActividadI = sc.nextInt();
        
        switch(opcionActividadI){
            case 1: 
                System.out.println("El mejor destino es Andorra");
                break;
            case 2:
                System.out.println("El mejor destino es Suiza");
                break;
                
        }    
    }
    
    public void verano() {

        System.out.println("Indique la actividad a realizar");
        System.out.println("1. Senderismo y deportes extremos");
        System.out.println("2. Actividades en las playas");

        int opcionActividadV = sc.nextInt();

        switch (opcionActividadV) {
            case 1:
                System.out.println("El mejor destino es España");
                break;
            case 2:
                System.out.println("El mejor destino es Portugal");
                break;
        }
    }
    
    public void primavera(){
        
        System.out.println("Indique la actividad a realizar");
        System.out.println("1. Actividades de deportes extremos");
        System.out.println("2. Recorrido cultural e histórico");

        int opcionActividadP = sc.nextInt();

        switch (opcionActividadP) {
            case 1:
                System.out.println("El mejor destino es Francia");
                break;
            case 2:
                System.out.println("El mejor destino es Italia");
                break;
        }        
    }
    public void otono(){
        
        System.out.println("Indique la actividad a realizar");
        System.out.println("1. Senderismo y deportes extremos");
        System.out.println("2. Actividades culturales e históricas");

        int opcionActividadO = sc.nextInt();

        switch (opcionActividadO) {
            case 1:
                System.out.println("El mejor destino es Belgica");
                break;
            case 2:
                System.out.println("El mejor destino es Austria");
                break;
        }        
    }
}
