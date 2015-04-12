package Estructuras;

import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio {
    private String Nombre;
    private int Series;
    private int Repeticiones;
    private int duracion;
    private Maquina maquina;
    public ArrayList<String> listEjerciciosPartsuperior = new ArrayList<>(//Ejercicios de la parte superior del cuerpo(hombros,brazos,espalda,biceps,triceps...)
      Arrays.asList("press frontal con barra","pajaros","press arnold","elevaciones laterales , acostado de lado","encogimientos con mancuernas remo al cuello con barra Z",
                    "curl antebrazo supinacion frontales","curl antebrazo traseros","dominas","remo horizontal a una mano con mancuerna",
                    "remo sentado en polea con agarre abierto","remo con polea con remo cerrado","polea al pecho","curl biceps con barra recta",
                    "curl biceps en banco scoot","curl inclinado con mancuernas","curl concentradas","press banca","press banca inclinado",
                    "press banca declinado","aperturas con mancuernas","pullover","extension triceps en polea","press frances","fondos",
                    "Curl de muñecas con mancuerna","Curl de muñecas con barra","Extensión tríceps polea","Extensión individual tríceps polea",
                    "Extensión tríceps copa mancuerna individual","Extensión tríceps copa polea","Extensión individual tríceps polea invertido",
                    "Extensión individual tríceps (patada de mula)","Press para tríceps con barra","Press francés barra Z","Press francés mancuernas",
                    "Curl bíceps barra Z","Curl bíceps mancuernas","Curl bíceps mancuernas alterno","Curl bíceps martillo",
                    "Curl bíceps concentrado mancuerna","Curl bíceps polea","Curl bíceps banco Scott con barra","Curl bíceps banco Scott individua con mancuerna",
                    "Curl bíceps Prono con barra","Press hombro militar con barra","Press hombro militar con mancuernas","Press hombro militar con mancuernas alterno",
                    "Press hombro militar en máquina","Abducción lateral de hombro con mancuerna","Abducción lateral de hombro individual con mancuerna",
                    "Abducción posterior de hombro en máquina","Abducción posterior de hombro con mancuernas","Abducción posterior de hombro individual con mancuerna",
                    "Flexión Anterior de hombro mancuernas","Retracción escapular mancuernas","Retracción escapular máquina","Dominadas prono","Dominadas supino",
                    "Dominadas neutro","Polea espalda frontal con polea","Polea espalda supino con polea","Polea espalda frontal individual con polea","Pull down polea ",
                    "Remo espalda con polea","Remo espalda individual con polea","Remo espalda con polea alterno","Remo espalda con mancuerna individual",
                    "Remo espalda con mancuerna bilateral","Remo T para espalda ","Trapecio (Elevación de hombros) con barra","Trapecio (Elevación de hombros) con mancuernas"));
    
    public ArrayList<String> listEjerciciosPartMedia = new ArrayList<>(//Ejercicios de la parte media del cuerpo(abdominales,pecho)
      Arrays.asList("Abdomen regular","Abdomen con rodillas en 90", "Abdomen Oblicuo", "Abdomen con peso", "Abdomen completo"
                     , "Peck Deck (polea)", "Press pecho máquina vertical ", "Press pecho maquina plano" , "Aperturas pecho mancuernas en banca plana"
                     , "Aperturas pecho mancuernas en banca inclinada" , "Aperturas pecho con polea" , "Push Ups (regulares)", "Push Ups (rodillas)"
                     , "Press pecho plano con barra", "Press pecho inclinado con barra","Press pecho plano con mancuernas", "Press pecho inclinado con mancuernas"
                     , "Fondos en paralelas", "Pullover mancuerna", "Pullover barra"));
    
    public ArrayList<String> listEjerciciosPartBaja = new ArrayList<>(//Ejercicios de la parte baja del cuerpo(piesnas,muslo)
      Arrays.asList("sentadillas" , "extenciones cuadrices en maquina", "curl femoral en maquina", "zancadas", "gemelos de pie", "gemelos sentados"
              , "Saltos medios libres", "Saltos profundos libres", "Saltos medios en trampolín", "Saltos profundos en trampolín ", "Saltos en banco"
              , "Desplantes con saltos" , "Desplazamientos laterales libres", "Desplazamientos laterales con peso", "Joggin libre", "Joggin en trampolín"
              , "Jumping Jacks", "Burpees ", "Burpees media", "Push ups rusas", "Push ups rotación medial", "Push ups con gateo"
              , "Flexión plantar en máquina", "Flexión plantar mancuerna individual", "Flexión plantar libre", "Soleos Extensión de rodilla en máquina" ,"Extensión de rodilla individual en máquina" 
              , "Flexión de rodilla en máquina" ,"Flexión de rodilla individual en máquina" ,"Desplantes con mancuernas" ,"Elevación pélvica" ,
                "Desplantes con barra" , "Sentadilla libre" ,"Sentadilla libre individual" ,"¼ de sentadilla con mancuernas" ,"½ Sentadilla con mancuernas" ,
                "Sentadilla profunda mancuernas" ,"Sentadilla con barra" ,"Sentadilla en máquina Smith" ,"Step con mancuernas en banca"));
    
    public Ejercicio(String Nombre, int Series, int Repeticiones, int duracion, Maquina maquina) {
        this.Nombre = Nombre;
        this.Series = Series;
        this.Repeticiones = Repeticiones;
        this.duracion = 0;
        this.maquina = maquina;
    }

    public String getNombre() {
        return Nombre;
    }


    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }


    public int getSeries() {
        return Series;
    }


    public void setSeries(int Series) {
        this.Series = Series;
    }


    public int getRepeticiones() {
        return Repeticiones;
    }
    
    public int getDuracion() {
        return duracion;
    }


    public void setRepeticiones(int Repeticiones) {
        this.Repeticiones = Repeticiones;
    }


    public Maquina getMaquina() {
        return maquina;
    }


    public void setMaquina(Maquina maquina) {
        this.maquina = maquina;
    }
    
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
  
    public void verListSuper(){
        int i = 1;
        for(String ejer : listEjerciciosPartsuperior){
                System.out.println(i+ejer);
                i++;
        }
    }
    
    public void verListMedi(){
        int i = 1;
        for(String ejer : listEjerciciosPartMedia){
                System.out.println(i+ejer);
                i++;
        }
    }
    
    public void verListInferior(){
        int i = 1;
        for(String ejer : listEjerciciosPartBaja){
                System.out.println(i+ejer);
                i++;
        }
    }
    
}
