package Estructuras;

import java.util.ArrayList;
import java.util.Arrays;

/*
ESPALDA/
1. Dominadas prono
2. Dominadas supino
3. Dominadas neutro
4. Polea espalda frontal con polea
5. Polea espalda supino con polea
6. Polea espalda frontal individual con polea
7. Pull down polea 
8. Remo espalda con polea
9. Remo espalda individual con polea
10. Remo espalda con polea alterno
11. Remo espalda con mancuerna individual
12. Remo espalda con mancuerna bilateral
13. Remo T para espalda 
14. Trapecio (Elevación de hombros) con barra
15. Trapecio (Elevación de hombros) con mancuernas
PECHO
1. Peck Deck (polea)
2. Press pecho máquina vertical 
3. Press pecho maquina plano
4. Aperturas pecho mancuernas en banca plana
5. Aperturas pecho mancuernas en banca inclinada
6. Aperturas pecho con polea
7. Push Ups (regulares)
8. Push Ups (rodillas)
9. Press pecho plano con barra
10. Press pecho inclinado con barra
11. Press pecho plano con mancuernas
12. Press pecho inclinado con mancuernas
13. Fondos en paralelas
14. Pullover mancuerna
15. Pullover barra
MUSLO
1. Extensión de rodilla en máquina
2. Extensión de rodilla individual en máquina
3. Flexión de rodilla en máquina
4. Flexión de rodilla individual en máquina
5. Desplantes con mancuernas
6. Elevación pélvica
7. Desplantes con barra
8. Sentadilla libre
9. Sentadilla libre individual
10. ¼ de sentadilla con mancuernas
11. ½ Sentadilla con mancuernas
12. Sentadilla profunda mancuernas
13. Sentadilla con barra
14. Sentadilla en máquina Smith
15. Step con mancuernas en banca
HOMBRO/
1. Press hombro militar con barra
2. Press hombro militar con mancuernas
3. Press hombro militar con mancuernas alterno
4. Press hombro militar en máquina
5. Abducción lateral de hombro con mancuerna
6. Abducción lateral de hombro individual con mancuerna 
7. Abducción posterior de hombro en máquina
8. Abducción posterior de hombro con mancuernas
9. Abducción posterior de hombro individual con mancuerna
10. Flexión Anterior de hombro mancuernas
11. Retracción escapular mancuernas
12. Retracción escapular máquina
BICEPS-BRAZOS/
1. Curl bíceps barra Z
2. Curl bíceps mancuernas
3. Curl bíceps mancuernas alterno
4. Curl bíceps martillo
5. Curl bíceps concentrado mancuerna
6. Curl bíceps polea
7. Curl bíceps banco Scott con barra
8. Curl bíceps banco Scott individua con mancuerna
9. Curl bíceps Prono con barra
TRICEPS-BRAZOS/
1. Extensión tríceps polea
2. Extensión individual tríceps polea 
3. Extensión tríceps copa mancuerna individual
4. Extensión tríceps copa polea
5. Extensión individual tríceps polea invertido
6. Extensión individual tríceps (patada de mula)
7. Press para tríceps con barra
8. Press francés barra Z
9. Press francés mancuernas
GASTROGNEMIOS-PIERNAS
1. Flexión plantar en máquina
2. Flexión plantar mancuerna individual
3. Flexión plantar libre
4. Soleos
ANTEBRAZO/
1. Curl de muñecas con mancuerna
2. Curl de muñecas con barra
PLIOMETRÍA-PIERNAS
1. Saltos medios libres
2. Saltos profundos libres
3. Saltos medios en trampolín
4. Saltos profundos en trampolín 
5. Saltos en banco
6. Desplantes con saltos
7. Desplazamientos laterales libres
8. Desplazamientos laterales con peso
9. Joggin libre
10. Joggin en trampolín
11. Jumping Jacks
12. Burpees 
13. Burpees media
14. Push ups rusas
15. Push ups rotación medial
16. Push ups con gateo
ABDOMEN
1. Abdomen regular
2. Abdomen con rodillas en 90
3. Abdomen Oblicuo
4. Abdomen con peso
5. Abdomen completo


PECHO-TRICEPS/
press banca
press banca inclinado
press banca declinado
aperturas con mancuernas
pullover
extension triceps en polea
press frances
fondos

ESPALDA-BICEPS/
dominas
remo horizontal a una mano con mancuerna
remo sentado en polea con agarre abierto
remo con polea con remo cerrado
polea al pecho
curl biceps con barra recta
curl biceps en banco scoot
curl inclinado con mancuernas
curl concentradas

HOMBROS-ANTEBRAZOS/
press frontal con barra
pajaros     2X10
press arnold
elevaciones laterales , acostado de lado    2X10
encogimientos con mancuernas remo al cuello con barra "Z"   2X10
curl antebrazo supinacion "frontales"   4X10
curl antebrazo "traseros"   4X10

PIERNAS
sentadillas 3x8
extenciones cuadrices en maquina    3x8
curl femoral en maquina    3x8
zancadas    3x10
gemelos de pie  2x10
gemelos sentados  2x10
*/

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
    public ArrayList<String> listEjerciciosPartMedia = new ArrayList<>(//Ejercicios de la parte media del cuerpo(abdominales,)
      Arrays.asList());
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
  
    
    
}
