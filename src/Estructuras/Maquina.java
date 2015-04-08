package Estructuras;

public class Maquina {
    private String Nombre;
    private String AreaTrabajada;
    private String Tipo;
    private String Descripcion;
    
    public Maquina(){
        
    }
    
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


