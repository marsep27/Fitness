package Estructuras;

import java.util.ArrayList;
import java.util.Arrays;

/*
Caminadora
Una persona de 150 lb (68 kg) puede quemar 100 calorías con un ejercicio moderadamente complejo de 30 minutos. Piernas

Elíptica
piernas-brazos.Una persona de 150 lb (68 kg) puede quemar 297 calorías durante un ejercicio de 30 minutos. 


Bicicleta recostada
piernas(pantorrillas y los muslos)

Bicicleta de spinning
Si haces spinning en tu gimnasio local, prepárate para sudar.

Mesa de pilates
Estirar y tonificar tu cuerpo. Aunque quema normalmente alrededor de 100 calorías en 30 minutos, es más que sólo un ejercicio cardiovascular,abdominales, la parte interna de los muslos y la parte posterior

Prensa de piernas
Piernas

Remadora
Además de quemar casi 200 calorías en un ejercicio de 30 minutos en una persona de 150 lb (68 kg), también fortalece la espalda, las piernas y los brazos gracias a la acción remadora multipropósito.

Escaladora
piernas más firmes, glúteos y pantorrillas-que sólo obtendrías con innumerables sentadillas, balanceos, y levantamientos de piernas.

Mini trampolín
Te divertirás tanto que no te darás cuenta de que quemas 120 calorías mientras rebotas.

Pelota de balance
Úsala para hacer abdominales, siéntate en ella durante el día para mejorar la postura, o para estabilizarte mientras haces ejercicios avanzados.
*/
public class Maquina {
    private String Nombre;
    private String AreaTrabajada;
    private String Tipo;
    private String Descripcion;
    public ArrayList<String> listMaquinas = new ArrayList<>(//Maquinas del gimnacio
      Arrays.asList("Pelota de balance","Mini trampolín","Escaladora","Remadora","Prensa de piernas","Mesa de pilates"
                    ,"Bicicleta de spinning","Bicicleta recostada","Elíptica","Caminadora","Sin maquina","Mancuernas","Ligas"));
    
    public Maquina(String pNombre, String pArea, String pTipo, String pDescripcion){
        Nombre = pNombre;
        AreaTrabajada = pArea;
        Tipo = pTipo;
        Descripcion = pDescripcion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getAreaTrabajada() {
        return AreaTrabajada;
    }

    public void setAreaTrabajada(String AreaTrabajada) {
        this.AreaTrabajada = AreaTrabajada;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }    
   
}


