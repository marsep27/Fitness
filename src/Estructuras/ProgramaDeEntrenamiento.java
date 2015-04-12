/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Estructuras;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class ProgramaDeEntrenamiento {

    private ArrayList <Dia> dias = new ArrayList<>();//Lista de dias
    private String Titulo;//Titulo del programa de entrenamiento
    private String Descripcion;//Objetivo del programa
    private LocalDateTime DiaInicio;//Fecha de inicio del programa
    private LocalDateTime DiaFinal;// fecha final del programa de entrenamiento
    private int Asistencia;//Numero que comtrola la asistencia

    public ProgramaDeEntrenamiento(String Titulo, String Descripcion, int AñoFin, int MesFin, int DiaFin, String setDia) {
        this.Titulo = Titulo;
        this.Descripcion = Descripcion;
        this.DiaInicio = LocalDateTime.now();
        this.DiaFinal = LocalDateTime.of(AñoFin, MesFin-1, DiaFin, 0, 0);
        this.Asistencia = 0;
 
        Dia set_dia = new Dia(setDia);
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public LocalDateTime getDiaFinal() {
        return DiaFinal;
    }

    public void setDiaFinal(int AnioFin, int MesFin, int DiaFin) {
        this.DiaFinal = LocalDateTime.of(AnioFin, MesFin-1, DiaFin, 0, 0);
    }

    public int getAsistencia() {
        return Asistencia;
    }

    public LocalDateTime getDiaInicio() {
        return DiaInicio;
    }

    public void setDiaInicio(int AnioIni, int MesIni, int DiaIni){
        this.DiaInicio = LocalDateTime.of(AnioIni, MesIni, DiaIni, 0, 0);
    } 
    
    public void agregarDia(String nombreDia){
        Dia newDia = new Dia(nombreDia);
        dias.add(newDia);
    }
}