package Administrador;

import Estructuras.Paciente;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Administrador {
    
      
      public ArrayList<Paciente> listaPacientes = new ArrayList();
      private static Paciente paciente1;
      public int cantPacientes;
      public ArrayList<String> num = new ArrayList<>(
      Arrays.asList("0","1", "2", "3","4","5","6","7","8","9","-","(",")"));
      public ArrayList<String> cedula = new ArrayList<>(
      Arrays.asList("0","1", "2", "3","4","5","6","7","8","9","-"));
      public ArrayList<String> correo = new ArrayList<>(
      Arrays.asList("@","."));
      public ArrayList<String> listCedulas = new ArrayList();
      Scanner in = new Scanner(System.in);
   
    
            public void agregarPaciente(){
                    
                    System.out.println("****************Creando paciente*********************");
                    System.out.println("Por favor proporcione la siguiente informacion:");
                    System.out.println("Nombre del paciente: ");
                    String nombre = in.nextLine();
                    System.out.println("Sexo: ");
                    String sexo = in.nextLine();
                    System.out.println("Numero de identificacion: ");
                    String numIdentificacion = in.nextLine();
                    boolean ced = vericarCedula(numIdentificacion);
                    boolean  p = verificarPaciente(numIdentificacion);
                    System.out.println("Numero de telefono: ");
                    String numTel = in.nextLine();
                    boolean tel = vericarTel(numTel);
                    System.out.println("Correo electronico: ");
                    String correo = in.nextLine();
                    boolean co = vericarCorreo(correo);
                    System.out.println("Fecha de nacimiento");
                    String fechaNaci = in.nextLine();
                    Paciente newPaciente = new Paciente(nombre,sexo,numIdentificacion,numTel,correo,fechaNaci);
                    listaPacientes.add(newPaciente);
                    listCedulas.add(numIdentificacion);
                    cantPacientes +=1;

              }

            public void verListaPacientes(){
                for (int i = 0; i != cantPacientes; i++) {
                        System.out.println(">>>>Paciente  "+ i+1);
                        paciente1 = listaPacientes.get(i);
                        paciente1.verPaciente();
                    }

            }
            
            public void modificarPaciente(){
                for (int i = 0; i != cantPacientes; i++) {
                        System.out.println(">>>>Paciente  "+ i+1);
                        paciente1 = listaPacientes.get(i);
                        paciente1.getNombre();
                        System.out.println("Elija el paciente que quiere modificar: ");
                        int client = in.nextInt();
                        paciente1 =listaPacientes.get(client-1);
                        System.out.println(">>Datos del cliente seleccionado");
                        paciente1.verPaciente();
                        int dato = in.nextInt();
                        switch(dato){
                            case 1: 
                                System.out.println(">>Cambiando nombre");
                                System.out.println("Ingrese el nuevo nombre: ");
                                String nom = in.nextLine();
                                
                                paciente1.setNombre(nom);
                            case 2:
                                System.out.println(">>Cambiando el numero de identificacion");
                                System.out.println("Ingrese el nuevo numero de identificacion: ");
                                String iden = in.nextLine();
                                boolean i1 = vericarCedula(iden);
                                if(i1){       
                                paciente1.setNumIdentificacion(iden);
                                }else{System.out.println("Entrada invalida");}
                             
                            case 3: 
                                System.out.println(">>Cambiando el numero de telefono");
                                System.out.println("Ingrese el nuevo numero de telefono:");
                                String tel = in.nextLine();
                                paciente1.setTeléfono(tel);
                            case 4: 
                                System.out.println(">>Cambiando correo electronico");
                                System.out.println("Ingrese el nuevo correo electronico: ");
                                String co = in.nextLine();
                                paciente1.setCorreoElectrónico(co);
                            case 5: 
                                System.out.println("Cambiando la fecha de nacimiento");
                                System.out.println("Ingrese la nueva fecha de nacimiento: ");
                                String nac = in.nextLine();
                                paciente1.setFechaNacimiento(nac);
                            case 6:
                                System.out.println("El numero de programas no se puede modificar");
                            case 7: 
                                System.out.println("El numero de mediciones no se puede modificar");
                        
                        
                
                        }
                    }

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
    
}
