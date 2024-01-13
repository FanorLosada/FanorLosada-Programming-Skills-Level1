package ejercicio1.level1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Equipo {
    
    Scanner sc = new Scanner(System.in);
     
    //Bruno Fernandez
    public static final String NOMBRE_B = "Bruno Fernandez";
    public static final int GOLES_B = 5;
    public static final int VELOCIDAD_B = 6;
    public static final int ASISTENCIA_B = 9;
    public static final int PRECISION_PASE_B= 10;
    public static final int INVOLUCRAMIENTO_DEFENSIVO_B = 3;
    
    //Ramush
    public static final String NOMBRE_R = "Rasmus Hojlund";
    public static final int GOLES_R = 12;
    public static final int VELOCIDAD_R = 8;
    public static final int ASISTENCIA_R = 2;
    public static final int PRECISION_PASE_R = 6;
    public static final int INVOLUCRAMIENTO_DEFENSIVO_R = 2;

    //Harry Maguire
    public static final String NOMBRE_H = "Harry Maguire";
    public static final int GOLES_H = 1;
    public static final int VELOCIDAD_H= 5;
    public static final int ASISTENCIA_H = 1;
    public static final int PRECISION_PASE_H = 7;
    public static final int INVOLUCRAMIENTO_DEFENSIVO_H = 9;

    //Alejandro Garnacho
    public static final String NOMBRE_A = "Alejandro Garnacho";
    public static final int GOLES_A = 12;
    public static final int VELOCIDAD_A = 8;
    public static final int ASISTENCIA_A = 2;
    public static final int PRECISION_PASE_A = 6;
    public static final int INVOLUCRAMIENTO_DEFENSIVO_A = 2;    
    
    //Mason
    public static final String NOMBRE_M = "Mason Mount";
    public static final int GOLES_M = 2;
    public static final int VELOCIDAD_M = 6;
    public static final int ASISTENCIA_M = 4;
    public static final int PRECISION_PASE_M = 8;
    public static final int INVOLUCRAMIENTO_DEFENSIVO_M = 1;    
    
    public static final int[] GOLES = {GOLES_B, GOLES_R, GOLES_H, GOLES_A, GOLES_M};
    public static final int[] VELOCIDAD = {VELOCIDAD_B, VELOCIDAD_R, VELOCIDAD_H, VELOCIDAD_A, VELOCIDAD_M};
    public static final int[] ASISTENCIA = {ASISTENCIA_B, ASISTENCIA_R, ASISTENCIA_H, ASISTENCIA_A, ASISTENCIA_M};
    public static final int[] PRECISION_PASE = {PRECISION_PASE_B, PRECISION_PASE_R, PRECISION_PASE_H, PRECISION_PASE_A, PRECISION_PASE_M};
    public static final int[] INVOLUCRAMIENTO_DEFENSIVO = {INVOLUCRAMIENTO_DEFENSIVO_B, INVOLUCRAMIENTO_DEFENSIVO_R, INVOLUCRAMIENTO_DEFENSIVO_H, INVOLUCRAMIENTO_DEFENSIVO_A, INVOLUCRAMIENTO_DEFENSIVO_M};
    
    
//    public static final String BrunoFernandez = "Goles: 5\nPuntos velocidad: 6\nPuntos asistencia: 9\nPuntos precisión de pase: 10\nInvolucramiento defensivo: 3";
//    public static final String RasmusHojlund = "Goles: 12\nPuntos velocidad: 8\nPuntos asistencia: 2\nPuntos precisión de pase: 6\nInvolucramiento defensivo: 2";
//    public static final String HarryMaguire = "Goles: 1\nPuntos velocidad: 5\nPuntos asistencia: 1\nPuntos precisión de pase: 7\nInvolucramiento defensivo: 9";
//    public static final String AlejandroGarnacho = "Goles: 8\nPuntos velocidad: 7\nPuntos asistencia: 8\nPuntos precisión de pase: 6\nInvolucramiento defensivo: 0";
//    public static final String MasonMount = "Goles: 2\nPuntos velocidad: 6\nPuntos asistencia: 4\nPuntos precisión de pase: 8\nInvolucramiento defensivo: 1";    
    
    public void Menu(){
         
        System.out.println("Indica lo que quieres hacer ");
        System.out.println("1. Revisar jugador ");
        System.out.println("2. Comparar dos jugadores ");
        System.out.println("3. Identificar el jugador más rápido ");
        System.out.println("4. Identificar al máximo goleador ");
        System.out.println("5. Identificar al jugador con más asistencias ");
        System.out.println("6. Identificar al jugador con la mayor precisión de pases ");
        System.out.println("7. Identificar al jugador con más involucramientos defensivos ");
        System.out.println("8. Salir");
        
        int opcion = sc.nextInt();
              
        switch(opcion){
            case 1:
                descripcionJugador();
            case 2:
                compararJugadores();
            case 3:
                jugadorMasRapido();
            case 4:
                maximoGoleador();
            case 5:
                masAsistencias();
            case 6:
                masPrecisionPases();
            case 7:
                masInvolucramientoDefensivo();
            case 8:
                sc.close();
                System.exit(0);
            default: 
                break; 
               
        }       
    }

    public void descripcionJugador() {
        
        while (true) {
            System.out.println("\nMenú de Perfiles de Jugadores:");
            System.out.println("1. Bruno Fernandez 8");
            System.out.println("2. Rasmus Hojlund 11");
            System.out.println("3. Harry Maguire 5");
            System.out.println("4. Alejandro Garnacho 17");
            System.out.println("5. Mason Mount 7");
            System.out.println("6. Menu");

            System.out.print("Seleccione el número de camiseta: ");
            int opcion = sc.nextInt();

            if (opcion == 6) {
                Menu();
            } 

            mostrarPerfilJugador(opcion);
        }
    }
      
    public void compararJugadores(){
        
        while (true) {
            System.out.println("\nMenú de Perfiles de Jugadores:");
            System.out.println("1. Bruno Fernandez 8");
            System.out.println("2. Rasmus Hojlund 11");
            System.out.println("3. Harry Maguire 5");
            System.out.println("4. Alejandro Garnacho 17");
            System.out.println("5. Mason Mount 7");
            System.out.println("6. Menu");        
            
            System.out.println("Indique dos jugadores a comparar(ingrese numero de camisetas)");
            int camisetaUno = sc.nextInt();
            int camisetaDos = sc.nextInt();
            
            if (camisetaUno == 6 || camisetaDos==6) {
                Menu();
            }
            
            mostrarPerfilJugadores(camisetaUno, camisetaDos);
        }    
    }
    
    public void mostrarPerfilJugadores(int camisetaUno, int camisetaDos) {
        String perfil1 = obtenerInformacionJugador(camisetaUno);
        String perfil2 = obtenerInformacionJugador(camisetaDos);
        if (perfil1 != null && perfil2 != null) {
            System.out.println("\nPerfil del jugador " + camisetaUno + ":\n" + perfil1);
            System.out.println("\nPerfil del jugador " + camisetaDos + ":\n" + perfil2);
        } else {
            System.out.println("Jugador con número de camiseta " + camisetaUno +" "+ camisetaDos + " no encontrados.");
        }
    } 
    

    // Método para obtener y mostrar el perfil del jugador
    public void mostrarPerfilJugador(int numeroCamiseta) {
        String perfil = obtenerInformacionJugador(numeroCamiseta);
        if (perfil != null) {
            System.out.println("\nPerfil del jugador " + numeroCamiseta + ":\n" + perfil);
        } else {
            System.out.println("Jugador con número de camiseta " + numeroCamiseta + " no encontrado.");
        }
    }    
    
    public String obtenerInformacionJugador(int numeroCamiseta) {
        switch (numeroCamiseta) {
            case 8:
                return "Nombre: "+NOMBRE_B +"\nGoles: "+ GOLES_B +"\nPuntos velocidad: "+ VELOCIDAD_B +
                       "\nPuntos asistencia: "+ASISTENCIA_B +"\nPuntos precision de pase: "+
                        PRECISION_PASE_B +"\ninvolucramiento defensivo: "+INVOLUCRAMIENTO_DEFENSIVO_B;   
            case 11:
                return "Nombre: "+NOMBRE_R +"\nGoles: "+ GOLES_R +"\nPuntos velocidad: "+ VELOCIDAD_R +
                       "\nPuntos asistencia: "+ASISTENCIA_R +"\nPuntos precision de pase: "+
                        PRECISION_PASE_R +"\ninvolucramiento defensivo: "+INVOLUCRAMIENTO_DEFENSIVO_R;                
            case 5:
                    return "Nombre: "+NOMBRE_H +"\nGoles: "+ GOLES_H +"\nPuntos velocidad: "+ VELOCIDAD_H+
                       "\nPuntos asistencia: "+ASISTENCIA_H +"\nPuntos precision de pase: "+
                        PRECISION_PASE_H +"\ninvolucramiento defensivo: "+INVOLUCRAMIENTO_DEFENSIVO_H;                

            case 17:
                    return "Nombre: "+NOMBRE_A +"\nGoles: "+ GOLES_A +"\nPuntos velocidad: "+ VELOCIDAD_A+
                       "\nPuntos asistencia: "+ASISTENCIA_A +"\nPuntos precision de pase: "+
                        PRECISION_PASE_A +"\ninvolucramiento defensivo: "+INVOLUCRAMIENTO_DEFENSIVO_A;                
            case 7:
                    return "Nombre: "+NOMBRE_M +"\nGoles: "+ GOLES_M +"\nPuntos velocidad: "+ VELOCIDAD_M+
                       "\nPuntos asistencia: "+ASISTENCIA_M +"\nPuntos precision de pase: "+
                        PRECISION_PASE_M +"\ninvolucramiento defensivo: "+INVOLUCRAMIENTO_DEFENSIVO_M;   
            default:
                return null;
        }
    }

    
    public void jugadorMasRapido() {

        int velocidadMayor = 0;

        // Buscar la velocidad más alta
        for (int velocidad : VELOCIDAD) {
            velocidadMayor = Math.max(velocidadMayor, velocidad);
        }

        // Mapa para asociar velocidades con nombres de jugadores
        Map<Integer, String> mapaVelocidades = new HashMap<>();
        mapaVelocidades.put(VELOCIDAD_R, NOMBRE_R);
        mapaVelocidades.put(VELOCIDAD_B, NOMBRE_B);
        mapaVelocidades.put(VELOCIDAD_H, NOMBRE_H);
        mapaVelocidades.put(VELOCIDAD_A, NOMBRE_A);
        mapaVelocidades.put(VELOCIDAD_M, NOMBRE_M);

        // Imprimir el jugador más rápido
        System.out.println("El jugador es: " + mapaVelocidades.get(velocidadMayor));
    }    
        
    public void maximoGoleador(){
    
        int goleadorMayor = 0;
               
        for(int gol : GOLES){
            goleadorMayor = Math.max(goleadorMayor,gol);
        }
        
        Map<Integer, String> mapaGoles = new HashMap<>();
        mapaGoles.put(GOLES_B, NOMBRE_B);
        mapaGoles.put(GOLES_R, NOMBRE_R);
        mapaGoles.put(GOLES_H, NOMBRE_H);
        mapaGoles.put(GOLES_A, NOMBRE_A);
        mapaGoles.put(GOLES_M, NOMBRE_M);
        
        
        System.out.println("El jugador con mas goles es: "+mapaGoles.get(goleadorMayor));
        
        
    }

    public void masAsistencias(){
    
        int asistenciasMayor = 0; 
    
        for (int asistencia: ASISTENCIA) {
            asistenciasMayor = Math.max(asistenciasMayor, asistencia);
        }
        
        Map<Integer, String> mapaGoles = new HashMap<>();
        mapaGoles.put(ASISTENCIA_B, NOMBRE_B);
        mapaGoles.put(ASISTENCIA_R, NOMBRE_R);
        mapaGoles.put(ASISTENCIA_H, NOMBRE_H);
        mapaGoles.put(ASISTENCIA_A, NOMBRE_A);
        mapaGoles.put(ASISTENCIA_M, NOMBRE_M);
        
        System.out.println("El mayor asistente es: "+mapaGoles.get(asistenciasMayor));
        
    }    
    
    public void masPrecisionPases(){
    
        int mayorPrecisionP = 0; 
    
        for(int precision: PRECISION_PASE){
            mayorPrecisionP = Math.max(mayorPrecisionP, precision);
        }
        
        Map<Integer, String> mapaPrecision= new HashMap<>();
        mapaPrecision.put(PRECISION_PASE_B, NOMBRE_B);
        mapaPrecision.put(PRECISION_PASE_R, NOMBRE_R);
        mapaPrecision.put(PRECISION_PASE_H, NOMBRE_H);
        mapaPrecision.put(PRECISION_PASE_A, NOMBRE_A);
        mapaPrecision.put(PRECISION_PASE_M, NOMBRE_M);
        
        
        System.out.println("El valor con mayor precision de pase es: "+mapaPrecision.get(mayorPrecisionP));
    }

    
    public void masInvolucramientoDefensivo(){
    
        int mayorInvolucramiento = 0; 
    
        for(int involucramientoD: INVOLUCRAMIENTO_DEFENSIVO){
            mayorInvolucramiento = Math.max(mayorInvolucramiento,involucramientoD);
        }
        
        Map<Integer, String> mapaInvolucramiento = new HashMap<>();
        mapaInvolucramiento.put(INVOLUCRAMIENTO_DEFENSIVO_B, NOMBRE_B);
        mapaInvolucramiento.put(INVOLUCRAMIENTO_DEFENSIVO_R, NOMBRE_R);
        mapaInvolucramiento.put(INVOLUCRAMIENTO_DEFENSIVO_H, NOMBRE_H);
        mapaInvolucramiento.put(INVOLUCRAMIENTO_DEFENSIVO_A, NOMBRE_A);
        mapaInvolucramiento.put(INVOLUCRAMIENTO_DEFENSIVO_M, NOMBRE_M);
        
        System.out.println("El jugador con mayor involucramiento es: "+mapaInvolucramiento.get(mayorInvolucramiento)); 
    }       
}


