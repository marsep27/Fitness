package Estructuras;

import java.util.ArrayList;

public class Semana {
    public static ArrayList<ArrayList<Dia>> Semanal = new ArrayList<>();
    
    public void Agregar(ArrayList<Dia> dia){
        Semanal.add(dia);
    }
}
