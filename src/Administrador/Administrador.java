package Administrador;

import Estructuras.Paciente;
import java.util.ArrayList;//Lista
import java.util.Arrays;//lista
import java.util.Iterator;//Para iterar
import java.util.Scanner;//Leer entradas del usuario

public class Administrador {
    
      
      public ArrayList<Paciente> listaPacientes = new ArrayList();//Lista de pacientes
      private static Paciente paciente1;//Paciente usado para acceder a los metodos
      public int cantPacientes;//Maneja la cantidad de pacientes
      public ArrayList<String> num = new ArrayList<>(//Elementos que debe poseer un numero de tel para que sea correcto
      Arrays.asList("0","1", "2", "3","4","5","6","7","8","9","-","(",")"));
      public ArrayList<String> cedula = new ArrayList<>(//Elementos que debe poseer un numero de ced para que sea correcto
      Arrays.asList("0","1", "2", "3","4","5","6","7","8","9","-"));
      public ArrayList<String> correo = new ArrayList<>(//Elementos que debe poseer el correo para que sea correcto
      Arrays.asList("@","."));
      public ArrayList<String> listCedulas = new ArrayList();//Guarda todas las cedulas de los pacientes
      Scanner in = new Scanner(System.in);// El scanner in lee las entradas
   
    
            public void agregarPaciente(){
                    /*Clase crea un paciente y verifica que todas sus entradas sean correctas*/
                    System.out.println("****************Creando paciente*********************");
                    System.out.println("Por favor proporcione la siguiente informacion:");
                    System.out.println("Nombre del paciente: ");
                    String nombre = in.nextLine();//Lee el nombre
                    System.out.println("Sexo: ");
                    String sexo = in.nextLine();//Lee el sexo
                    System.out.println("Numero de identificacion: ");
                    String numIdentificacion = in.nextLine();//Lee el numero de identificacion o cedula
                    boolean ced = vericarCedula(numIdentificacion);//Verifica que el num ced este bien escrito
                    boolean  p = verificarPaciente(numIdentificacion);//Verifica que el paciente no exista
                    System.out.println("Numero de telefono: ");
                    String numTel = in.nextLine();//Lee el numero de telefono
                    boolean tel = vericarTel(numTel);//Verifica que el telefono este bien escrito
                    System.out.println("Correo electronico: ");
                    String correo = in.nextLine();//Lee el correo del cliente
                    boolean co = vericarCorreo(correo);//Verifica que el correo este bien escrito
                    System.out.println("Fecha de nacimiento");
                    String fechaNaci = in.nextLine();// Lee la fecha de nacimiento
                    Paciente newPaciente = new Paciente(nombre,sexo,numIdentificacion,numTel,correo,fechaNaci);// crea el paciente
                    listaPacientes.add(newPaciente);//Agrega el paciente a la lista de pacientes
                    listCedulas.add(numIdentificacion);//Agrega el numero de cedula del paciente a la lista de numeros de cedula
                    cantPacientes +=1;// incrementa en numero de pacientes

              }

            public void verListaPacientes(){
                /*Funcion Imprime todos los pacientes y sus atributos*/
                for (int i = 0; i != cantPacientes; i++) {// Recorre la lista hasta que se llegue al numero maximo de pacientes registrados
                        System.out.println(">>>>Paciente  "+ i+1);
                        paciente1 = listaPacientes.get(i);//Guarda el paciente de la iteracion en un elemento de tipo paciente para acceder a sus metodos
                        paciente1.verPaciente();//Imprime los atributos del paciente
                        //FALTA acomodar en orden alfabetico
                    }

            }
            
            public void listaPacientes(){
                /*Imprime lista de pacientes solo los nombres*/
                for (int i = 0; i != cantPacientes; i++) {// recorre la lista de pacientes
                        System.out.println(">>>>Paciente  "+ i+1);
                        paciente1 = listaPacientes.get(i);// Guarda el paciente de la iteracion
                        paciente1.getNombre();//Imprime el nombre del paciente
                        //FALTA acomodar en orden alfabetico
                    }

            }
            
            public void modificarPaciente(){
                /*Modifica uno de los atributos de un cliente en especifico*/
                        listaPacientes();//Llama funcion que imprime la lista de pacientes
                        System.out.println("Elija el paciente que quiere modificar: ");
                        int client = in.nextInt();//Guarda el indice de la lista en el que se encuentra el cliente
                        paciente1 =listaPacientes.get(client-1);//Guarda el paciente elegido
                        boolean volver = true;//Boolean para salir del ciclo
                        while (volver == true){//Ciclo para ver los datos
                        System.out.println(">>Datos del cliente seleccionado");
                        paciente1.verPaciente();//Imprime los datos del cliente seleccionado
                        System.out.println("Elija el numero del dato que quiere modificar: ");
                        int dato = in.nextInt();//lee el numero del dato a modificar
                        boolean salir = false;//Boolean para salir del ciclo
                        while(salir == false){//Ciclo para modificar los datos
                        switch(dato){
                            case 1: 
                                System.out.println(">>Cambiando nombre");
                                System.out.println("Ingrese el nuevo nombre: ");
                                String nom = in.nextLine();//Lee el nuevo nombre
                                paciente1.setNombre(nom);//Modifica el nombre
                                System.out.println("Se actualizo exitosamente el nombre");
                                volver = false;//Para salir del ciclo de cambio de datos
                            case 2:
                                System.out.println(">>Cambiando el numero de identificacion");
                                System.out.println("Ingrese el nuevo numero de identificacion: ");
                                String iden = in.nextLine();//Lee el nuevo numero de identificacion
                                boolean i1 = vericarCedula(iden);//Verifica que sea valida la entrada
                                if(i1){//Si es valida
                                paciente1.setNumIdentificacion(iden);//Modifica el numero de identificacion
                                System.out.println("Se actualizo exitosamente el numero de identificacion");
                                volver = false;//Salir del ciclo de modificar datos
                                }else{System.out.println("Entrada invalida"); salir = true;}//Si no es valida pide nuevamente que ingrese el dato
                             
                            case 3: 
                                System.out.println(">>Cambiando el numero de telefono");
                                System.out.println("Ingrese el nuevo numero de telefono:");
                                String tel = in.nextLine();//Lee el numero de telefono
                                boolean i2 = vericarTel(tel);//Verifica que este correcto
                                if(i2){//Si esta correcto
                                paciente1.setTeléfono(tel);//Cambia el numero
                                System.out.println("Se actualizo exitosamente el telefono");
                                volver = false;//Salir del ciclo
                                }else{System.out.println("Entrada invalida"); salir = true;}//Si esta incorrecto pide que lo ingrese nuevamente
                            case 4: 
                                System.out.println(">>Cambiando correo electronico");
                                System.out.println("Ingrese el nuevo correo electronico: ");
                                String co = in.nextLine();//Lee el nuevo correo 
                                boolean  i3 = vericarCorreo(co);//Verifica que el correo este correcto
                                if(i3){//Si esta correcto
                                paciente1.setCorreoElectrónico(co);//Modifica el correo
                                System.out.println("Se actualizo exitosamente el correo");
                                volver = false;//Para salir del ciclo
                                }else{System.out.println("Entrada invalida"); salir = true;}//Si esta incorrecto pide que lo ingrese nuevamente
                            case 5: 
                                System.out.println("Cambiando la fecha de nacimiento");
                                System.out.println("Ingrese la nueva fecha de nacimiento: ");
                                String nac = in.nextLine();//Lee la fecha de nacimiento
                                paciente1.setFechaNacimiento(nac);//Cambia la fecha
                                System.out.println("Se actualizo exitosamente la fecha de nacimiento");
                                volver = false;//Sale del ciclo
                            case 6:
                                System.out.println("El numero de programas no se puede modificar");
                                volver = false;
                            case 7: 
                                System.out.println("El numero de mediciones no se puede modificar");
                                volver = false;
                        
                            }
                
                        }
                      }
                    }

            
            
            
            public void borrarPaciente(){
                /*Borra un paciente junto con sus mediciones y programas*/
                        listaPacientes();//Imprime la lista de paciente
                        System.out.println("Elija el paciente que quiere borrar: ");
                        int client = in.nextInt();//Lee el numero del paciente que quiere borrar
                        paciente1 =listaPacientes.get(client-1);//Accede al paciente y lo guarda en una variable
                        System.out.println("“El paciente "+ paciente1.getNombre()+ " será eliminado del sistema. \n"//Mensaje de confirmacion
                                + "Cuenta con" + paciente1.getCantMediciones()+" mediciones y " + paciente1.getCantProgramas()
                                + " programas de entrenamiento.\n ¿Está seguro que desea eliminarlo?”\n1.Confirmar\n2.Cancelar");
                        int op = in.nextInt();//lee la respuesta de la confirmacion
                        if(op == 1){listaPacientes.remove(client-1);}else{/*regresa al listado de pacientes*/}//Si el usuario confirma lo borra sino no
                              
            
                }
            
            
            public void verPaciente(){
                /*Muestra la info de una paciente en especifico*/
                        listaPacientes();//Imprime lista de pacientes por nombre
                        System.out.println("Elija el paciente que quiere ver: ");
                        int client = in.nextInt();//Lee el numero del paciente que quiere ver
                        paciente1 =listaPacientes.get(client-1);//Accede al paciente y lo guarda en una variable
                        paciente1.verPaciente();//Muestra la info del paciente
                        //FALTA la lista de mediciones y programas acomodados
            }

            public boolean verificarPaciente(String numCedula){
                /*Verifica si un paciente existe o no*/
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
                /*Verifica si el numero de cedula esta bien escrito*/
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
                /*Verifica si el numero de telefono esta bien escrito*/
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
                /*Verifica si el correo esta bien escrito*/
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
