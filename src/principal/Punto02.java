/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class Punto02 {
    private String dia;
    private String mes;
    private String año;
    private String fecha;

    public Punto02() {
    }

    public Date crearFecha(){
        Date hoy = new Date();
        return hoy;
    }
    public String ingrFecha(){
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Ingrese fecha ");
        setFecha(ingreso.nextLine());
        return getFecha();
    }
    public Date pasarStringADate() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date fechaDevuelta = formato.parse(getFecha());
            return fechaDevuelta;
        } catch (ParseException e) {
            System.out.println("No se puede Formatear");
            return null;
        }
    }
    public void devolverLaEdadEnSemana() {
        double a;
        a = ((crearFecha().getTime() - pasarStringADate().getTime()) / 86400000) / 7;
        System.out.println("La edad en semanas es: " + a);
    }
    public String obtEstacion() {
        int e;
        e = pasarStringADate().getMonth();
        String estacion;
        if (e >= 1 || e <= 3) {
            estacion = "Verano";
            return estacion;
        } else {
            if (e >= 4 || e <= 6) {
                estacion = "Otoño";
                return estacion;
            } else {
                if (e >= 7 || e <= 9) {
                    estacion = "Invierno";
                    return estacion;
                } else {
                    if (e >= 10 || e <= 12) {
                        estacion = "Primavera";
                        return estacion;
                    } else {
                        return "Mes invalido";
                    }
                }
            }
        }
    }
    public double obtenerDom(){
        ingrFecha();
        Date z = pasarStringADate();
        ingrFecha();
        Date x = pasarStringADate();
        double p;
        double q;
        p = ((z.getTime()-x.getTime())/ 86400000)/7;
        q = p/7;
        int d;
        d=(int) q;
        return d;
    }
    public int devDifDias(){
        ingrFecha();
        Date a = pasarStringADate();
        ingrFecha();
        Date b = pasarStringADate();
        double c;
        c = (a.getTime()- b.getTime()) /86400000;
        int d = (int) c;
        return d;
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

    /**
     * @return the fecNac
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecNac the fecNac to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
}
