package Estructuras;

import java.util.ArrayList;

public class Bodega {
    public static ArrayList <Estructuras.Maquina> machine = new ArrayList<>();
    
    public static void agregaEjercicio(Maquina mach){
        machine.add(mach);
    }  
    
    public static ArrayList DameMachine(){
        return machine;
    }  
  
}
