package Estructuras;
import java.util.ArrayList;


public class Dia {
    
    private ArrayList <Rutina> rutina = new ArrayList<>();
    private String dia; 

    public Dia(String dia) {
        this.dia = dia;
    }
    
    public void AgregarRutina(Rutina ruti){
        rutina.add(ruti);
    }
 
    public void EliminarRutina(Rutina ruti){
        rutina.remove(ruti);
        
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }
    
}
