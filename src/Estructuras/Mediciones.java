package Estructuras;

import static java.lang.Math.pow;
import java.time.LocalDateTime;

public class Mediciones {
    private double estatura;// Medida en metros
    private double peso;//Medida en kilogrammos
    private int frecCardiaca;// frecuencia cardiaca// Latidos por minuto
    //Presion arterial:
    private int presArterialSistolica;//  Sistolica// milimetros de mercurio
    private int presArterialDiastolica; // Diastolica// milimetros de mercurio
    //Por formulas
    private double grasaCorporal;//Porcentaje mediante formula
    private double masaMuscular;//Porcentaje mediante formula
    private double frecueCardiaca;// frecuencia cardiaca de trabajo x formula
    private double reCinturaCadera;//Relacion cintura cadera-formula
    
    //>>>>>>>>>>>>>>>>>>>>>>CIRCUNFERENCIAS CORPORALES<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    private double cuello;// centimetros
    private double bicepsDer;// Biceps derecho- centimetros
    private double bicepsIzq;//Biceps izquierdo- centimetros
    private double pectoral;//- centimetros
    private double espalda;//- centimetros
    private double Cintura1;// cintura alta- centimetros
    private double Cintura2;// cintura media- centimetros
    private double Cintura3;// cintura baja- centimetros
    private double cadera;//- centimetros
    private double musloDer; // muslo derecho- centimetros
    private double musloIzq; // muslo izquierdo- centimetros
    private double pantorrillaDer; // pantorrilla derecha- centimetros
    private double pantorrillaIzq; // pantorrilla izquierda- centimetros
    
    //>>>>>>>>>>>>>>>>>>>>>>PLIEGUES CUTANEOS<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    private double triceps;//Medida en milimetros
    private double subescapular;//Medida en milimetros
    private double abdomen;//Medida en milimetros
    private double iliaco;//Medida en milimetros
    private double muslo;//Medida en milimetros
    private double pantorrilla;//Medida en milimetros
    private double pectoralPliegue;// Disponible solo para hombre//Medida en milimetros
    
    private LocalDateTime fechaCreacion = LocalDateTime.now();

    public Mediciones(double estatura, double peso, int frecCardiaca, int presArterialSistolica, int presArterialDiastolica, 
            double cuello, double bicepsDer, double bicepsIzq, double pectoral, double espalda, double Cintura1, double Cintura2,
            double Cintura3, double cadera, double musloDer, double musloIzq, double pantorrillaDer, double pantorrillaIzq, 
            double triceps, double subescapular, double abdomen, double iliaco, double muslo, double pantorrilla,
            double pectoralPliegue,String sexo) {
        this.estatura = estatura;
        this.peso = peso;
        this.frecCardiaca = frecCardiaca;
        this.presArterialSistolica = presArterialSistolica;
        this.presArterialDiastolica = presArterialDiastolica;
        this.cuello = cuello;
        this.bicepsDer = bicepsDer;
        this.bicepsIzq = bicepsIzq;
        if(sexo == "Hombre"){
        this.pectoral = pectoral;}
        this.espalda = espalda;
        this.Cintura1 = Cintura1;
        this.Cintura2 = Cintura2;
        this.Cintura3 = Cintura3;
        this.cadera = cadera;
        this.musloDer = musloDer;
        this.musloIzq = musloIzq;
        this.pantorrillaDer = pantorrillaDer;
        this.pantorrillaIzq = pantorrillaIzq;
        this.triceps = triceps;
        this.subescapular = subescapular;
        this.abdomen = abdomen;
        this.iliaco = iliaco;
        this.muslo = muslo;
        this.pantorrilla = pantorrilla;
        this.pectoralPliegue = pectoralPliegue;
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
        return frecCardiaca;
    }

    public void setFreqCardiaca(int freqCardiaca) {
        this.frecCardiaca = freqCardiaca;
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
        return frecueCardiaca;
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
        this.frecueCardiaca = frequeCardiaca;
    }
    
    public void setReCinturaCadera(double reCinturaCadera) {
        this.reCinturaCadera = reCinturaCadera;
    }
    
    public double calcularGrasaCorpo(double cintura,double cuello,double altura,double cadera, String sexo){
            double result;
            if (sexo == "Masculino"){
                result = 495/(1.0324-0.19077*(Math.log(cintura-cuello))+0.15456*(Math.log(altura)))-450;
            }
            else{
                result = 495/(1.29579-0.35004*(Math.log(cintura + cadera -cuello))+0.22100*(Math.log(altura)))-450;
            }
            return result;
    }
    
    public double calcularMasaMuscular(double estatura,double peso){
            double result = (peso)/(pow(estatura,2));
            return result;
    }
    
    public int calcularFrecCardiaca(int edad){
            int result = 220 - edad;
            return result;
    }
    
    public double CalReCinturaCadera(double cinturaPeque,double cadera){
            return cinturaPeque/cadera;
    }
    
    
    
    //>>>>>>>>>>>>>>>>>>>>>>CIRCUNFERENCIAS CORPORALES<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    
    

    public double getCintura1() {
        return Cintura1;
    }

    public void setCintura1(double Cintura1) {
        this.Cintura1 = Cintura1;
    }

    public double getBicepsDer() {
        return bicepsDer;
    }

    public void setBicepsDer(double bicepsDer) {
        this.bicepsDer = bicepsDer;
    }

    public double getCintura3() {
        return Cintura3;
    }

    public void setCintura3(double Cintura3) {
        this.Cintura3 = Cintura3;
    }

    public double getCuello() {
        return cuello;
    }

    public void setCuello(double cuello) {
        this.cuello = cuello;
    }

    public double getBicepsIzq() {
        return bicepsIzq;
    }

    public void setBicepsIzq(double bicepsIzq) {
        this.bicepsIzq = bicepsIzq;
    }

    public double getPectoral() {
        return pectoral;
    }

    public void setPectoral(double pectoral) {
        this.pectoral = pectoral;
    }

    public double getEspalda() {
        return espalda;
    }

    public void setEspalda(double espalda) {
        this.espalda = espalda;
    }

    public double getCintura2() {
        return Cintura2;
    }

    public void setCintura2(double Cintura2) {
        this.Cintura2 = Cintura2;
    }

    public double getCadera() {
        return cadera;
    }

    public void setCadera(double cadera) {
        this.cadera = cadera;
    }

    public double getMusloDer() {
        return musloDer;
    }

    public void setMusloDer(double musloDer) {
        this.musloDer = musloDer;
    }

    public double getMusloIzq() {
        return musloIzq;
    }

    public void setMusloIzq(double musloIzq) {
        this.musloIzq = musloIzq;
    }

    public double getPantorrillaDer() {
        return pantorrillaDer;
    }

    public void setPantorrillaDer(double pantorrillaDer) {
        this.pantorrillaDer = pantorrillaDer;
    }

    public double getPantorrillaIzq() {
        return pantorrillaIzq;
    }

    public void setPantorrillaIzq(double pantorrillaIzq) {
        this.pantorrillaIzq = pantorrillaIzq;
    }  

    
    
    //>>>>>>>>>>>>>>>>>>>>>>PLIEGUES CUTANEOS<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    
     public double getTriceps() {
        return triceps;
    }

    public void setTriceps(double triceps) {
        this.triceps = triceps;
    }

    public double getSubescapular() {
        return subescapular;
    }

    public void setSubescapular(double subescapular) {
        this.subescapular = subescapular;
    }

    public double getAbdomen() {
        return abdomen;
    }

    public void setAbdomen(double abdomen) {
        this.abdomen = abdomen;
    }

    public double getIliaco() {
        return iliaco;
    }

    public void setIliaco(double iliaco) {
        this.iliaco = iliaco;
    }

    public double getMuslo() {
        return muslo;
    }

    public void setMuslo(double muslo) {
        this.muslo = muslo;
    }

    public double getPantorrilla() {
        return pantorrilla;
    }

    public void setPantorrilla(double pantorrilla) {
        this.pantorrilla = pantorrilla;
    }

    public double getPectoralPliegue() {
        return pectoralPliegue;
    }

    public void setPectoralPliegue(double pectoralPliegue) {
        this.pectoralPliegue = pectoralPliegue;
    }
   
    
}