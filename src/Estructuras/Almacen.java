package Estructuras;

import java.util.ArrayList;

public class Almacen {
    public static ArrayList <Estructuras.Maquina> machine = new ArrayList<>();
    
    public static void agregaMaquina(Maquina maquina){
        machine.add(maquina);
    }  
    
    public static ArrayList DameMachine(){
        return machine;
    }  
  
}
