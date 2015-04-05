package Estructuras;

import java.time.LocalDateTime;

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
    private static PlieguesCutaneos pliegueCutaneo;
    private LocalDateTime fechaCreacion = LocalDateTime.now();

    public Mediciones(double estatura, double peso, int freqCardiaca, int presArterialSistolica, int presArterialDiastolica) {
        this.estatura = estatura;
        this.peso = peso;
        this.freqCardiaca = freqCardiaca;
        this.presArterialSistolica = presArterialSistolica;
        this.presArterialDiastolica = presArterialDiastolica;
    }

    
    
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

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public double getGrasaCorporal() {
        return grasaCorporal;
    }

    public double getMasaMuscular() {
        return masaMuscular;
    }

    public double getFrequeCardiaca() {
        return frequeCardiaca;
    }

    public double getReCinturaCadera() {
        return reCinturaCadera;
    }

    public void setGrasaCorporal(double grasaCorporal) {
        this.grasaCorporal = grasaCorporal;
    }

    public void setMasaMuscular(double masaMuscular) {
        this.masaMuscular = masaMuscular;
    }

    public void setFrequeCardiaca(double frequeCardiaca) {
        this.frequeCardiaca = frequeCardiaca;
    }
    
    public void setReCinturaCadera(double reCinturaCadera) {
        this.reCinturaCadera = reCinturaCadera;
    }
    
    public void agregarMedicionesPliegCutaneos(double triceps, double subescapular, double abdomen, double iliaco, double muslo, double pantorrilla, double pectoral){
        PlieguesCutaneos newpliegueCutaneo = new PlieguesCutaneos(triceps,subescapular,abdomen,iliaco,muslo,pantorrilla,pectoral);
    }
    
    public void agregarMediciCircunCorporales(double cuello, double bicepsDer, double bicepsIzq, double pectoral, double espalda, double Cintura1, double Cintura2, double Cintura3, double cadera,
                                                double musloDer, double musloIzq, double pantorrillaDer, double pantorrillaIzq,String sexo){
        CircunferenciasCorporales newCircuCorpo = new CircunferenciasCorporales(cuello,bicepsDer,bicepsIzq,pectoral,espalda,
                                                  Cintura1,Cintura2,Cintura3,cadera, musloDer,musloIzq,pantorrillaDer,pantorrillaIzq,sexo);
    }
}