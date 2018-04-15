package principal;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC-Gamer
 */
public class Punto03 {
    private String fechNac;
    private String dia;
    private String mes;
    private String año;

    public Punto03() {
        
    }

    public Date darFecha() {
        Date hoy = new Date();
        return hoy;
    }

    public String ingresarFech() {
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Ingrese Fecha");
        setFechNac(ingreso.nextLine());
        return getFechNac();
    }

    public Date deStringADate() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date fechaDevuelta = formato.parse(getFechNac());
            return fechaDevuelta;
        } catch (ParseException e) {
            System.out.println("No se puede Formatear");
            return null;
        }
    }
    
    public void devolveragregado() {
        ingresarFech();
        Date x = deStringADate();
        Date z = agregarDias(x);
        recortarFecha(z);
        System.out.println(getDia() + " de " + getMes() + " de " + getAño());

    }

    public void recortarFecha(Date z) {
        SimpleDateFormat nuevoDia = new SimpleDateFormat("dd");
        setDia(nuevoDia.format(z));
        SimpleDateFormat nuevoMes = new SimpleDateFormat("MMMM");
        setMes(nuevoMes.format(z));
        SimpleDateFormat nuevoAño = new SimpleDateFormat("yyyy");
        setAño(nuevoAño.format(z));

    }
    
    public Date agregarDias(Date x) {
        int z = 100;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(x);
        calendar.add(Calendar.DAY_OF_YEAR, z);
        return calendar.getTime();
    }
    
    /**
     * @return the fecNac
     */
    public String getFechNac() {
        return fechNac;
    }

    /**
     * @param fecNac the fecNac to set
     */
    public void setFechNac(String fecNac) {
        this.fechNac = fecNac;
    }

    /**
     * @return the dia
     */
    public String getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(String dia) {
        this.dia = dia;
    }

    /**
     * @return the mes
     */
    public String getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(String mes) {
        this.mes = mes;
    }

    /**
     * @return the año
     */
    public String getAño() {
        return año;
    }

    /**
     * @param año the año to set
     */
    public void setAño(String año) {
        this.año = año;
    }
    
    
}
