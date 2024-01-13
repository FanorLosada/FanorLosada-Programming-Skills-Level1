package ejercicio3_level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Hospital {

    Scanner sc = new Scanner(System.in);
     
    public void ingreso() {
        int intentos = 0;
        int intentosMax = 4;

        String usuario = "Jose";
        String contrasena = "123";
        
        while (intentos > 3) {
            intentos++;
            if(usuario.equals("c") && contrasena.equals("c")){
                programarCita();
            }
            else{
                System.out.println("Tienes "+intentos+" intentos");
            }
        }
    }
    
    public void programarCita(){
        
        System.out.println("Indique el tipo de cita");
        System.out.println("1. Medicina general");
        System.out.println("2. Atencion de emergencia");
        System.out.println("3. Analisis clinicos");
        System.out.println("4. Cardiologia");
        System.out.println("5. Neurologia");
        System.out.println("6. Nutricion");
        System.out.println("7. Fisioterapia");
        System.out.println("8. Traumatologia");
        System.out.println("9. Medicina interna");
        int opcionCita = sc.nextInt();
        
        String medicoMG[] = {"Raul Gimenez", "Maria Jose Garcia", "Rocio Gonzales"};
        String medicoAE[] = {"Sandra Gómez Rodríguez", "Carlos Pérez García"};
        String medicoAC[] = {"Luisa Ramírez Díaz", "Andrés Flores Sánchez"};
        String medicoC[] = {"María Rodríguez López", "José López Pérez"};
        String medicoNE[] = {"Juan Martínez Gómez", "Ana García Sánchez"};
        String medicoNU[] = {"Rocio Gonzales Ramírez", "Raul Gimenez Flores"};
        String medicoF[] = {"Pedro Sánchez Díaz", "Juana García López"};
        String medicoT[] = {"Laura Pérez Ramírez", "Diego Ramírez Gómez"};
        String medicoM[] = {"Ana García Rodríguez", "Pedro Sánchez Pérez"};
        
        String medicoElegido = "";
        int contadorCitas = 0; 
        
        switch (opcionCita) {            
            case 1:
                int contadorMG = 0;
                for (String medicos : medicoMG) {
                    System.out.println(medicos);
                }
                System.out.println("Dime el nombre del medico");
                String nombreMedicoMG = sc.nextLine();
                sc.nextLine();
                for (String medico : medicoMG) {
                    if (nombreMedicoMG.equals(medicoMG)) {
                        contadorMG++;
                        medicoElegido = nombreMedicoMG;
                        if (contadorMG == 1) {
                            System.out.println("No se puede seleccionar 2 veces el mismo medico");
                        }
                    }
                }
                horario(opcionCita);
                break; 
                 
            case 2:
                int contadorAE = 0;
                for(String medicos: medicoAE){
                    System.out.println(medicos);
                }
                System.out.println("Dime el nombre del medico");
                sc.nextLine();
                String nombreMedicoAE = sc.nextLine();
                for (String medico: medicoAE) {
                    if(nombreMedicoAE.equals(medicoAE)){
                            medicoElegido =nombreMedicoAE;
                        if (contadorAE <= 2) {
                            System.out.println("No se puede seleccionar 2 veces el mismo medico");
                        }                            
                    }
                } 
                horario(opcionCita);
                break;                
                
                
            case 3:
                int contadorAC = 0;
                for(String medicos: medicoAC){
                    System.out.println(medicos);
                }
                System.out.println("Dime el nombre del medico");
                sc.nextLine();
                String nombreMedicoAC = sc.nextLine();
                for (String medico: medicoAC) {
                    if(nombreMedicoAC.equals(medicoAC)){
                            medicoElegido =nombreMedicoAC;
                        if (contadorAC <= 2) {
                            System.out.println("No se puede seleccionar 2 veces el mismo medico");
                        }                            
                    }
                }
                horario(opcionCita);
                break;

            case 4:
                int contadorC = 0;
                
                for(String medicos: medicoC){
                    System.out.println(medicos);
                }
                System.out.println("Dime el nombre del medico");
                String nombreMedicoC = sc.nextLine();
                sc.nextLine();
                for (String medico: medicoC) {
                    if(nombreMedicoC.equals(medicoC)){
                            medicoElegido =nombreMedicoC;
                        if (contadorC <= 2) {
                            System.out.println("No se puede seleccionar 2 veces el mismo medico");
                        }
                        else break;                             
                    }
                }
                horario(opcionCita);
                break;

                
            case 5:
                int contadorNE= 0;
                
                for(String medicos: medicoNE){
                    System.out.println(medicos);
                }
                System.out.println("Dime el nombre del medico");
                String nombreMedicoNE = sc.nextLine();
                sc.nextLine();
                for (String medico: medicoAC) {
                    if(nombreMedicoNE.equals(medicoNE)){
                            medicoElegido =nombreMedicoNE;
                        if (contadorNE <= 2) {
                            System.out.println("No se puede seleccionar 2 veces el mismo medico");
                        }                             
                    }
                }
                horario(opcionCita);
                break;
                
            case 6:
                int contadorNU = 0;
                
                for(String medicos: medicoNU){
                    System.out.println(medicos);
                }
                System.out.println("Dime el nombre del medico");
                String nombreMedicoNU = sc.nextLine();
                sc.nextLine();
                for (String medico: medicoNU) {
                    if(nombreMedicoNU.equals(medicoNU)){
                            medicoElegido =nombreMedicoNU;
                        if (contadorNU <= 2) {
                            System.out.println("No se puede seleccionar 2 veces el mismo medico");
                        }                            
                    }
                }
                horario(opcionCita);
                break;
                
            case 7:
                int contadorF = 0;
                
                for(String medicos: medicoF){
                    System.out.println(medicos);
                }
                System.out.println("Dime el nombre del medico");
                String nombreMedicoF = sc.nextLine();
                sc.nextLine();
                for (String medico: medicoF) {
                    if(nombreMedicoF.equals(medicoF)){
                            medicoElegido =nombreMedicoF;
                        if (contadorF <= 2) {
                            System.out.println("No se puede seleccionar 2 veces el mismo medico");
                        }                           
                    }
                }
                horario(opcionCita);
                break;
     
            case 8:
                int contadorT = 0;
                
                for(String medicos: medicoT){
                    System.out.println(medicos);
                }
                System.out.println("Dime el nombre del medico");
                String nombreMedicoT = sc.nextLine();
                sc.nextLine();
                for (String medico: medicoAC) {
                    if(nombreMedicoT.equals(medicoT)){
                            medicoElegido =nombreMedicoT;
                        if (contadorT <= 2) {
                            System.out.println("No se puede seleccionar 2 veces el mismo medico");
                        }                             
                    }
                }
                horario(opcionCita);
                break;

                
            case 9:
                int contadorM = 0;

                for (String medicos : medicoM) {
                    System.out.println(medicos);
                }
                System.out.println("Dime el nombre del medico");
                String nombreMedicoM = sc.nextLine();
                sc.nextLine();
                for (String medico : medicoM) {
                    if (nombreMedicoM.equals(medicoM)) {
                        medicoElegido = nombreMedicoM;
                        if (contadorM <= 2) {
                            System.out.println("No se puede seleccionar 2 veces el mismo medico");
                    }
                }
                horario(opcionCita);
                break;               
        }
    }
}
                          
    public void horario(int opcionCita){
        
        switch (opcionCita) {
            case 1:
                System.out.println("Indique los horarios, mañana(N) o tarde(T)");
                String horarioMG = sc.nextLine();
                break;
            case 2:
                System.out.println("Indique los horarios, mañana(N)");
                String horarioAE = sc.nextLine();
                break;                
            case 3:
                System.out.println("Indique los horarios, tarde(T)");
                String horarioAC = sc.nextLine();
                break;
            case 4:
                System.out.println("Indique los horarios, mañana(N) o tarde(T)");
                String horarioC = sc.nextLine();
                break;
            case 5:
                System.out.println("Indique los horarios, mañana(N)");
                String horarioNR = sc.nextLine();
                break;
            case 6:
                System.out.println("Indique los horarios, mañana(N) o tarde(T)");
                String horarioNU = sc.nextLine();
                break;
            case 7:
                System.out.println("Indique los horarios, mañana(N) o tarde(T)");
                String horarioF = sc.nextLine();
                break;
            case 8:
                System.out.println("Indique los horarios, tarde(T)");
                String horarioT = sc.nextLine(); 
                break;
            case 9:
                System.out.println("Indique los horarios, mañana(N) o tarde(T)");
                String horarioM = sc.nextLine();
                break;
        }  
        
        System.out.println("Desea regresar al menu: ");
        String opcionMenu = sc.nextLine();
        
        if(opcionMenu.equals("S")){
            programarCita();            
        }
        else{
            sc.close();
            System.exit(0);
        }
    }      
}
