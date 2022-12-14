package Clases;

import javax.swing.JComboBox;

public class Anuncio {

    //Atributos
    private String seccion;
    private String titulo;
    private String fecha;
    private String descripcion;
    private double costo;
    private double costoIva;
    
    //constructores
    public Anuncio() {

    }

    public Anuncio(String seccion, String titulo, String fecha, String descripcion, double costo, double costoIva) {
        this.seccion = seccion;
        this.titulo = titulo;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.costo = costo;
        this.costoIva = costoIva;
    }
  
    //Setters y Getters
    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getCostoIva() {
        return costoIva;
    }

    public void setCostoIva(double costoIva) {
        this.costoIva = costoIva;
    }


    
    //métodos de costo
    public double costoSinIva(JComboBox combo) {

        if (combo.getSelectedItem() == "Nacionales") {
            costo = (80 * titulo.length()) + (80 * descripcion.length());

        } else if (combo.getSelectedItem() == "Internacionales") {
            costo = (70 * titulo.length()) + (70 * descripcion.length());

        } else if (combo.getSelectedItem() == "Deportes") {
            costo = (90 * titulo.length()) + (90 * descripcion.length());

        } else if (combo.getSelectedItem() == "Culturales") {
            costo = (85 * titulo.length()) + (85 * descripcion.length());

        } else if (combo.getSelectedItem() == "Económicos") {
            costo = (50 * titulo.length()) + (50 * descripcion.length());

        }

        return costo;
    }

    public double CostoConIva(JComboBox combo2) {

        if (combo2.getSelectedItem() == "Nacionales") {

            costoIva = (float) (costo + (costo * 0.13));

        } else if (combo2.getSelectedItem() == "Internacionales") {

            costoIva = (float) (costo + (costo * 0.13));

        } else if (combo2.getSelectedItem() == "Deportes") {

            costoIva = (float) (costo + (costo * 0.13));

        } else if (combo2.getSelectedItem() == "Culturales") {

            costoIva = (float) (costo + (costo * 0.13));

        } else if (combo2.getSelectedItem() == "Económicos") {

            costoIva = (float) (costo + (costo * 0.13));
        }

        return costoIva;

    }

}
