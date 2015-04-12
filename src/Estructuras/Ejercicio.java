package Estructuras;

public class Ejercicio {
    private String Nombre;
    private int Series;
    private int Repeticiones;
    private int duracion;
    private Maquina maquina;
    private double peso1;
    private double peso2; 
    private double peso3;
    private String tiempoDescanso;
    
    
    public Ejercicio(String Nombre, int Series, int Repeticiones, int duracion, Maquina maquina, double peso1, double peso2, double peso3, String tiempoDescanso) {
        this.Nombre = Nombre;
        this.Series = Series;
        this.Repeticiones = Repeticiones;
        this.duracion = 0;
        this.maquina = maquina;
        this.peso1 = peso1;
        this.peso2= peso2;
        this.peso3 = peso3;
        this.tiempoDescanso = tiempoDescanso;
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
  

    public double getPeso1() {
        return peso1;
    }

    public void setPeso1(double peso1) {
        this.peso1 = peso1;
    }

    public double getPeso2() {
        return peso2;
    }

    public void setPeso2(double peso2) {
        this.peso2 = peso2;
    }

    public double getPeso3() {
        return peso3;
    }

    public void setPeso3(double peso3) {
        this.peso3 = peso3;
    }

    public String getTiempoDescanso() {
        return tiempoDescanso;
    }

    public void setTiempoDescanso(String tiempoDescanso) {
        this.tiempoDescanso = tiempoDescanso;
    }

    @Override
    public String toString() {
        return "Ejercicio{" + "Nombre=" + Nombre + ", Series=" + Series + ", Repeticiones=" + Repeticiones + ", duracion=" + duracion + ", maquina=" + maquina + ", peso1=" + peso1 + ", peso2=" + peso2 + ", peso3=" + peso3 + ", tiempoDescanso=" + tiempoDescanso + '}';
    }
    
    
}
