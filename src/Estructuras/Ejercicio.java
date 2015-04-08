package Estructuras;

public class Ejercicio {
    private String Nombre;
    private int Series;
    private int Repeticiones;
    private int duracion;

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    private Maquina maquina;
    
    /// Ejercicios que no poseen maquina.
    
    public Ejercicio(){
        
    }
    
//    public Ejercicio(String pNombre, int pDuracion){
//        Nombre = pNombre;
//        duracion = pDuracion;
//         maquina = pMaquina;
//        Series = 0;
//        Repeticiones = 0;
//    }
    
    public Ejercicio(String pNombre, int pDuracion){
        Nombre = pNombre;
        duracion = pDuracion;
        maquina = new Maquina("Sin Especificar", "Ninguna", "Ninguno", "Ninguna");
        Series = 0;
        Repeticiones = 0;
    }
    
    public Ejercicio(String pNombre, int pSeries, int pRepeticiones){
        Nombre = pNombre;
        Series = pSeries;
        Repeticiones = pRepeticiones;
        maquina = new Maquina("Sin Especificar", "Ninguna", "Ninguno", "Ninguna");
        duracion = 0;
    }
    
//    public Ejercicio(String pNombre, int pSeries, int pRepeticiones, Maquina pMaquina){
//        Nombre = pNombre;
//        Series = pSeries;
//        Repeticiones = pRepeticiones;
//        maquina = pMaquina;
//        duracion = 0;
//    }


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


    public void setRepeticiones(int Repeticiones) {
        this.Repeticiones = Repeticiones;
    }


    public Maquina getMaquina() {
        return maquina;
    }


    public void setMaquina(Maquina maquina) {
        this.maquina = maquina;
    }
    
    
    
}
