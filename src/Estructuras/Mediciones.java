package Estructuras;

public class Mediciones {
    private double estatura;// Medida en metros
    private double peso;//Medida en kilogrammos
    private int freqCardiaca;// frecuencia cardiaca// Latidos por minuto
    //Presion arterial:
    private int presArterialSistolica;//  Sistolica// milimetros de mercurio
    private int presArterialDiastolica; // Diastolica// milimetros de mercurio
    private double grasaCorporal;//Porcentaje mediante formula
    private double masaMuscular;//Porcentaje mediante formula
    private double frequeCardiaca;// frecuencia cardiaca de trabajo x formula
    private double reCinturaCadera;//Relacion cintura cadera-formula

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
    public int getFreqCardiaca() {
        return freqCardiaca;
    }

    public void setFreqCardiaca(int freqCardiaca) {
        this.freqCardiaca = freqCardiaca;
    }

    public int getPresArterialSistolica() {
        return presArterialSistolica;
    }

    public void setPresArterialSistolica(int presArterialSistolica) {
        this.presArterialSistolica = presArterialSistolica;
    }

    public int getPresArterialDiastolica() {
        return presArterialDiastolica;
    }

    public void setPresArterialDiastolica(int presArterialDiastolica) {
        this.presArterialDiastolica = presArterialDiastolica;
    }
}