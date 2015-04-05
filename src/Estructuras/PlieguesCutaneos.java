package Estructuras;

public class PlieguesCutaneos {
    private double triceps;//Medida en milimetros
    private double subescapular;//Medida en milimetros
    private double abdomen;//Medida en milimetros
    private double iliaco;//Medida en milimetros
    private double muslo;//Medida en milimetros
    private double pantorrilla;//Medida en milimetros
    private double pectoral;// Disponible solo para hombre//Medida en milimetros

    public PlieguesCutaneos(double triceps, double subescapular, double abdomen, double iliaco, double muslo, double pantorrilla, double pectoral) {
        this.triceps = triceps;
        this.subescapular = subescapular;
        this.abdomen = abdomen;
        this.iliaco = iliaco;
        this.muslo = muslo;
        this.pantorrilla = pantorrilla;
        this.pectoral = pectoral;
    }

    

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

    public double getPectoral() {
        return pectoral;
    }

    public void setPectoral(double pectoral) {
        this.pectoral = pectoral;
    }

    @Override
    public String toString() {
        return "PlieguesCutaneos{" + "triceps=" + triceps + ", subescapular=" + subescapular + ", abdomen=" + abdomen + ", iliaco=" + iliaco + ", muslo=" + muslo + ", pantorrilla=" + pantorrilla + ", pectoral=" + pectoral + '}';
    }
    
    
    
}
