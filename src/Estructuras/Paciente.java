/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Estructuras;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

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
    public ArrayList<Paciente> listaPacientes = new ArrayList();
    public ArrayList<String> num = new ArrayList<>(
    Arrays.asList("0","1", "2", "3","4","5","6","7","8","9","-","(",")"));
    public ArrayList<String> cedula = new ArrayList<>(
    Arrays.asList("0","1", "2", "3","4","5","6","7","8","9","-"));
    public ArrayList<String> correo = new ArrayList<>(
    Arrays.asList("@","."));
    public ArrayList<String> listCedulas = new ArrayList();
    public int cantProgramas = 0;
    public int cantMediciones = 0;

    public Paciente(String pNombre, String pSexo, String pNumIdentificacion, String pTelefono, String pCorreoElectrónico, String pFechaNacimiento) {
        this.nombre = pNombre;
        this.sexo = pSexo;
        this.numIdentificacion = pNumIdentificacion;
        this.telefono = pTelefono;
        this.correoElectronico = pCorreoElectrónico;
        this.fechaNacimiento = pFechaNacimiento; 
        listCedulas.add(numIdentificacion);
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
    
    
    public boolean verificarPaciente(String numCedula){
        boolean cond = false;
        Iterator<String> i = listCedulas.iterator();//Iterador para recorrer la lista de pacientes
                while(i.hasNext()){//Avanza un elemento en cada iteracion en la lista
                    String elem = i.next();//Guardamos el elemento que contenga el iterador
                    if(numCedula.equals(elem)){//Comparamos cada numero de ced con el num ced entrante
                        cond = true;
                        System.out.println("El paciente ya existe");
                        }            
                }return cond;
    }
    public boolean vericarCedula(String numCedula){
        boolean cond = false;//Condicion para determinar si cumple con las regleas
            for (int j = 0; j< numCedula.length(); j++){//Ciclo para recorre cada elemento del string
                String var = numCedula.substring(j, j+1);//En un intervalo de indices nos devuelve el elemento en  medio
                Iterator<String> i = cedula.iterator();//Iterador para recorrer la lista de numeros y signos
                while(i.hasNext()){//Avanza un elemento en cada iteracion en la lista
                    String elem = i.next();//Guardamos el elemento que extre el iterador
                    if(var.equals(elem)){//Comparamos cada elemento de la lista con cada elemento del numero entrante
                        cond = true;
                    }
                }
                if(cond != true){//Si el numero no coincide al menos con un elemento de la lista 
                System.out.println("Cedula invalida"); //el num de telefono no es valido.
                return false;
                }
            }
            return true;//Si recorre todo el numero y esta bien retorna true
    }
    
    public boolean vericarTel(String telefono){
        boolean cond = false;// Si el numero esta bien
        for (int j = 0; j< telefono.length(); j++){//Ciclo para recorre cada elemento del string
            String var = telefono.substring(j, j+1);//En un intervalo de indices nos devuelve el elemento en  medio
            Iterator<String> i = num.iterator();//Iterador para recorrer la lista de numeros y signos
            while(i.hasNext()){//Avanza un elemento en cada iteracion en la lista
                String elem = i.next();//Guardamos el elemento que extre el iterador
                if(var.equals(elem)){//Comparamos cada elemento de la lista con cada elemento del numero entrante
                    cond = true;
                }
            }
            if(cond != true){//Si el numero no coincide al menos con un elemento de la lista 
            System.out.println("Numero invalido");                 //el num de telefono no es valido.
            return false;
            }
        }
        return true;//Si recorre todo el numero y esta bien retorna true
      }

            
    
    public boolean vericarCorreo(String pCorreoElectrónico){
        boolean cond = false;//Condicion para determinar si cumple con las regleas
        int aparicion = 0; // Al final tienen que haber dos apariciones necesarias el @ y el .      
        for (int j = 0; j< pCorreoElectrónico.length(); j++){//Ciclo para recorre cada elemento del string
            String var = pCorreoElectrónico.substring(j, j+1);//En un intervalo de indices nos devuelve el elemento en  medio
                String a = correo.get(0);//Guardamos el elemento @
                String p = correo.get(1);// Guardamos el punto
                if(var.equals(a)|| var.equals(p)){//Comparamos cada elemento de la lista con cada elemento del numero entrante
                    aparicion += 1;
                }
            }
            if(aparicion == 2){//Si el numero no coincide al menos con un elemento de la lista 
                             //el correo no es valido.
            return true;
            }else{return false;}
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
        System.out.println("Nombre: "+ nombre);
        System.out.println("Numero de identificacion: "+ numIdentificacion);
        System.out.println("Numero de telefono: "+ telefono);
        System.out.println("Correo electronico: "+ correoElectronico);
        System.out.println("Fecha de nacimiento: "+ fechaNacimiento);
        System.out.println("Programas: ");
        System.out.println("Mediciones: ");
    }
    
    
}


