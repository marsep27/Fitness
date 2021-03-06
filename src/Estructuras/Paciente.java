/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Estructuras;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

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
    private static Mediciones medicion1;
    private static ProgramaDeEntrenamiento program;
    public ArrayList<Mediciones> listaMediciones = new ArrayList();//Lista de mediciones
    //public ArrayList<ProgramasEntrenamiento> listaProgramEntrena = new ArrayList();//Lista de programas de entrenamiento
    Scanner in = new Scanner(System.in);
    public ArrayList<ProgramaDeEntrenamiento> listaProgramas = new ArrayList();
    
    
    public Paciente(String pNombre, String pSexo, String pNumIdentificacion, String pTelefono, String pCorreoElectronico, String pFechaNacimiento) {
        this.nombre = pNombre;
        this.sexo = pSexo;
        this.numIdentificacion = pNumIdentificacion;
        this.telefono = pTelefono;
        this.correoElectronico = pCorreoElectronico;
        this.fechaNacimiento = pFechaNacimiento; 
        
    }

    public Paciente(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getCorreoElectronico() {
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

    public void setCorreoElectrónico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
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
    
    public void obMedicion(double estatura, double peso, int frecCardiaca, int presArterialSistolica, int presArterialDiastolica, 
            double cuello, double bicepsDer, double bicepsIzq, double pectoral, double espalda, double Cintura1, double Cintura2,
            double Cintura3, double cadera, double musloDer, double musloIzq, double pantorrillaDer, double pantorrillaIzq, 
            double triceps, double subescapular, double abdomen, double iliaco, double muslo, double pantorrilla,
            double pectoralPliegue){
//        System.out.println("");
//        System.out.println(">>Lista de mediciones\n");
//        System.out.println("Ingrese su estatura: \n *La medida debe estar en metros*\n");
//        double estatura = in.nextDouble();
//        System.out.println("Ingrese su peso: \n *La medida debe estar en kilogramos*\n");
//        double peso = in.nextDouble();
//        System.out.println("Ingrese su frecuencia cardiaca: \n *La medida debe estar en latidos por minuto*\n");
//        int frecCard = in.nextInt();
//        System.out.println("\tIngrese la medida del presion arterial.\n Son dos las cuales deben estar en milimetros de mercurio \n\t1.Sistolica: ");
//        int presArtSistolica = in.nextInt();
//        System.out.println("\n\t2.Diastolica: ");
//        int presArtDiastolica = in.nextInt();
//        
//        //PLIEGUES CUTANEOS 
//        System.out.println("****************************************************");
//        System.out.println(">>>> MEDICIONES DE LOS PLIEGUES CUTANEOS");
//        System.out.println("*Las siguentes medidas deben estar en milimetros*");
//        System.out.println("\tIngrese la medida del triceps: \n");
//        double triceps = in.nextDouble();
//        System.out.println("\tIngrese la medida del subescapular: \n");
//        double subescapular = in.nextDouble();
//        System.out.println("\tIngrese la medida del abdomen: \n");
//        double abdomen = in.nextDouble();
//        System.out.println("\tIngrese la medida del iliaco: \n");
//        double iliaco = in.nextDouble();
//        System.out.println("\tIngrese la medida del muslo: \n");
//        double muslo = in.nextDouble();
//        System.out.println("\tIngrese la medida de la pantorrilla: \n");
//        double pantorrilla = in.nextDouble();
//        System.out.println("\tIngrese la medida del pectoral: \n");
//        double pectoralPliegue = in.nextDouble();
//        System.out.println("****************************************************");
//        System.out.println(">>>>MEDICIONES DE LAS CIRCUNFENCIAS CORPORALES");
//        System.out.println("Las siguientes medidas deben estar en centimetros");
//        System.out.println("\tIngrese la medida del cuello: \n");
//        double cuello = in.nextDouble();
//        System.out.println("\tIngrese la medida del biceps derecho: \n");
//        double bicepsDer = in.nextDouble();
//        System.out.println("\tIngrese la medida del biceps izquierdo: \n");
//        double bicepsIzq = in.nextDouble();
//        System.out.println("\tIngrese la medida del pectoral solo para hombre: \n*si es mujer escriba 0*");
//        double pectoralH = in.nextDouble();
//        System.out.println("\tIngrese la medida de la espalda: \n");
//        double espalda = in.nextDouble();
//        System.out.println("\tIngrese la medida de la cintura se divide en 3\n\t1.Alta:");
//        double cintura1 = in.nextDouble();
//        System.out.println("\t2.Media\n"); 
//        double cintura2 = in.nextDouble();
//        System.out.println("\t3.Baja\n");
//        double cintura3 = in.nextDouble();
//        System.out.println("\tIngrese la medida de la cadera: \n");
//        double cadera = in.nextDouble();
//        System.out.println("\tIngrese la medida del muslo derecho: \n");
//        double musloDer = in.nextDouble();
//        System.out.println("\tIngrese la medida del muslo izquierdo: \n");
//        double musloIzq = in.nextDouble();
//        System.out.println("\tIngrese la medida de la pantorrilla derecha: \n");
//        double pantorrillaDer = in.nextDouble();
//        System.out.println("\tIngrese la medida de la pantorrilla izquierda: \n");
//        double pantorrillaIzq = in.nextDouble();
        Mediciones newMedicion = new Mediciones(estatura,peso,frecCardiaca,presArterialSistolica,presArterialDiastolica, 
            cuello, bicepsDer, bicepsIzq, pectoral,espalda,Cintura1,Cintura2,
            Cintura3,cadera, musloDer,musloIzq,pantorrillaDer, pantorrillaIzq, 
            triceps, subescapular,abdomen,iliaco, muslo,pantorrilla,
            pectoralPliegue,sexo);
        listaMediciones.add(newMedicion);
        cantMediciones += 1;
    }
    
    public void obPrograma(String Titulo, String Descripcion, int AñoFin, int MesFin, int DiaFin, String setDia){
        program  = new ProgramaDeEntrenamiento(Titulo,Descripcion,AñoFin,MesFin,DiaFin,setDia);
        cantProgramas+= 1;
        listaProgramas.add(program);
        
    }
    
    void verMediciones(){
        for (int i = 0; i != cantMediciones; i++) {// Recorre la lista hasta que se llegue al numero maximo de pacientes registrados
                        System.out.println(">>>>Paciente  "+ i+1);
                        medicion1 = listaMediciones.get(i);//Guarda el paciente de la iteracion en un elemento de tipo paciente para acceder a sus metodos
                        medicion1.toString();
    
            }
    }
    public void verPaciente(){
        System.out.println("********************************************");
        System.out.println("1.Nombre: "+ nombre);
        System.out.println("2.Numero de identificacion: "+ numIdentificacion);
        System.out.println("3.Numero de telefono: "+ telefono);
        System.out.println("4.Correo electronico: "+ correoElectronico);
        System.out.println("5.Fecha de nacimiento: "+ fechaNacimiento);
        System.out.println("6.Programas: ");
        int i = 0;
        for(ProgramaDeEntrenamiento program: listaProgramas){
            System.out.println("Programa "+i);
            program.verProgramas();
            i++;
        }
        System.out.println("7.Mediciones");
        for(Mediciones med: listaMediciones){
            System.out.println("Fecha de medicion: "+ med.getFechaCreacion()+"\n");
            med.verMedicioness();
        }
    }
    
    public void eliminarPaciente(){
        listaMediciones.clear();
        for(ProgramaDeEntrenamiento program: listaProgramas){
            program.eliminarPrograma();
        }
        listaProgramas.clear();
    
    }
    
    public void eliminarMedicion(Mediciones medicion){
        listaMediciones.remove(medicion);
    }
    
    public void verMedicion(Mediciones med){
        System.out.println("Fecha de medicion: "+ med.getFechaCreacion()+"\n");
        med.verMedicioness();
        
    }

    public void verListaDeMediciones(){
        for(Mediciones med: listaMediciones){
            System.out.println("Fecha de medicion: "+ med.getFechaCreacion()+"\n");
            med.verMedicioness();
        }
    }
    public void eliminarProgramaEntre(ProgramaDeEntrenamiento program){
            program.eliminarPrograma();
    }
    
    public void verProgramaEntre(ProgramaDeEntrenamiento program){
        program.verProgramas();
    
    }
    
    
    
 }
    



