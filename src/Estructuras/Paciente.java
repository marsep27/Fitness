/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Estructuras;
/**
 *
 * @author Valeria
 */
public class Paciente {
    private String nombre;
    private String sexo;
    private String numIdentificacion;
    private String telefono;
    private String correoElectronico;
    private String fechaNacimiento;//NO se si sera string
    public int cantProgramas = 0;
    public int cantMediciones = 0;

    public Paciente(String pNombre, String pSexo, String pNumIdentificacion, String pTelefono, String pCorreoElectrónico, String pFechaNacimiento) {
        this.nombre = pNombre;
        this.sexo = pSexo;
        this.numIdentificacion = pNumIdentificacion;
        this.telefono = pTelefono;
        this.correoElectronico = pCorreoElectrónico;
        this.fechaNacimiento = pFechaNacimiento; 
        
    }

    public String getCorreoElectrónico() {
        return correoElectronico;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTeléfono() {
        return telefono;
    }

    public String getSexo() {
        return sexo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    
    
    public int getCantMediciones() {
        return cantMediciones;
    }

    public int getCantProgramas() {
        return cantProgramas;
    }
    
    
    public String getNumIdentificacion() {
        return numIdentificacion;
    }

    public void setCorreoElectrónico(String correoElectrónico) {
        this.correoElectronico = correoElectrónico;
    }

    public void setNumIdentificacion(String numIdentificacion) {
        this.numIdentificacion = numIdentificacion;
    }

    public void setTeléfono(String teléfono) {
        this.telefono = teléfono;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public void obMedicion(){
        System.out.println("Lista de mediciones: ");
        cantMediciones += 1;
    }
    
    public void obPrograma(){
        cantProgramas+= 1;
    }
    
    public void verPaciente(){
        System.out.println("********************************************");
        System.out.println("1.Nombre: "+ nombre);
        System.out.println("2.Numero de identificacion: "+ numIdentificacion);
        System.out.println("3.Numero de telefono: "+ telefono);
        System.out.println("4.Correo electronico: "+ correoElectronico);
        System.out.println("5.Fecha de nacimiento: "+ fechaNacimiento);
        System.out.println("6.Programas: ");
        System.out.println("7.Mediciones: ");
    }
    
    
}


