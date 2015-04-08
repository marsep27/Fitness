package Estructuras;

import java.util.ArrayList;

public class TipoEjercicio {
    public static ArrayList <Estructuras.Ejercicio> ejercicio = new ArrayList<>();
    
    public static void agregaEjercicio(Ejercicio exercise){
        ejercicio.add(exercise);
    }

    public static ArrayList DameExc(){
        return ejercicio;
    }
}
