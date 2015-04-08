/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Estructuras;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Rutina {

    private ArrayList <Ejercicio> ejercicios = new ArrayList<>();
    private String Titulo;
    private String Descripcion;
    private LocalDateTime DiaInicio;
    private LocalDateTime DiaFinal;
    private int Asistencia;

    public Rutina(String Titulo, String Descripcion, int AnioFin, int MesFin, int DiaFin, String setDia) {
        this.Titulo = Titulo;
        this.Descripcion = Descripcion;
        this.DiaInicio = LocalDateTime.now();
        this.DiaFinal = LocalDateTime.of(AnioFin, MesFin-1, DiaFin, 0, 0);
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
}