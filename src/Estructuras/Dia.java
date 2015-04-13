package Estructuras;
import java.util.ArrayList;
import java.util.Arrays;


public class Dia {
    
    private ArrayList <Ejercicio> rutina = new ArrayList<>();
    private String dia; 
    Ejercicio newEjer;

    public Dia(String dia) {
        this.dia = dia;
    }
    
    public void AgregarEjercicio(String Nombre, int Series, int Repeticiones, int duracion, Maquina maquina, double peso1, double peso2, double peso3, String tiempoDescanso){//Agrega un ejercicio al dia
        newEjer = new Ejercicio(Nombre,Series,Repeticiones,duracion, maquina,peso1,peso2,peso3,tiempoDescanso);
        rutina.add(newEjer);
    }
 
    public void EliminarEjercicio(Ejercicio ejer){//Elimina un ejercicio del dia
        rutina.remove(ejer);
        
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }
    
    public void verDia(){
        System.out.println(dia);
            for (Ejercicio ejer : rutina) {
                   ejer.verEjercicio();
        }
    }
    
    public void eliminarDia(){
        rutina.clear();
    }
}
