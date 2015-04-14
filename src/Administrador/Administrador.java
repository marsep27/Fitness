package Administrador;

import Estructuras.Maquina;
import Estructuras.Paciente;
import Estructuras.Almacen;
import Estructuras.Ejercicio;
import Estructuras.Dia;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;//Lista
import java.nio.file.Files;//lista
import java.nio.file.Path;//Para iterar
import java.nio.file.Paths;//Leer entradas del usuario
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

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
      public ArrayList<String> listNombres = new ArrayList();
      public ArrayList<String> listMaquinas = new ArrayList();
      Maquina maquina;
      Almacen almacen = new Almacen();
      public ArrayList<String> listMaquinas = new ArrayList<>(//Maquinas del gimnacio
      Arrays.asList("Pelota de balance","Mini trampolín","Escaladora","Remadora","Prensa de piernas","Mesa de pilates"
                    ,"Bicicleta de spinning","Bicicleta recostada","Elíptica","Caminadora","Sin maquina","Mancuernas",
                    "Ligas","Maquina con pesas y soportes","Maquina Smith","Banca para ejercicios"));
      //LISTAS DE LOS EJERCICIOS EXISTENTES
    public ArrayList<String> listEjerciciosPartsuperior = new ArrayList<>(//Ejercicios de la parte superior del cuerpo(hombros,brazos,espalda,biceps,triceps...)
      Arrays.asList("press frontal con barra","pajaros","press arnold","elevaciones laterales , acostado de lado","encogimientos con mancuernas remo al cuello con barra Z",
                    "curl antebrazo supinacion frontales","curl antebrazo traseros","dominas","remo horizontal a una mano con mancuerna",
                    "remo sentado en polea con agarre abierto","remo con polea con remo cerrado","polea al pecho","curl biceps con barra recta",
                    "curl biceps en banco scoot","curl inclinado con mancuernas","curl concentradas","press banca","press banca inclinado",
                    "press banca declinado","aperturas con mancuernas","pullover","extension triceps en polea","press frances","fondos",
                    "Curl de muñecas con mancuerna","Curl de muñecas con barra","Extensión tríceps polea","Extensión individual tríceps polea",
                    "Extensión tríceps copa mancuerna individual","Extensión tríceps copa polea","Extensión individual tríceps polea invertido",
                    "Extensión individual tríceps (patada de mula)","Press para tríceps con barra","Press francés barra Z","Press francés mancuernas",
                    "Curl bíceps barra Z","Curl bíceps mancuernas","Curl bíceps mancuernas alterno","Curl bíceps martillo",
                    "Curl bíceps concentrado mancuerna","Curl bíceps polea","Curl bíceps banco Scott con barra","Curl bíceps banco Scott individua con mancuerna",
                    "Curl bíceps Prono con barra","Press hombro militar con barra","Press hombro militar con mancuernas","Press hombro militar con mancuernas alterno",
                    "Press hombro militar en máquina","Abducción lateral de hombro con mancuerna","Abducción lateral de hombro individual con mancuerna",
                    "Abducción posterior de hombro en máquina","Abducción posterior de hombro con mancuernas","Abducción posterior de hombro individual con mancuerna",
                    "Flexión Anterior de hombro mancuernas","Retracción escapular mancuernas","Retracción escapular máquina","Dominadas prono","Dominadas supino",
                    "Dominadas neutro","Polea espalda frontal con polea","Polea espalda supino con polea","Polea espalda frontal individual con polea","Pull down polea ",
                    "Remo espalda con polea","Remo espalda individual con polea","Remo espalda con polea alterno","Remo espalda con mancuerna individual",
                    "Remo espalda con mancuerna bilateral","Remo T para espalda ","Trapecio (Elevación de hombros) con barra","Trapecio (Elevación de hombros) con mancuernas"));
    
    public ArrayList<String> listEjerciciosPartMedia = new ArrayList<>(//Ejercicios de la parte media del cuerpo(abdominales,pecho)
      Arrays.asList("Abdomen regular","Abdomen con rodillas en 90", "Abdomen Oblicuo", "Abdomen con peso", "Abdomen completo"
                     , "Peck Deck (polea)", "Press pecho máquina vertical ", "Press pecho maquina plano" , "Aperturas pecho mancuernas en banca plana"
                     , "Aperturas pecho mancuernas en banca inclinada" , "Aperturas pecho con polea" , "Push Ups (regulares)", "Push Ups (rodillas)"
                     , "Press pecho plano con barra", "Press pecho inclinado con barra","Press pecho plano con mancuernas", "Press pecho inclinado con mancuernas"
                     , "Fondos en paralelas", "Pullover mancuerna", "Pullover barra"));
    
    public ArrayList<String> listEjerciciosPartBaja = new ArrayList<>(//Ejercicios de la parte baja del cuerpo(piesnas,muslo)
      Arrays.asList("sentadillas" , "extenciones cuadrices en maquina", "curl femoral en maquina", "zancadas", "gemelos de pie", "gemelos sentados"
              , "Saltos medios libres", "Saltos profundos libres", "Saltos medios en trampolín", "Saltos profundos en trampolín ", "Saltos en banco"
              , "Desplantes con saltos" , "Desplazamientos laterales libres", "Desplazamientos laterales con peso", "Joggin libre", "Joggin en trampolín"
              , "Jumping Jacks", "Burpees ", "Burpees media", "Push ups rusas", "Push ups rotación medial", "Push ups con gateo"
              , "Flexión plantar en máquina", "Flexión plantar mancuerna individual", "Flexión plantar libre", "Soleos Extensión de rodilla en máquina" ,"Extensión de rodilla individual en máquina" 
              , "Flexión de rodilla en máquina" ,"Flexión de rodilla individual en máquina" ,"Desplantes con mancuernas" ,"Elevación pélvica" ,
                "Desplantes con barra" , "Sentadilla libre" ,"Sentadilla libre individual" ,"¼ de sentadilla con mancuernas" ,"½ Sentadilla con mancuernas" ,
                "Sentadilla profunda mancuernas" ,"Sentadilla con barra" ,"Sentadilla en máquina Smith" ,"Step con mancuernas en banca"));
    
    
      
   
    
            public void agregarPaciente(String pNombre, String pSexo, String pNumIdentificacion, String pTelefono, String pCorreoElectronico, String pFechaNacimiento){
                    Paciente newPaciente = new Paciente(pNombre,pSexo,pNumIdentificacion,pTelefono,pCorreoElectronico,pFechaNacimiento);// crea el paciente
                    listaPacientes.add(newPaciente);//Agrega el paciente a la lista de pacientes
                    listCedulas.add(pNumIdentificacion);//Agrega el numero de cedula del paciente a la lista de numeros de cedula
                    listNombres.add(pNombre);
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
                        Collections.sort(listNombres);
                        System.out.println(">>>>Paciente  "+ i+1);
                        String nom = listNombres.get(i);// Guarda el paciente de la iteracion
                        System.out.println((i+1)+"."+nom);//Imprime el nombre del paciente
                        
                    }

            }
            
//            public void modificarPaciente(){//FAlta revisar o eleminar
//                /*Modifica uno de los atributos de un cliente en especifico*/
//                        listaPacientes();//Llama funcion que imprime la lista de pacientes
//                        System.out.println("Elija el paciente que quiere modificar: ");
//                        int client = in.nextInt();//Guarda el indice de la lista en el que se encuentra el cliente
//                        paciente1 =listaPacientes.get(client-1);//Guarda el paciente elegido
//                        boolean volver = true;//Boolean para salir del ciclo
//                        while (volver == true){//Ciclo para ver los datos
//                        System.out.println(">>Datos del cliente seleccionado");
//                        paciente1.verPaciente();//Imprime los datos del cliente seleccionado
//                        System.out.println("Elija el numero del dato que quiere modificar: ");
//                        int dato = in.nextInt();//lee el numero del dato a modificar
//                        boolean salir = false;//Boolean para salir del ciclo
//                        while(salir == false){//Ciclo para modificar los datos
//                        switch(dato){
//                            case 1: 
//                                System.out.println(">>Cambiando nombre");
//                                System.out.println("Ingrese el nuevo nombre: ");
//                                String nom = in.nextLine();//Lee el nuevo nombre
//                                paciente1.setNombre(nom);//Modifica el nombre
//                                System.out.println("Se actualizo exitosamente el nombre");
//                                volver = false;//Para salir del ciclo de cambio de datos
//                            case 2:
//                                System.out.println(">>Cambiando el numero de identificacion");
//                                System.out.println("Ingrese el nuevo numero de identificacion: ");
//                                String iden = in.nextLine();//Lee el nuevo numero de identificacion
//                                boolean i1 = vericarCedula(iden);//Verifica que sea valida la entrada
//                                if(i1){//Si es valida
//                                paciente1.setNumIdentificacion(iden);//Modifica el numero de identificacion
//                                System.out.println("Se actualizo exitosamente el numero de identificacion");
//                                volver = false;//Salir del ciclo de modificar datos
//                                }else{System.out.println("Entrada invalida"); salir = true;}//Si no es valida pide nuevamente que ingrese el dato
//                             
//                            case 3: 
//                                System.out.println(">>Cambiando el numero de telefono");
//                                System.out.println("Ingrese el nuevo numero de telefono:");
//                                String tel = in.nextLine();//Lee el numero de telefono
//                                boolean i2 = vericarTel(tel);//Verifica que este correcto
//                                if(i2){//Si esta correcto
//                                paciente1.setTeléfono(tel);//Cambia el numero
//                                System.out.println("Se actualizo exitosamente el telefono");
//                                volver = false;//Salir del ciclo
//                                }else{System.out.println("Entrada invalida"); salir = true;}//Si esta incorrecto pide que lo ingrese nuevamente
//                            case 4: 
//                                System.out.println(">>Cambiando correo electronico");
//                                System.out.println("Ingrese el nuevo correo electronico: ");
//                                String co = in.nextLine();//Lee el nuevo correo 
//                                boolean  i3 = vericarCorreo(co);//Verifica que el correo este correcto
//                                if(i3){//Si esta correcto
//                                paciente1.setCorreoElectrónico(co);//Modifica el correo
//                                System.out.println("Se actualizo exitosamente el correo");
//                                volver = false;//Para salir del ciclo
//                                }else{System.out.println("Entrada invalida"); salir = true;}//Si esta incorrecto pide que lo ingrese nuevamente
//                            case 5: 
//                                System.out.println("Cambiando la fecha de nacimiento");
//                                System.out.println("Ingrese la nueva fecha de nacimiento: ");
//                                String nac = in.nextLine();//Lee la fecha de nacimiento
//                                paciente1.setFechaNacimiento(nac);//Cambia la fecha
//                                System.out.println("Se actualizo exitosamente la fecha de nacimiento");
//                                volver = false;//Sale del ciclo
//                            case 6:
//                                System.out.println("El numero de programas no se puede modificar");
//                                volver = false;
//                            case 7: 
//                                System.out.println("El numero de mediciones no se puede modificar");
//                                volver = false;
//                        
//                            }
//                
//                        }
//                      }
//                    }

            
            
            
            public void borrarPaciente(Paciente paciente1){
                /*Borra un paciente junto con sus mediciones y programas*/
//                        System.out.println("“El paciente "+ paciente1.getNombre()+ " será eliminado del sistema. \n"//Mensaje de confirmacion
//                                + "Cuenta con" + paciente1.getCantMediciones()+" mediciones y " + paciente1.getCantProgramas()
//                                + " programas de entrenamiento.\n ¿Está seguro que desea eliminarlo?”\n1.Confirmar\n2.Cancelar");
//                        int op = in.nextInt();//lee la respuesta de la confirmacion
//                        if(op == 1){
                            paciente1.eliminarPaciente();
                            listaPacientes.remove(paciente1);
//                        }else{/*regresa al listado de pacientes*/}//Si el usuario confirma lo borra sino no
               
                }
            
            public void agregarMaquina(String NombreMaquina, String areaTrabajada, String tipo, String descripcion){
                    maquina = new Maquina(NombreMaquina, areaTrabajada, tipo, descripcion);
                    listMaquinas.add(maquina.getNombre());
                    almacen.agregaMaquina(maquina);
                    
            }
            
            public void verPaciente(Paciente paciente){
                /*Muestra la info de una paciente en especifico*/
                        paciente.verPaciente();//Muestra la info del paciente
                        
            }
            
            public void agregarPrograma(Paciente paciente,String Titulo, String Descripcion, int AñoFin, int MesFin, int DiaFin, String setDia){
                paciente.obPrograma(Titulo, Descripcion, AñoFin, MesFin, DiaFin, setDia);
            }
            
            public void verListSuper(){
                int i = 1;
                for(String ejer : listEjerciciosPartsuperior){
                       System.out.println(i+ejer);
                       i++;
                }
            }
    
            public void verListMedi(){
                int i = 1;
                for(String ejer : listEjerciciosPartMedia){
                      System.out.println(i+ejer);
                        i++;
                  }
            }
    
            public void verListInferior(){
                int i = 1;
                for(String ejer : listEjerciciosPartBaja){
                        System.out.println(i+ejer);
                        i++;
                }
            }
            
            public void agregarEjercicio(String parteDeTrabajo,String ejercicio){
                   if("Superior".equals(parteDeTrabajo)){
                       listEjerciciosPartsuperior.add(ejercicio);
                   }
                   if("Media".equals(parteDeTrabajo)){
                       listEjerciciosPartMedia.add(ejercicio);
                   }
                   if("Inferior".equals(parteDeTrabajo)){
                       listEjerciciosPartBaja.add(ejercicio);
                   }
                   
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
                            if (elem == "-"){
                                cond = true;
                            }
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
        public void guardarPaciente(ArrayList<Paciente> listaPacientes) throws IOException{
                Path path = Paths.get("C:/clientes.txt");
                Charset utf8 = StandardCharsets.UTF_8;
                
                
                try(BufferedWriter w = Files.newBufferedWriter(path, utf8)){
                    for(Paciente paci : listaPacientes){
                        w.write(paci.getNombre()+ ";" + paci.getNumIdentificacion()+ ";" + paci.getCorreoElectronico()+ ";" + paci.getFechaNacimiento() + ";" + paci.getSexo()+ ";" + "\n");
                    }
                }catch(Exception e){
                e.printStackTrace();
                }
                
        }
        
        
        public ArrayList<Paciente> lectura() throws IOException{
                Path path = Paths.get("C:/clientes.txt");
                Charset utf8 = StandardCharsets.UTF_8;
                String tmp;
                ArrayList<Paciente> pacientes = new ArrayList<>();
                
                try(BufferedReader r = Files.newBufferedReader(path, utf8)){
                    while((tmp = r.readLine()) != null){
                    String[] tmpSplit = tmp.split(";");
                    Paciente paciente = new Paciente(tmpSplit[0]);
                    listaPacientes.add(paciente);
                    }
                }
                catch(Exception e){
                e.printStackTrace();
                }
               return listaPacientes;
                
        }
}
