package Estructuras;

import java.util.ArrayList;

public class Almacen {
    public static ArrayList <Estructuras.Maquina> machine = new ArrayList<>();

    public Almacen() {
    }
    
    
    public void agregaMaquina(Maquina maquina){
        machine.add(maquina);
    }  
    
    public ArrayList getMaquina(){
        return machine;
    }  
  
}
