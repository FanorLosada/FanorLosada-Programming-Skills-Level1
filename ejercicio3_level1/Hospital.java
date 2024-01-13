package ejercicio3_level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Hospital {

    Scanner sc = new Scanner(System.in);
    
    private int contadorCitas = 0;
    private int contadorMG = 0;
    private int contadorMG1 = 0;
    private int contadorMG2 = 0;
    private int contadorMG3 = 0;
    
    private int contadorAE = 0;
    private int contadorAE1 = 0;
    private int contadorAE2 = 0;
    private int contadorAE3 = 0;    
    
    private int contadorAC = 0;
    private int contadorAC1 = 0;
    private int contadorAC2 = 0;
    private int contadorAC3 = 0;    

    private int contadorC = 0;
    private int contadorC1 = 0;
    private int contadorC2 = 0;
    private int contadorC3 = 0;      
    
    private int contadorNE = 0;
    private int contadorNE1 = 0;
    private int contadorNE2 = 0;
    private int contadorNE3 = 0;     
    
    private int contadorNU = 0;
    private int contadorNU1 = 0;
    private int contadorNU2 = 0;
    private int contadorNU3 = 0;  
    
    private int contadorF = 0;
    private int contadorF1 = 0;
    private int contadorF2 = 0;
    private int contadorF3 = 0; 

    private int contadorT = 0;
    private int contadorT1 = 0;
    private int contadorT2 = 0;
    private int contadorT3 = 0; 

    private int contadorM = 0;
    private int contadorM1 = 0;
    private int contadorM2 = 0;
    private int contadorM3 = 0;

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
                
                int indiceMG = 1;
                
                for (String medicos : medicoMG) {
                    System.out.println(indiceMG+". "+medicos);
                    indiceMG++;
                }
                System.out.println("Indica el medico");
                int nombreMedicoMG = sc.nextInt();
                
                if(nombreMedicoMG == 1){
                    contadorMG1++;
                    contadorCitas++;
                }
                    
                else if(nombreMedicoMG == 2){
                    contadorMG2++;
                    contadorCitas++;
                }
                    
                else if(nombreMedicoMG == 3){
                    contadorMG3++;
                    contadorCitas++;
                }
                     
                if(contadorCitas == 2){
                    if(contadorMG1 == 2) System.out.println("No se puede ingresar dos veces un medico\nLos doctores"
                            + " disponibles son: Maria y Rocio");
                    else if(contadorMG2 == 2) System.out.println("No se puede ingresar dos veces un medico\nLos doctores"
                            + " disponibles son Raul y Rocio");
                    else if(contadorMG3 == 2) System.out.println("No se puede ingresar dos veces un medico\nLos doctores"
                            + " disponibles son Raul y Maria");
                    System.out.println("Vuelva a realizar el proceso");
                    programarCita();
                }
                else{
                   horario(opcionCita); 
                }
                
                 
            case 2:

                int indiceAE = 1;
                
                for (String medicos : medicoAE) {
                    System.out.println(indiceAE+". "+medicos);
                    indiceAE++;
                }
                System.out.println("Indica el medico");
                int nombreMedicoAE = sc.nextInt();
                
                if(nombreMedicoAE == 1){
                    contadorAE1++;
                    contadorCitas++;
                }
                    
                else if(nombreMedicoAE == 2){
                    contadorAE2++;
                    contadorCitas++;
                }
                    
                else if(nombreMedicoAE == 3){
                    contadorAE3++;
                    contadorCitas++;
                }
                     
                if(contadorCitas == 2){
                    if(contadorAE1 == 2) System.out.println("No se puede ingresar dos veces un medico\nLos doctores disponibles"
                            + " son Marco y Carlos");
                    else if(contadorAE2 == 2) System.out.println("No se puede ingresar dos veces un medico\nLos doctores"
                            + " disponibles son Sandra y Carlos");
                    else if(contadorAE3 == 2) System.out.println("No se puede ingresar dos veces un medico\nLos doctores"
                            + " disponibles son Sandra y Marco");
                }
                else{
                   horario(opcionCita); 
                }                
                
                
            case 3:
                
                int indiceAC = 1;
                
                for (String medicos : medicoAC) {
                    System.out.println(indiceAC+". "+medicos);
                    indiceAC++;
                }
                System.out.println("Indica el medico");
                int nombreMedicoAC = sc.nextInt();
                
                if(nombreMedicoAC == 1){
                    contadorAC1++;
                    contadorCitas++;
                }
                    
                else if(nombreMedicoAC == 2){
                    contadorAC2++;
                    contadorCitas++;
                }
                    
                else if(nombreMedicoAC == 3){
                    contadorAC3++;
                    contadorCitas++;
                }
                     
                if(contadorCitas == 2){
                    if(contadorAC1 == 2) System.out.println("No se puede ingresar dos veces un medico\nLos doctores disponibles"
                            + " son Manuel y Andres");
                    else if(contadorAC2 == 2) System.out.println("No se puede ingresar dos veces un medico\nLos doctores"
                            + " disponibles son Luisa Andres");
                    else if(contadorAC3 == 2) System.out.println("No se puede ingresar dos veces un medico\nLos doctores"
                            + " disponibles son Manuel y Luisa");
                }
                else{
                   horario(opcionCita); 
                }                

            case 4:
                
                                int indiceC = 1;
                
                for (String medicos : medicoC) {
                    System.out.println(indiceC+". "+medicos);
                    indiceC++;
                }
                System.out.println("Indica el medico");
                int nombreMedicoC = sc.nextInt();
                
                if(nombreMedicoC == 1){
                    contadorC1++;
                    contadorCitas++;
                }
                    
                else if(nombreMedicoC == 2){
                    contadorC2++;
                    contadorCitas++;
                }
                    
                else if(nombreMedicoC == 3){
                    contadorC3++;
                    contadorCitas++;
                }
                     
                if(contadorCitas == 2){
                    if(contadorC1 == 2) System.out.println("No se puede ingresar dos veces un medico\nLos doctores disponibles"
                            + " son Jose y Carlos");
                    else if(contadorC2 == 2) System.out.println("No se puede ingresar dos veces un medico\nLos doctores"
                            + " disponibles son Maria y Carlos"
                    );
                    else if(contadorC3 == 2) System.out.println("No se puede ingresar dos veces un medico\nLos doctores"
                            + " disponibles son Maria y Jose"
                    );
                }
                else{
                   horario(opcionCita); 
                }

                
            case 5:

                int indiceNE = 1;
                
                for (String medicos : medicoNE) {
                    System.out.println(indiceNE+". "+medicos);
                    indiceNE++;
                }
                System.out.println("Indica el medico");
                int nombreMedicoNE = sc.nextInt();
                
                if(nombreMedicoNE == 1){
                    contadorNE1++;
                    contadorCitas++;
                }
                    
                else if(nombreMedicoNE == 2){
                    contadorNE2++;
                    contadorCitas++;
                }
                    
                else if(nombreMedicoNE == 3){
                    contadorNE3++;
                    contadorCitas++;
                }
                     
                if(contadorCitas == 2){
                    if(contadorNE1 == 2) System.out.println("No se puede ingresar dos veces un medico\nLos doctores disponibles "
                            + "son Maria y Ana");
                    else if(contadorNE2 == 2) System.out.println("No se puede ingresar dos veces un medico\nLos doctores "
                            + "disponibles son Juan y Ana");
                    else if(contadorNE3 == 2) System.out.println("No se puede ingresar dos veces un medico\nLos doctores "
                            + "disponibles son Maria y Juan");
                }
                else{
                   horario(opcionCita); 
                }                
                
            case 6:

                int indiceNU = 1;
                
                for (String medicos : medicoNU) {
                    System.out.println(indiceNU+". "+medicos);
                    indiceNU++;
                }
                System.out.println("Indica el medico");
                int nombreMedicoNU = sc.nextInt();
                
                if(nombreMedicoNU == 1){
                    contadorNU1++;
                    contadorCitas++;
                }
                    
                else if(nombreMedicoNU == 2){
                    contadorNU2++;
                    contadorCitas++;
                }
                    
                else if(nombreMedicoNU == 3){
                    contadorNU3++;
                    contadorCitas++;
                }
                     
                if(contadorCitas == 2){
                    if(contadorNU1 == 2) System.out.println("No se puede ingresar dos veces un medico\nLos doctores disponibles "
                            + "son Jose y Raul");
                    else if(contadorNU2 == 2) System.out.println("No se puede ingresar dos veces un medico\nLos doctores "
                            + "disponibles son Rocio y Raul");
                    else if(contadorNU3 == 2) System.out.println("No se puede ingresar dos veces un medico\nLos doctores"
                            + "disponibles son Jose y Rocio");
                }
                else{
                   horario(opcionCita); 
                }                 
                
            case 7:

                int indiceF = 1;
                
                for (String medicos : medicoF) {
                    System.out.println(indiceF+". "+medicos);
                    indiceF++;
                }
                System.out.println("Indica el medico");
                int nombreMedicoF = sc.nextInt();
                
                if(nombreMedicoF == 1){
                    contadorF1++;
                    contadorCitas++;
                }
                    
                else if(nombreMedicoF == 2){
                    contadorF2++;
                    contadorCitas++;
                }
                    
                else if(nombreMedicoF == 3){
                    contadorF3++;
                    contadorCitas++;
                }
                     
                if(contadorCitas == 2){
                    if(contadorF1 == 2) System.out.println("No se puede ingresar dos veces un medico\nLos doctores disponibles "
                            + "son Carlos y Juana");
                    else if(contadorF2 == 2) System.out.println("No se puede ingresar dos veces un medico\nLos doctores "
                            + "disponibles son Pedro y Juana");
                    else if(contadorF3 == 2) System.out.println("No se puede ingresar dos veces un medico\nLos doctores "
                            + "disponibles son Pedro y Carlos");
                }
                else{
                   horario(opcionCita); 
                }                
     
            case 8:

                int indiceT = 1;
                
                for (String medicos : medicoT) {
                    System.out.println(indiceT+". "+medicos);
                    indiceT++;
                }
                System.out.println("Indica el medico");
                int nombreMedicoT = sc.nextInt();
                
                if(nombreMedicoT == 1){
                    contadorT1++;
                    contadorCitas++;
                }
                    
                else if(nombreMedicoT == 2){
                    contadorT2++;
                    contadorCitas++;
                }
                    
                else if(nombreMedicoT == 3){
                    contadorT3++;
                    contadorCitas++;
                }
                     
                if(contadorCitas == 2){
                    if(contadorT1 == 2) System.out.println("No se puede ingresar dos veces un medico\nLos doctores disponibles"
                            + " son Yuliana y Diego");
                    else if(contadorT2 == 2) System.out.println("No se puede ingresar dos veces un medico\n Los doctores"
                            + " disponibles son Laura y Diego");
                    else if(contadorT3 == 2) System.out.println("No se puede ingresar dos veces un medico\n Los doctores"
                            + " disponibles son Laura y Yuliana");
                }
                else{
                   horario(opcionCita); 
                }                

                
            case 9:
                
                int indiceM = 1;
                
                for (String medicos : medicoM) {
                    System.out.println(indiceM+". "+medicos);
                    indiceM++;
                }
                System.out.println("Indica el medico");
                int nombreMedicoM = sc.nextInt();
                
                if(nombreMedicoM == 1){
                    contadorM1++;
                    contadorCitas++;
                }
                    
                else if(nombreMedicoM == 2){
                    contadorM2++;
                    contadorCitas++;
                }
                    
                else if(nombreMedicoM == 3){
                    contadorM3++;
                    contadorCitas++;
                }
                     
                if(contadorCitas == 2){
                    if(contadorM1 == 2) System.out.println("No se puede ingresar dos veces un medico\nLos doctores disponibles "
                            + "son Manuel y Pedro");
                    else if(contadorM2 == 2) System.out.println("No se puede ingresar dos veces un medico\nLos doctores "
                            + "disponibles son Ana y Pedro");
                    else if(contadorM3 == 2) System.out.println("No se puede ingresar dos veces un medico\nLos doctores "
                            + "disponibles son Ana y Manuel");
                }
                else{
                   horario(opcionCita);     
        }
    }
}
                          
    public void horario(int opcionCita){
        
        switch (opcionCita) {
            case 1:
                System.out.println("Indique los horarios, mañana(M) o tarde(T)");
                String horarioMG = sc.nextLine();
                break;
            case 2:
                System.out.println("Indique los horarios, mañana(M)");
                String horarioAE = sc.nextLine();
                break;                
            case 3:
                System.out.println("Indique los horarios, tarde(T)");
                String horarioAC = sc.nextLine();
                break;
            case 4:
                System.out.println("Indique los horarios, mañana(M) o tarde(T)");
                String horarioC = sc.nextLine();
                break;
            case 5:
                System.out.println("Indique los horarios, mañana(M)");
                String horarioNR = sc.nextLine();
                break;
            case 6:
                System.out.println("Indique los horarios, mañana(M) o tarde(T)");
                String horarioNU = sc.nextLine();
                break;
            case 7:
                System.out.println("Indique los horarios, mañana(M) o tarde(T)");
                String horarioF = sc.nextLine();
                break;
            case 8:
                System.out.println("Indique los horarios, tarde(T)");
                String horarioT = sc.nextLine(); 
                break;
            case 9:
                System.out.println("Indique los horarios, mañana(M) o tarde(T)");
                String horarioM = sc.nextLine();
                break;
        }  
        
        System.out.println("Desea regresar al menu, Si(S),No(N): ");
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
